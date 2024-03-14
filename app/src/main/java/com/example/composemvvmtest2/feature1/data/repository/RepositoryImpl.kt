package com.example.composemvvmtest2.feature1.data.repository

import com.example.composemvvmtest2.feature1.data.mapper.toUser
import com.example.composemvvmtest2.feature1.data.remote.API
import com.example.composemvvmtest2.feature1.domain.model.User
import com.example.composemvvmtest2.feature1.domain.repository.iRepository

class RepositoryImpl(
    val api: API
): iRepository {
    override suspend fun getData(): List<User> {
        return api.getData().map { it.toUser() }
    }

}