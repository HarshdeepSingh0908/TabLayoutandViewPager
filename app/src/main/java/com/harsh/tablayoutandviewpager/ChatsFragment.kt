package com.harsh.tablayoutandviewpager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.harsh.tablayoutandviewpager.adapters.ChatAdapter
import com.harsh.tablayoutandviewpager.databinding.FragmentChatsBinding


class ChatsFragment : Fragment() {
    lateinit var binding: FragmentChatsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentChatsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val chatList : MutableList<ChatInfo> = mutableListOf()
        chatList.add(ChatInfo("Harsh","Hey! whats the plan today"))
        chatList.add(ChatInfo("Michael","Are you coming this weekend?"))
        chatList.add(ChatInfo("Sam","Have you done the assignment?"))
        chatList.add(ChatInfo("Rohan","You need to see this"))
        binding.rvRecyclerView.adapter = ChatAdapter(chatList)
        binding.rvRecyclerView.layoutManager = LinearLayoutManager(requireContext())

    }

    companion object {

    }
}