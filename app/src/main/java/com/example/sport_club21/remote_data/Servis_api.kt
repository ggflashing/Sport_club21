package com.example.sport_club21.remote_data

import com.example.sport_club21.models.Sport_player
import retrofit2.Call
import retrofit2.http.GET

interface Servis_api {
    @GET("/tennis/?&met=Standings&league=ATP&APIkey=8e69ad2ca5bb60ce0ba1ffbb85c9ab9e8ac12aedc530594ce863d667c8af6766")
    fun getData(): Call<List<Sport_player>>
}