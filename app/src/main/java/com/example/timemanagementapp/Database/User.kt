package com.example.Timemanagementapp.database
import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity(tableNmae = "users")
data class Users(
    @PrimaryKey val email: String,
    val password : String
)