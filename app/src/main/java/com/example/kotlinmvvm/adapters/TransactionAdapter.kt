package com.example.kotlinmvvm.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinmvvm.R
import com.example.kotlinmvvm.models.Transaction
import com.example.kotlinmvvm.viewholders.TransactionViewholder
import java.util.ArrayList

class TransactionAdapter(private val transactionList: ArrayList<Transaction>) : RecyclerView.Adapter<TransactionViewholder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransactionViewholder {

        val v = LayoutInflater.from(parent.context).inflate(R.layout.history_list_item, parent, false)
        return TransactionViewholder(v)

    }

    override fun getItemCount(): Int {
        return transactionList.size
    }

    override fun onBindViewHolder(holder: TransactionViewholder, position: Int) {

        val transaction: Transaction = transactionList[position]

        holder.textViewName.text = transaction.name
        holder.textViewStatus.text = transaction.status

    }

}