package com.jobforandroid.recipeforeveryday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jobforandroid.recipeforeveryday.adapters.Food
import com.jobforandroid.recipeforeveryday.adapters.FoodAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var foodList: ArrayList<Food>
    private lateinit var foodAdapter: FoodAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recyclerView = findViewById(R.id.recyclerViewKitchen)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        foodList = ArrayList()

       foodList.add(Food("Кухня для Дачи", R.drawable.country_kitchen ))
       foodList.add(Food("Кухня для Здорового Питания", R.drawable.healthy_eating_kitchen))
       foodList.add(Food("Кухня для Спортсменов", R.drawable.kitchen_athletes_1))
       foodList.add(Food("Кухня для Студентов", R.drawable.kitchen_students))
       foodList.add(Food("Мясная Кухня", R.drawable.meet_kitchen))
       foodList.add(Food("Национальная Кухня", R.drawable.national_kitchen))
       foodList.add(Food("Кухня для Пикника", R.drawable.picnic_kitchen))
       foodList.add(Food("Веганкая Кухня", R.drawable.vegan_kitchen))

       foodAdapter = FoodAdapter(foodList)
       recyclerView.adapter = foodAdapter

    }
}