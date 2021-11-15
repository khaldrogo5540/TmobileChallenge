package com.example.tmobilechallenge.model

import retrofit2.Response
import retrofit2.http.GET
interface API {
    @GET("test/home")
    suspend fun getCards():Response<PageResponse>

}