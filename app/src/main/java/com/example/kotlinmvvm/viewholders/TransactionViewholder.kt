package com.example.kotlinmvvm.viewholders

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinmvvm.R
import kotlinx.android.synthetic.main.history_list_item.*

class TransactionViewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    public val textViewName = itemView.findViewById(R.id.transaction_name) as TextView
    public val textViewStatus = itemView.findViewById(R.id.transaction_status) as TextView

}