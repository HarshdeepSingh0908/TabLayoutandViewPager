package com.harsh.tablayoutandviewpager.adapters

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.harsh.tablayoutandviewpager.ChatInfo
import com.harsh.tablayoutandviewpager.R
import java.util.zip.Inflater

class ChatAdapter(var chatList : List<ChatInfo>) : RecyclerView.Adapter<ChatViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
        val inflater : LayoutInflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.chat_item,parent,false)
        return ChatViewHolder(view)
    }

    override fun getItemCount(): Int {
       return chatList.size
    }

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {
       holder.personName.text = chatList[position].personName
       holder.chatMessage.text = chatList[position].chatMessage
    }
}
class ChatViewHolder(view : View) : RecyclerView.ViewHolder(view){
    val personName = view.findViewById<TextView>(R.id.personName)
    val chatMessage = view.findViewById<TextView>(R.id.chatMessage)
}