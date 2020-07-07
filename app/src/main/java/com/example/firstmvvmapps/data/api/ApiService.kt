package com.example.firstmvvmapps.data.api

import com.example.firstmvvmapps.data.model.User
import io.reactivex.Single

interface ApiService {

    fun getUsers(): Single<List<User>>

}
