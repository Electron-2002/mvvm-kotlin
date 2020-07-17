package com.example.kotlinmvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlinmvvm.adapters.TransactionAdapter
import com.example.kotlinmvvm.databinding.ActivityMainBinding
import com.example.kotlinmvvm.models.Transaction
import com.example.kotlinmvvm.viewmodels.MainActivityViewModel
import java.util.ArrayList


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var transactionList: List<Transaction>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.moneyTransferHistory.layoutManager = LinearLayoutManager(this)
        binding.moneyTransferHistory.setHasFixedSize(true)

        val viewmodel = ViewModelProviders.of(this).get(MainActivityViewModel::class.java)

        viewmodel.init()
        viewmodel.getTransactions().observe(this, Observer {
            transactionList = it

            val adapter = TransactionAdapter(transactionList as ArrayList<Transaction>)

            binding.moneyTransferHistory.adapter = adapter
        })

    }
}