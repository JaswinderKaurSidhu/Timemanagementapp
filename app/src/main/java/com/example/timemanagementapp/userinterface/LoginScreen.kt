package com.example.timemanagementapp.userinterface

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.timemanagementapp.R

@Composable
fun LoginScreen(onLoginSuccess: () -> Unit) {

    var username by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var age by remember { mutableStateOf("") }

    val primaryGreen = Color(0xFF4CAF50)

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
                .background(primaryGreen),
            contentAlignment = Alignment.Center
        ) {
            Text("STUDY AND TIME MANAGEMENT", color = Color.White, fontSize = 18.sp, fontWeight = FontWeight.Bold)
        }

        Spacer(modifier = Modifier.height(24.dp))

        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "Profile Icon",
            modifier = Modifier.size(120.dp)
        )

        Text("Profile", fontSize = 18.sp, color = Color.DarkGray)

        Spacer(modifier = Modifier.height(24.dp))

        OutlinedTextField(value = username, onValueChange = { username = it }, label = { Text("Enter Username") })
        OutlinedTextField(value = email, onValueChange = { email = it }, label = { Text("Enter Email") })
        OutlinedTextField(value = age, onValueChange = { age = it }, label = { Text("Enter Age") })

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = { onLoginSuccess() },
            colors = ButtonDefaults.buttonColors(containerColor = primaryGreen)
        ) {
            Text("Login", color = Color.White)
        }
    }
}
