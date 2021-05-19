package com.example.track_me.network

import com.example.track_me.utils.Constant
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClass {

    private val retrofit by lazy  {
        Retrofit.Builder()
            .baseUrl(Constant.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    val apiInterface: ApiInterface by lazy {
        retrofit.create(ApiInterface::class.java)
    }
}