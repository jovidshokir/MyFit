package com.app.roomexample.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "exercises")
class Exercise (
    @PrimaryKey(autoGenerate = true)
    val id: Int, // Id упражнения
    val Name: String, // Наименование упражнения
    val Descriptions: String, // Описание упражнения
)