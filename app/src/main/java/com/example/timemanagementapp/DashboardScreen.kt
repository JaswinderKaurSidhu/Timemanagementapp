package com.example.timemanagementapp.userinterface

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.Composable
import androidx.compose.foundation.clickable


@Composable
fun DashboardScreen(onNavigateToAdd: () -> Unit, onNavigateToSettings: () -> Unit) {

    val primaryGreen = Color(0xFF4CAF50) // ✅ USE THE SAME COLOR YOU ALREADY USED

    Column(
        Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {

        // ✅ Top Green Bar with Search
        Box(
            Modifier
                .fillMaxWidth()
                .background(primaryGreen)
                .padding(16.dp)
        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(20.dp))
                    .background(Color.White)
                    .padding(12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("☰", fontSize = 20.sp)
                Spacer(modifier = Modifier.width(10.dp))
                Text("Search Bar", color = Color.Gray)
            }
        }

        Spacer(modifier = Modifier.height(40.dp))

        // ✅ Circular Progress
        Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxWidth()) {
            CircularProgressIndicator(
                progress = 0.30f,
                color = primaryGreen,
                strokeWidth = 6.dp,
                modifier = Modifier.size(150.dp)
            )
            Text("30%", fontSize = 22.sp, fontWeight = FontWeight.Bold)
        }

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            "Progress",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        Text(
            "5 tasks completed",
            color = Color.Gray,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        Spacer(modifier = Modifier.height(30.dp))

        // ✅ Exam Countdown Card
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFEFEFEF)),
            shape = RoundedCornerShape(12.dp)
        ) {
            Column(
                modifier = Modifier.padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("Exam Countdown", fontWeight = FontWeight.Bold, fontSize = 18.sp)
                Text("28 Days left", fontSize = 14.sp, color = Color.Gray)
            }
        }

        Spacer(modifier = Modifier.weight(1f))

        // ✅ Bottom Navigation Bar
        Row(
            Modifier
                .fillMaxWidth()
                .background(primaryGreen)
                .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text("➕", fontSize = 26.sp, modifier = Modifier.clickable { onNavigateToAdd() })
            Text("📄", fontSize = 26.sp)
            Text("⚙️", fontSize = 26.sp, modifier = Modifier.clickable { onNavigateToSettings() })
        }
    }
}
