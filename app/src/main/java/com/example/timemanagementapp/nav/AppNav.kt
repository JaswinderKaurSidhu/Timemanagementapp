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

        // ✅ Welcome Screen
        composable("welcome") {
            Welcome(onGetStarted = {
                navController.navigate("login")
            })
        }

        // ✅ Login Screen
        composable("login") {
            LoginScreen(
                onLoginSuccess = { navController.navigate("dashboard") },
                onBackToWelcome = { navController.popBackStack() }
            )
        }

        // ✅ Dashboard Screen (NEW)
        composable("dashboard") {
            DashboardScreen(
                onNavigateToAdd = { /* add later */ },
                onNavigateToSettings = { /* settings later */ }
            )
        }
    }
}
