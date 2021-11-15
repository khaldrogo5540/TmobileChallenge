package com.example.tmobilechallenge.repository

import com.example.tmobilechallenge.model.API
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class RepositoryImpl (private val service: API): Repository {
    override fun getCards(): Flow<UIState>{
        return flow{
            emit(UIState.Loading())

            val response = service.getCards()

            if (response.isSuccessful && response.body() != null){
                emit(UIState.Loading(false))
                delay(500)
                emit(UIState.Response(response.body()?: throw Exception("Body is null")))
            } else{
                emit(UIState.Loading(false))
                emit(UIState.Error("Server Error"))
            }
        }
    }
}