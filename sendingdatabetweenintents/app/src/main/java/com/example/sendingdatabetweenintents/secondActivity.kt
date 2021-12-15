package com.example.sendingdatabetweenintents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class secondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val name = intent.getStringExtra("EXTRA_NAME")
        val age = intent.getIntExtra("EXTRA_AGE",0)
        val country = intent.getStringExtra("EXTRA_COUNTRY")
        val personString = "$name is $age years old and lives in $country"
        val tvPerson = findViewById<TextView>(R.id.tvPerson)
        tvPerson.text = personString
    }
}