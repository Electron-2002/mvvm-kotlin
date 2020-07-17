package com.example.kotlinmvvm.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kotlinmvvm.models.Transaction
import com.example.kotlinmvvm.repositories.TransactionRepository

class MainActivityViewModel : ViewModel() {

    private var transactions = MutableLiveData<List<Transaction>>()

    fun getTransactions(): LiveData<List<Transaction>> = transactions

    fun init() {

        val transactionList = TransactionRepository().getTransactions()

        transactions.value = transactionList
    }


}