package com.example.petcareassessment.data.repository

import com.example.petcareassessment.data.model.AuthResponse
import com.example.petcareassessment.data.model.DashboardResponse
import com.example.petcareassessment.data.remote.ApiService
import javax.inject.Inject

class AuthRepository @Inject constructor(
    private val apiService: ApiService
) {
    suspend fun login(username: String, password: String): Result<AuthResponse> {
        return try {
            val response = apiService.login(mapOf("username" to username, "password" to password))
            if (response.isSuccessful) {
                Result.success(response.body()!!)
            } else {
                Result.failure(Exception("Login failed: ${response.message()}"))
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    suspend fun getDashboard(keypass: String): Result<DashboardResponse> {
        return try {
            val response = apiService.getDashboard(keypass)
            if (response.isSuccessful) {
                Result.success(response.body()!!)
            } else {
                Result.failure(Exception("Dashboard fetch failed: ${response.message()}"))
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}