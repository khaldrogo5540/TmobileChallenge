package com.example.tmobilechallenge

import com.example.tmobilechallenge.repository.Repository
import com.example.tmobilechallenge.viewmodel.CardViewModel
import org.junit.Before
import org.junit.Test

class CardViewModelTest {
    private lateinit var subject: CardViewModel
    private lateinit var mockRepository: Repository

    @Before
    fun setup(){
        subject = CardViewModel(mockRepository)
    }

}