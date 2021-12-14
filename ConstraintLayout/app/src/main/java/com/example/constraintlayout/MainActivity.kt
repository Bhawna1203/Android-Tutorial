package com.example.constraintlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.RecyclerView

class MainActivity() : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnApply = findViewById<Button>(R.id.btnApply)
        btnApply.setOnClickListener{

            val etFirstName = findViewById<EditText>(R.id.etFirstName)
            val etLastName = findViewById<EditText>(R.id.etLastName)
            val etBirthDate = findViewById<EditText>(R.id.etBirthDate)
            val etCountry = findViewById<EditText>(R.id.etCountry)
            val firstName = etFirstName.text.toString()
            val lastName = etLastName.text.toString()
            val birthDate = etBirthDate.text.toString()
            val country = etCountry.text.toString()
            Log.d("MainActivity","$firstName $lastName ,born on $birthDate , from $country just applied to the formula")
        }

    }
}