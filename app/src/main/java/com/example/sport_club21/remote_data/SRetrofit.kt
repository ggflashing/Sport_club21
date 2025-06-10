package com.example.sport_club21.remote_data

import android.icu.util.TimeUnit
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.sql.Time

object SRetrofit {
    val logging = HttpLoggingInterceptor();
    val okHttpClient = OkHttpClient().newBuilder()
        .connectTimeout(30, java.util.concurrent.TimeUnit.SECONDS)
        .writeTimeout(30, java.util.concurrent.TimeUnit.SECONDS)
        .addInterceptor(logging)
        .readTimeout(30, java.util.concurrent.TimeUnit.SECONDS)
        .build()

    val builder: Servis_api = Retrofit.Builder()
        .baseUrl("https://apiv2.allsportsapi.com")
        .addConverterFactory(GsonConverterFactory.create())
        .client(okHttpClient)
        .build()
        .create(Servis_api::class.java)



}