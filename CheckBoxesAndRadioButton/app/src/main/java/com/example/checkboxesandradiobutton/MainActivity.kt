package com.example.checkboxesandradiobutton

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView


class Mainctivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnOrder = findViewById<Button>(R.id.btnOrder)
        btnOrder.setOnClickListener {

            val rgMeat = findViewById<RadioButton>(R.id.rgMeat)
            val checkedMeatRadioButtonId = rgMeat.checkedRadioButtonId
            val meat = findViewById<RadioButton>(checkedMeatRadioButtonId)
            val cdCheese = findViewById<RadioButton>(R.id.cbCheese)
            val cheese = cdCheese.isChecked
            val cdOnions = findViewById<RadioButton>(R.id.cbOnions)
            val onions = cdOnions.isChecked
            val cdSalad = findViewById<RadioButton>(R.id.cbSalad)
            val salad = cdSalad.isChecked
            val orderString = "You ordered a burger with: \n"
                      "${meat.text}"+
                              (if(cheese) "\nCheese" else "") +
                              (if(onions) "\nOnions" else "") +
                              (if(salad) "\nSalad" else "")
            val tvOrder = findViewById<TextView>(R.id.tvOrder)
            tvOrder.text = orderString


        }
    }
}