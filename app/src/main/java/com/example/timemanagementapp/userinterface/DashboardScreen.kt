package com.example.timemanagementapp.userinterface

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DashboardScreen(
    onBack: () -> Unit,
    onNext: () -> Unit
) {
    val primaryGreen = Color(0xFF4CAF50)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .background(primaryGreen),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Dashboard",
                color = Color.White,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(modifier = Modifier.height(40.dp))
        Box(
            modifier = Modifier
                .size(120.dp)
                .background(Color.Transparent),
            contentAlignment = Alignment.Center
        ) {

            Box(
                modifier = Modifier
                    .size(120.dp)
                    .background(Color(0x334CAF50), CircleShape)
            )

            Text(text = "30%", fontSize = 22.sp, fontWeight = FontWeight.Bold)
        }

        Text(text = "Progress", fontSize = 18.sp, modifier = Modifier.padding(top = 8.dp))
        Text(text = "5 tasks completed", fontSize = 14.sp, color = Color.Gray)

        Spacer(modifier = Modifier.height(40.dp))


        Box(
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .background(Color(0x22000000), shape = CircleShape)
                .padding(vertical = 20.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "Exam Countdown", fontSize = 18.sp, fontWeight = FontWeight.Bold)
                Text(text = "20 Days Left", fontSize = 14.sp, color = Color.Gray)
            }
        }

        Spacer(modifier = Modifier.weight(1f))


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .background(primaryGreen),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Button(
                onClick = onBack,
                colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                modifier = Modifier.padding(start = 16.dp)
            ) {
                Text(text = "←", color = primaryGreen, fontSize = 22.sp)
            }

            Button(
                onClick = onNext,
                colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                modifier = Modifier.padding(end = 16.dp)
            ) {
                Text(text = "→", color = primaryGreen, fontSize = 22.sp)
            }
        }
    }
}
