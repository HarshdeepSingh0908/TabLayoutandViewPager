package com.harsh.tablayoutandviewpager.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.harsh.tablayoutandviewpager.R
import com.harsh.tablayoutandviewpager.UpdateInfo

class UpdatesAdapter(var updateList : List<UpdateInfo>) : RecyclerView.Adapter<UpdateViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UpdateViewHolder {
      val inflater : LayoutInflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.status_item,parent,false)
        return UpdateViewHolder(view)
    }

    override fun getItemCount(): Int {
        return updateList.size
    }

    override fun onBindViewHolder(holder: UpdateViewHolder, position: Int) {
        holder.personName.text = updateList[position].personName
        holder.time.text = updateList[position].time
    }
}

class UpdateViewHolder(view : View) : RecyclerView.ViewHolder(view){
var personName = view.findViewById<TextView>(R.id.personName)
var time = view.findViewById<TextView>(R.id.updatesTime)
}
