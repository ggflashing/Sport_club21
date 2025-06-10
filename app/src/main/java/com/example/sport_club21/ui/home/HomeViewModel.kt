package com.example.sport_club21.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.sport_club21.models.Item_compiex

class HomeViewModel : ViewModel() {

    val abonement = MutableLiveData<String> ()

    val favor_list = MutableLiveData<ArrayList<Item_compiex>>()

    fun onAbonementClick(st:String){
        abonement.value = st
    }

    fun putFavorList (list:ArrayList<Item_compiex>){
        favor_list.value = list
    }
}