package com.example.universityapp.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavGraph(
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") {
            HomeScreen(navController)
        }
        composable("students") {
            StudentsScreen()
        }
        composable("courses") {
            CoursesScreen()
        }
        composable("grades") {
            GradesScreen()
        }
    }
}

@Composable
fun GradesScreen() {
    TODO("Not yet implemented")
}

@Composable
fun CoursesScreen() {
    TODO("Not yet implemented")
}

@Composable
fun StudentsScreen() {
    TODO("Not yet implemented")
}

@Composable
fun HomeScreen(x0: NavHostController) {
    TODO("Not yet implemented")
}