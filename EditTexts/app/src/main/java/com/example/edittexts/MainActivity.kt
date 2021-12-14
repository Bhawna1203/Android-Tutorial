package com.example.edittexts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAdd = findViewById<Button>(R.id.btnAdd)
        btnAdd.setOnClickListener {
            val etFirstNumber = findViewById<TextView>(R.id.etFirstNumber)

            val firstNumber = etFirstNumber.text.toString().toInt()
            val etSecondNumber = findViewById<TextView>(R.id.etSecondNumber)
            val SecondNumber = etSecondNumber.text.toString().toInt()
            val result = firstNumber + SecondNumber
            val tvResult = findViewById<TextView>(R.id.tvResult)
            tvResult.text = result.toString()


        }
    }
}