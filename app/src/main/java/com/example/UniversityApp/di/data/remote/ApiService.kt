package com.example.UniversityApp.di.data.remote

import com.example.UniversityApp.data.model.AuthResponse
import com.example.UniversityApp.data.model.DashboardResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface ApiService {
    @POST("footscray/auth") // Adjust to your class location (e.g., sydney/auth, ort/auth)
    suspend fun login(@Body credentials: Map<String, String>): Response<AuthResponse>

    @GET("dashboard/{keypass}")
    suspend fun getDashboard(@Path("keypass") keypass: String): Response<DashboardResponse>
}