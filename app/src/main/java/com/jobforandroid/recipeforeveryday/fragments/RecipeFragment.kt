package com.jobforandroid.recipeforeveryday.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jobforandroid.recipeforeveryday.R
import com.jobforandroid.recipeforeveryday.databinding.FragmentRecipeBinding


class RecipeFragment : Fragment() {

    private lateinit var binding: FragmentRecipeBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRecipeBinding.inflate(inflater, container, false)
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = RecipeFragment()
    }
}