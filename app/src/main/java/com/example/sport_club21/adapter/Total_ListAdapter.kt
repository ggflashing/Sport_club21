package com.example.sport_club21.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.sport_club21.ItemInterface
import com.example.sport_club21.databinding.ItemTotalListBinding
import com.example.sport_club21.databinding.ItemTrenerBinding
import com.example.sport_club21.models.Item_compiex
import com.example.sport_club21.models.Trener

class Total_ListAdapter(var context: Context, var list:ArrayList<Item_compiex>):
    RecyclerView.Adapter<Total_ListAdapter.ViewHolder>(){


    lateinit var binding: ItemTotalListBinding

    private var selected_list= arrayListOf<Item_compiex>()

    private lateinit var clickInterface:ItemInterface

    fun setOnClickListener(clickInterface: ItemInterface){
        this.clickInterface= clickInterface
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Total_ListAdapter.ViewHolder {
        binding = ItemTotalListBinding
            .inflate(LayoutInflater.from(context), parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: Total_ListAdapter.ViewHolder, position: Int) {
        list?.let {
            holder.onBind(it?.get(position)!!)
        }
    }



    override fun getItemCount(): Int {
        return list!!.size
    }

    inner class ViewHolder (binding: ItemTotalListBinding):RecyclerView.ViewHolder(binding.root) {
        fun onBind(Item_complex: Item_compiex) {
            binding.apply {
                title.text= Item_complex.title
                description.text= Item_complex.description
                Item_complex.image1.let { image1.setImageResource(it!!) }
                Item_complex.image2.let { image2.setImageResource(it!!) }
            }
            binding.btnAdd.setOnClickListener{
                clickInterface.onItemClickListener(Item_complex)
            }



        }


    }
}

