package com.harsh.tablayoutandviewpager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.harsh.tablayoutandviewpager.adapters.UpdatesAdapter
import com.harsh.tablayoutandviewpager.databinding.FragmentChatsBinding
import com.harsh.tablayoutandviewpager.databinding.FragmentUpdatesBinding


class UpdatesFragment : Fragment() {
lateinit var binding: FragmentUpdatesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = FragmentUpdatesBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var list : MutableList<UpdateInfo> = mutableListOf()
        list.add(UpdateInfo("Vivek","1:23 PM"))
        list.add(UpdateInfo("Sam","9:02 AM"))
        list.add(UpdateInfo("Michael","4:00 PM"))
        list.add(UpdateInfo("Christy","1:49 AM"))
        binding.rvUpdates.adapter = UpdatesAdapter(list)
        binding.rvUpdates.layoutManager = LinearLayoutManager(requireContext())

    }

    companion object {

    }
}