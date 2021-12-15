package com.example.toastsandcontext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnShowToast = findViewById<Button>(R.id.btnShowToast)
        btnShowToast.setOnClickListener {
                Toast.makeText(applicationContext,"Hi , i am a toast",Toast.LENGTH_LONG).show()
        }

        val btnCustomToast = findViewById<Button>(R.id.btnCustomToast)
        btnCustomToast.setOnClickListener {
            Toast(this).apply {
                duration = Toast.LENGTH_LONG
                val clToast = findViewById<ConstraintLayout>(R.id.clToast)
                view = layoutInflater.inflate(R.layout.custom_toast, clToast)
                show()
            }
        }
    }
}