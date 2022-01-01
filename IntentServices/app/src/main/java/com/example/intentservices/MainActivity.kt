package com.example.intentservices

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStartService = findViewById<Button>(R.id.btnStartService)
        btnStartService.setOnClickListener{
            Intent(this,MyIntentService::class.java).also {
                startService(it)
                val tvServiceInfo = findViewById<TextView>(R.id.tvServiceInfo)
                tvServiceInfo.text = "Service running"
            }
        }

        val btnStopService = findViewById<Button>(R.id.btnStopService)
        btnStopService.setOnClickListener {

            Intent(this,MyIntentService::class.java).also {
                stopService(it)
                val tvServiceInfo = findViewById<TextView>(R.id.tvServiceInfo)
                tvServiceInfo.text = "Service stopped"
            }

        }
    }


}