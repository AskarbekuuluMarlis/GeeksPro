package com.example.geekspro

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.geekspro.databinding.FragmentCarRecycleViewBinding

class Car_Recycle_view : Fragment() {

    lateinit var binding: FragmentCarRecycleViewBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCarRecycleViewBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
        initlistener()
    }



    private fun initAdapter() {
        val adapter = CarAdapter(
            arrayListOf(
                Car("BMW",1988,"https://images.unsplash.com/photo-1441148345475-03a2e82f9719?fm=jpg&q=60&w=3000&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8Y2FyJTIwd2FsbHBhcGVyfGVufDB8fDB8fHww"),
                Car("BMW",1988,"https://images.unsplash.com/photo-1441148345475-03a2e82f9719?fm=jpg&q=60&w=3000&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8Y2FyJTIwd2FsbHBhcGVyfGVufDB8fDB8fHww"),
                Car("BMW",1988,"https://images.unsplash.com/photo-1441148345475-03a2e82f9719?fm=jpg&q=60&w=3000&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8Y2FyJTIwd2FsbHBhcGVyfGVufDB8fDB8fHww"),
                Car("BMW",1988,"https://images.unsplash.com/photo-1441148345475-03a2e82f9719?fm=jpg&q=60&w=3000&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8Y2FyJTIwd2FsbHBhcGVyfGVufDB8fDB8fHww"),
                Car("BMW",1988,"https://images.unsplash.com/photo-1441148345475-03a2e82f9719?fm=jpg&q=60&w=3000&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8Y2FyJTIwd2FsbHBhcGVyfGVufDB8fDB8fHww"),
                Car("BMW",1988,"https://images.unsplash.com/photo-1441148345475-03a2e82f9719?fm=jpg&q=60&w=3000&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8Y2FyJTIwd2FsbHBhcGVyfGVufDB8fDB8fHww"),
                Car("BMW",1988,"https://images.unsplash.com/photo-1441148345475-03a2e82f9719?fm=jpg&q=60&w=3000&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8Y2FyJTIwd2FsbHBhcGVyfGVufDB8fDB8fHww"),
                Car("BMW",1988,"https://images.unsplash.com/photo-1441148345475-03a2e82f9719?fm=jpg&q=60&w=3000&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8Y2FyJTIwd2FsbHBhcGVyfGVufDB8fDB8fHww"),
                Car("BMW",1988,"https://images.unsplash.com/photo-1441148345475-03a2e82f9719?fm=jpg&q=60&w=3000&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8Y2FyJTIwd2FsbHBhcGVyfGVufDB8fDB8fHww"),
            )
        )
        binding.recycleView.adapter = adapter
    }
    private fun initlistener() {
    binding.recycleView.setOnClickListener{
        findNavController().navigate(action)
    }
    }

}