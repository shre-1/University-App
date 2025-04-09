package com.example.petcareassessment.data.model

data class DashboardResponse(
    val entities: List<Entity>,
    val entityTotal: Int
)

data class Entity(
    val property1: String,
    val property2: String,
    val description: String
) : java.io.Serializable // Serializable for Intent passing