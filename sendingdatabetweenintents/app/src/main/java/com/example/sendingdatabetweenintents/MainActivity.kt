package com.example.sendingdatabetweenintents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnApply = findViewById<Button>(R.id.btnApply)
        btnApply.setOnClickListener{
            val etName = findViewById<TextView>(R.id.etName)
            val name=etName.text.toString()
            val etAge = findViewById<TextView>(R.id.etAge)
            val age=etAge.text.toString().toInt()
            val etCountry = findViewById<TextView>(R.id.etCountry)
            val country=etCountry.text.toString()
            Intent(this,secondActivity::class.java).also{
                it.putExtra("EXTRA_NAME",name)
                it.putExtra("EXTRA_AGE",age)
                it.putExtra("EXTRA_COUNTRY",country)
                startActivity(it)
             }
        }
    }
}