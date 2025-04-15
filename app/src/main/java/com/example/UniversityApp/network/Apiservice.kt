package com.example.UniversityApp.network

import Model.LoginRequest
import Model.LoginResponse
import com.google.android.gms.common.api.Response

interface ApiService {
    @POST("v1/account/login")
    suspend fun login(@Body request: LoginRequest)
}

annotation class Body
