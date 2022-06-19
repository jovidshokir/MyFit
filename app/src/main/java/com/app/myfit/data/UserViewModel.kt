package com.app.myfit.data

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class UserViewModel(application: Application): AndroidViewModel(application) {
    private val readAllData: LiveData<List<User>>
    private val repo: UserRepo

    init {
        val UserDao = UserDatabase.getDatabase(application).userDao()
        repo = UserRepo(UserDao)
        readAllData = repo.readAllData
    }

    fun addUser(user: User){
        viewModelScope.launch(Dispatchers.IO) {
            repo.addUser(user)
        }
    }
}