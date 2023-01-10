package com.example.hw_8_month_3.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.hw_8_month_3.databinding.FragmentBuyBinding

class BuyFragment : Fragment() {

    lateinit var binding: FragmentBuyBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBuyBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        when (val text = arguments?.getString("common_key")) {
            "Drinks" -> binding.text.text = text
            "Pizza" -> binding.text.text = text
            "Sushi" -> binding.text.text = text
        }
    }
}

