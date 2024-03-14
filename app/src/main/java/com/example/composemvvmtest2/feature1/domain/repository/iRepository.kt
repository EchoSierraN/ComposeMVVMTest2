package com.example.composemvvmtest2.feature1.domain.repository

import com.example.composemvvmtest2.feature1.domain.model.User

interface iRepository {
    suspend fun getData() : List<User>
}