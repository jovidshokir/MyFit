package com.app.myfit.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
data class User (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val f: String,
    val i: String,
    val age: Int,
)