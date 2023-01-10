package com.example.hw_8_month_3.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.hw_8_month_3.R
import com.example.hw_8_month_3.databinding.FragmentDrinksBinding


class DrinksFragment : Fragment() {

    lateinit var binding: FragmentDrinksBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDrinksBinding.inflate(layoutInflater)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val name = "Drinks"

        val drink = Bundle()
        drink.putString("common_key", name)

        binding.buy.setOnClickListener{
            findNavController().navigate(R.id.action_drinksFragment_to_buyFragment,drink)
        }
    }

}