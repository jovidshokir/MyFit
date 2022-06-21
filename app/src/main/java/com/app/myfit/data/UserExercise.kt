package com.app.roomexample.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_exercise")
data class UserExercise (
    @PrimaryKey(autoGenerate = true)
    val id: Int, // Id записи
    val exercise_id: Int, // Id упражнения
    val date_start: Int, // Время начала выполнения упражнения(UNIX-time)
    val date_stop: Int, // Время окончания выполнения упражнения(UNIX-time)
    val time_stop: Int, // Время на паузы(в секундах)
)