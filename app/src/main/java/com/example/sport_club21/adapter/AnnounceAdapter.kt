package com.example.sport_club21.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sport_club21.databinding.ItemAnnounceBinding
import com.example.sport_club21.models.Announce

class AnnounceAdapter (var context: Context, var list: ArrayList<Announce>):RecyclerView.Adapter<AnnounceAdapter.ViewHolder>(){
    private lateinit var binding: ItemAnnounceBinding


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnnounceAdapter.ViewHolder {
        binding = ItemAnnounceBinding
            .inflate(LayoutInflater.from(context), parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AnnounceAdapter.ViewHolder, position: Int) {
        holder.onBind(list.get(position))
    }

    override fun getItemCount():Int {
        return list.size
    }

   inner class ViewHolder (binding: ItemAnnounceBinding):RecyclerView.ViewHolder(binding.root) {
        fun onBind(announce: Announce) {
            binding.apply {
            cardImage.setImageResource(announce.image)
            cardTimeText.text = announce.title
            cardDay.text = announce.time
            cardTime.text = announce.day
            }


        }


    }


}