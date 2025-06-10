package com.example.sport_club21.adapter

import android.content.Context
import android.media.RouteListingPreference.Item
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sport_club21.databinding.ItemTrenerBinding
import com.example.sport_club21.models.Sport_player
import com.example.sport_club21.models.Trener

class Sport_player_adapter(var context: Context, var list:ArrayList<Sport_player>):
    RecyclerView.Adapter<TrenerAdapter.ViewHolder>(){


    lateinit var binding:

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrenerAdapter.ViewHolder {
        binding = ItemTrenerBinding
            .inflate(LayoutInflater.from(context), parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TrenerAdapter.ViewHolder, position: Int) {
        holder.onBind(list.get(position))
    }



    override fun getItemCount(): Int {
        return list.size
    }

    inner class ViewHolder (binding: ItemTrenerBinding): RecyclerView.ViewHolder(binding.root) {
        fun onBind(trener: Trener) {
            binding.imageCategory.setImageResource(trener.image)
            binding.trener. = trener.name



        }


    }
}