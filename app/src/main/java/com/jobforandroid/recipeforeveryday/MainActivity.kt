package com.jobforandroid.recipeforeveryday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jobforandroid.recipeforeveryday.R
import com.jobforandroid.recipeforeveryday.fragments.RecipeFragment
import com.jobforandroid.recipeforeveryday.utils.FragmentManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        FragmentManager.setFragment(RecipeFragment.newInstance(),this)
    }
}