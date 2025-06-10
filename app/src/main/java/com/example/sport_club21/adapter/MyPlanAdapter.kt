package com.example.sport_club21.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sport_club21.databinding.ItemAnnounceBinding
import com.example.sport_club21.databinding.ItemMyPlanBinding
import com.example.sport_club21.models.Item_compiex

class MyPlanAdapter (var context: Context, var list:ArrayList<Item_compiex>)
    :RecyclerView.Adapter<MyPlanAdapter.ViewHolder>() {

        private lateinit var binding:ItemMyPlanBinding


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyPlanAdapter.ViewHolder {
        binding = ItemMyPlanBinding
            .inflate(LayoutInflater.from(context), parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyPlanAdapter.ViewHolder, position: Int) {
        list?.let {
            holder.onBind(it?.get(position)!!)
        }

    }



    override fun getItemCount(): Int {
        return list!!.size
    }

    inner class ViewHolder(binding: ItemMyPlanBinding):RecyclerView.ViewHolder(binding.root) {
        fun onBind(itemComplex: Item_compiex) {
            binding.apply {
                title.text = itemComplex.title
                description.text = itemComplex.title
                itemComplex.image1?.let {
                    image1.setImageResource(it)
                    itemComplex.image2?.let { image1.setImageResource(it) }

                }
            }
        }
    }
}