package com.example.kotlinmvvm.repositories

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.kotlinmvvm.models.Transaction
import java.util.ArrayList

class TransactionRepository {

    private var transactionList = ArrayList<Transaction>()

    fun getTransactions(): List<Transaction> {

        setTransactions()

        return transactionList

    }

    private fun setTransactions() {

        transactionList.add(Transaction("Mr. Jethalal Gada", "Sent"))
        transactionList.add(Transaction("Mr. Tipendra Gada", "Received"))
        transactionList.add(Transaction("Mr. Sunderlal", "Received"))
        transactionList.add(Transaction("Mr. Champaklal Gada", "Sent"))
        transactionList.add(Transaction("Mrs. Daya Gada", "Received"))

    }

}