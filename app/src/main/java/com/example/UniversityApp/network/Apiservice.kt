package com.example.UniversityApp.network

mport com.example.petcareassessment.model.LoginRequest
import com.example.petcareassessment.model.LoginResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    @POST("v1/account/login") // Update this if your endpoint differs
    suspend fun login(@Body request: LoginRequest): Response<LoginResponse>
}