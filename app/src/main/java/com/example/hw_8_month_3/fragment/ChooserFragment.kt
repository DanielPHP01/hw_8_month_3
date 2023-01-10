package com.example.hw_8_month_3.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.hw_8_month_3.R
import com.example.hw_8_month_3.databinding.FragmentChooserBinding


class ChooserFragment : Fragment() {

    lateinit var binding: FragmentChooserBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentChooserBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.pizza.setOnClickListener {
            findNavController().navigate(R.id.action_chooserFragment_to_pizzaFragment)
        }
        binding.sushi.setOnClickListener {
            findNavController().navigate(R.id.action_chooserFragment_to_sushiFragment)
        }
        binding.drink.setOnClickListener {
            findNavController().navigate(R.id.action_chooserFragment_to_drinksFragment)
        }
    }
}
