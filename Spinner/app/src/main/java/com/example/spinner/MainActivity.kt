package com.example.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val customList = listOf("first","second","third","fourth")
        val adapter = ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,customList)
        val spmonths = findViewById<Spinner>(R.id.spMonths)
        spmonths.adapter = adapter


        val spMonths = findViewById<Spinner>(R.id.spMonths)
        spMonths.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(adapterView: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(this@MainActivity,
                    "You selected ${adapterView?.getItemAtPosition(position).toString()}" +
                            "",Toast.LENGTH_LONG).show()

            }

            override fun onNothingSelected(adapterView: AdapterView<*>?) {
                     }
        }
    }
}