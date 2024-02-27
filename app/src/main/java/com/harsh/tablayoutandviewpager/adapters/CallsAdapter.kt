package com.harsh.tablayoutandviewpager.adapters

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.harsh.tablayoutandviewpager.CallInfo
import com.harsh.tablayoutandviewpager.R

class CallsAdapter(var callList: List<CallInfo>) : RecyclerView.Adapter<CallsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CallsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.call_item,parent,false)
        return CallsViewHolder(view)
    }

    override fun getItemCount(): Int {
        return callList.size
    }

    override fun onBindViewHolder(holder: CallsViewHolder, position: Int) {
        holder.personName.text = callList[position].personName
        holder.time.text = callList[position].time
    }
}

class CallsViewHolder(view: View) : RecyclerView.ViewHolder(view) {
val personName = view.findViewById<TextView>(R.id.callPersonName)
val time = view.findViewById<TextView>(R.id.callTime)
}
