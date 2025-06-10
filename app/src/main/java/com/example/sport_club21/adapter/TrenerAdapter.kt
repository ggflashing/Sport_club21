package com.example.sport_club21.adapter

import android.content.Context
import android.icu.text.Transliterator.Position
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sport_club21.databinding.ItemTrenerBinding
import com.example.sport_club21.models.Announce
import com.example.sport_club21.models.Food
import com.example.sport_club21.models.Trener

class TrenerAdapter(var context: Context, var list:ArrayList<Trener>):
RecyclerView.Adapter<TrenerAdapter.ViewHolder>(){
    lateinit var binding: ItemTrenerBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrenerAdapter.ViewHolder {
        binding = ItemTrenerBinding.inflate(LayoutInflater.from(context),parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TrenerAdapter.ViewHolder, position: Int) {
        list.get(position).let {
            holder.onBind(it)
        }
    }



    override fun getItemCount():Int{
        return list.size
    }

    inner class ViewHolder (binding: ItemTrenerBinding):RecyclerView.ViewHolder(binding.root) {
        fun onBind(trener: Trener) {
            binding.imageCategory.setImageResource(trener.image)
            binding.trener.text = trener.name
            binding.trener.text = trener.desc



        }


    }
}