package com.example.firstmvvmapps.data.repository

import com.example.firstmvvmapps.data.api.ApiHelper
import com.example.firstmvvmapps.data.model.User
import io.reactivex.Single

class MainRepository(private val apiHelper: ApiHelper) {

    fun getUsers(): Single<List<User>> {
        return apiHelper.getUsers()
    }

}
