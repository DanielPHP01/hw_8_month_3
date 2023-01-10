package com.example.hw_8_month_3.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.hw_8_month_3.R
import com.example.hw_8_month_3.databinding.FragmentPizzaBinding


class PizzaFragment : Fragment() {

    lateinit var binding: FragmentPizzaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPizzaBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val name = "Pizza"

        val pizza = Bundle()
        pizza.putString("common_key", name)

        binding.buy.setOnClickListener {
            findNavController().navigate(R.id.action_pizzaFragment_to_buyFragment, pizza)
        }
    }
}