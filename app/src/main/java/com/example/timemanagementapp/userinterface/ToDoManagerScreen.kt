package com.example.timemanagementapp.userinterface

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Button
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ToDoManagerScreen(
    onBack: () -> Unit,
    onNext: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {

        // Top Green Bar
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .background(Color(0xFF4CAF50)),
            contentAlignment = Alignment.Center
        ) {
            Text("To Do Manager", color = Color.White, fontSize = 20.sp)
        }

        Spacer(modifier = Modifier.height(40.dp))

        // List of Task Options
        ToDoBox(title = "Add Exams")
        ToDoBox(title = "Add Assignments")
        ToDoBox(title = "Add Study Time")
        ToDoBox(title = "Add Other Tasks")

        Spacer(modifier = Modifier.weight(1f))

        // Navigation Bar Bottom
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(65.dp)
                .background(Color(0xFF4CAF50)),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "←",
                fontSize = 30.sp,
                color = Color.White,
                modifier = Modifier
                    .padding(start = 24.dp)
                    .clickable { onBack() }
            )

            Text(
                text = "→",
                fontSize = 30.sp,
                color = Color.White,
                modifier = Modifier
                    .padding(end = 24.dp)
                    .clickable { onNext() }
            )
        }
    }
}

@Composable
fun ToDoBox(title: String) {
    Surface(
        shape = RoundedCornerShape(12.dp),
        color = Color(0xFFF5F5F5),
        shadowElevation = 4.dp,
        modifier = Modifier
            .fillMaxWidth(0.85f)
            .padding(vertical = 12.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 18.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(title, fontSize = 18.sp, color = Color.Black)
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = "add",
                tint = Color(0xFF4CAF50)
            )
        }
    }
}
