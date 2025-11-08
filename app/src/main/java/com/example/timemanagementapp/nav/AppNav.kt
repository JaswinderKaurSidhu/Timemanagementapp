package com.example.timemanagementapp.nav

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.timemanagementapp.userinterface.Welcome
import com.example.timemanagementapp.userinterface.LoginScreen
import com.example.timemanagementapp.userinterface.DashboardScreen

@Composable
fun AppNav() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "welcome"
    ) {
        composable("welcome") {
            Welcome(
                onGetStarted = { navController.navigate("login") }
            )
        }

        composable("login") {
            LoginScreen(
                onLoginSuccess = { navController.navigate("dashboard") }
            )
        }

        composable("dashboard") {
            DashboardScreen()
        }
    }
}
