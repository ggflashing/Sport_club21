package com.example.sport_club21.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.sport_club21.databinding.ItemFoodBinding
import com.example.sport_club21.models.Food

class FoodAdapter (var context: Context, var list:ArrayList<Food>):
    RecyclerView.Adapter<FoodAdapter.ViewHolder>(){
        lateinit var binding:ItemFoodBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding = ItemFoodBinding
            .inflate(LayoutInflater.from(context), parent,false)
        return ViewHolder(binding)
    }



    override fun onBindViewHolder(holder: FoodAdapter.ViewHolder, position: Int) {
        list.get(position).let {
            holder.onBind(it)
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class ViewHolder(binding:ItemFoodBinding):RecyclerView.ViewHolder(binding.root) {
        fun onBind(food: Food) {
            binding.cardTitle.text = food.title
            binding.cardImage.setImageResource(food.image)
            binding.cardPrice.text= food.price as String
            binding.cardDesc.text = food.desc

        }

    }




}

