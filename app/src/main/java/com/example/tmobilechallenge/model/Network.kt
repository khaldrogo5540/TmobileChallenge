package com.example.tmobilechallenge.model

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object Network {

    private val api:API by lazy{
        initRetrofit()
    }

    private fun initRetrofit(): API{
        val client = getClient()
        val service = Retrofit.Builder()

        return service.baseUrl("https://private-8ce77c-tmobiletest.apiary-mock.com/")
            .client(client)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
            .create(API::class.java)
    }

    private fun getClient(): OkHttpClient{
        return OkHttpClient.Builder().build()
    }

    fun getService() = api
}