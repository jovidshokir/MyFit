package com.app.roomexample.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "weight")
data class Weight (
    @PrimaryKey(autoGenerate = true)
    val id: Int, // Id записи
    val User_Id: String, // Id пользователя
    val Weight: String, // Вес
    val Date: String, // Дата (UNIX-time)
)