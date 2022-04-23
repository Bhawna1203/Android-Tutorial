package com.example.roomdatabasedemo

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
//Todo : creating a Data Model Class and using as entity
@Entity(tableName = "employee-table")
data class EmployeeEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name : String = "",
    @ColumnInfo(name = "email-id")
    val email:String = ""
)