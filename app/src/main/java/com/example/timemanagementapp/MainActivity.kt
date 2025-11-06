package com.example.timemanagementapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.timemanagementapp.nav.AppNav
import com.example.timemanagementapp.ui.theme.TimemanagementappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TimemanagementappTheme {
                AppNav()
            }
        }
    }
}
