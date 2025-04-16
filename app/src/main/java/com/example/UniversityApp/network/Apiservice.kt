package com.example.UniversityApp.network

import Model.LoginRequest
import Model.LoginResponse
import com.example.UniversityApp.ui.dashboard.DashboardViewModel.DashboardResponse

interface ApiService {

    @POST("login")
    suspend fun login(@Body request: LoginRequest): LoginResponse

    @GET("dashboard")
    suspend fun getDashboard(): DashboardResponse
}

annotation class GET(val string: String)

annotation class Body

