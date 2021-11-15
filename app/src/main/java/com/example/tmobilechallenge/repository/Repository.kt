package com.example.tmobilechallenge.repository

import kotlinx.coroutines.flow.Flow

interface Repository {
    fun getCards(): Flow <UIState>
}