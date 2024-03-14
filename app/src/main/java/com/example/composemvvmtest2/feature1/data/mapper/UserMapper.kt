package com.example.composemvvmtest2.feature1.data.mapper

import com.example.composemvvmtest2.feature1.data.remote.UserDTO
import com.example.composemvvmtest2.feature1.domain.model.User

fun UserDTO.toUser() : User {
    return User(
        name = name ?: ""
    )
}