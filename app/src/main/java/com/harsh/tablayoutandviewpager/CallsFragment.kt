package com.harsh.tablayoutandviewpager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.harsh.tablayoutandviewpager.adapters.CallsAdapter
import com.harsh.tablayoutandviewpager.databinding.FragmentCallsBinding
import com.harsh.tablayoutandviewpager.databinding.FragmentUpdatesBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class CallsFragment : Fragment() {
lateinit var binding: FragmentCallsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCallsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val callList : MutableList<CallInfo> = mutableListOf()
        callList.add(CallInfo("Juan","3:39 AM"))
        callList.add(CallInfo("Ron","9:02 PM"))
        callList.add(CallInfo("Hermioni","8:00 AM"))
        callList.add(CallInfo("Kristen","7:49 PM"))
        callList.add(CallInfo("Jazz","6:00 AM"))
        callList.add(CallInfo("Robert","2:00 PM"))
        callList.add(CallInfo("Peter","12:00 AM"))
        callList.add(CallInfo("Harry","10:39 AM"))
        callList.add(CallInfo("Spencer","4:26 PM"))
        callList.add(CallInfo("Michelle","5:50 AM"))
        binding.rvCalls.adapter = CallsAdapter(callList)
        binding.rvCalls.layoutManager = LinearLayoutManager(requireContext())
    }

    companion object {

    }
}