package com.app.roomexample.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class User (
    @PrimaryKey(autoGenerate = true)
    val id: Int, // Id пользователя
    val Name: String, // Имя пользователя
    val Password: String, // Пароль пользователя
    val Email: String, // Email пользователя
)