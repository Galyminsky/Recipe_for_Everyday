package com.jobforandroid.recipeforeveryday.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.jobforandroid.recipeforeveryday.R


class FoodAdapter (private val foodList: ArrayList<Food>) : RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {

    class FoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView = itemView.findViewById<View>(R.id.kitchen_image) as ImageView
        val textView = itemView.findViewById<View>(R.id.kitchen_name) as TextView


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.kitchen_list_item, parent, false)
        return FoodViewHolder(view)
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val food = foodList[position]
        holder.imageView.setImageResource(food.kitchen_image)
        holder.textView.text = food.kitchen_name
    }

    override fun getItemCount(): Int {
        return foodList.size
    }

}