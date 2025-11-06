package com.example.timemanagementapp.userinterface

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle

@Composable
fun LoginScreen(
    onLoginSuccess: () -> Unit,
    onBackToWelcome: () -> Unit
) {
    val primaryGreen = Color(0xFF4CAF50)
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        // 🟩 Top Bar
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
                .background(primaryGreen),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "STUDY AND TIME MANAGEMENT",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
        }

        Spacer(modifier = Modifier.height(24.dp))

        // 🧍 Profile Avatar
        Image(
            imageVector = Icons.Filled.AccountCircle,
            contentDescription = "Profile",
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape)
        )

        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Profile", fontWeight = FontWeight.SemiBold, fontSize = 18.sp)

        Spacer(modifier = Modifier.height(20.dp))

        // ✉️ Email
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Enter Email") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 32.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        // 🔒 Password
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Enter Password") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 32.dp)
        )

        Spacer(modifier = Modifier.height(8.dp))

        TextButton(onClick = { /* TODO: Forgot password action */ }) {
            Text("Forgot password?", color = Color.Gray)
        }

        Spacer(modifier = Modifier.height(12.dp))

        // 🔘 Login Button
        Button(
            onClick = onLoginSuccess,
            colors = ButtonDefaults.buttonColors(containerColor = primaryGreen),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 32.dp)
                .height(48.dp)
        ) {
            Text("Login", color = Color.White, fontSize = 18.sp)
        }

        Spacer(modifier = Modifier.height(8.dp))

        TextButton(onClick = { /* TODO: Sign-Up */ }) {
            Text("Sign Up", color = primaryGreen)
        }

        Spacer(modifier = Modifier.weight(1f))

        // 🟩 Bottom Navigation Bar
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(65.dp)
                .background(primaryGreen),
            contentAlignment = Alignment.Center
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 32.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                TextButton(onClick = onBackToWelcome) {
                    Text("⬅️", color = Color.White, fontSize = 22.sp)
                }
                TextButton(onClick = onLoginSuccess) {
                    Text("➡️", color = Color.White, fontSize = 22.sp)
                }
            }
        }
    }
}
