package com.example.textview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var count=0
        var btnCount = findViewById<TextView>(R.id.btnCount)
        var tvCount = findViewById<TextView>(R.id.tvCount)
        btnCount.setOnClickListener {
            var btnCount = findViewById<TextView>(R.id.tvCount)
            count++
            tvCount.text = "Let's count Together: $count"
        }
    }
}