package com.example.savingdatainsharedpreferences

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()

        val btnSave = findViewById<Button>(R.id.btnSave)
        btnSave.setOnClickListener {

            val etName = findViewById<EditText>(R.id.etName)
            val etAge = findViewById<EditText>(R.id.etAge)
            val cbAdult = findViewById<CheckBox>(R.id.cbAdult)



            val name = etName.text.toString()
            val age = etAge.text.toString().toInt()
            val isAdult = cbAdult.isChecked

            editor.apply {
                putString("name",name)
                putInt("age",age)
                putBoolean("isAdult",isAdult)
                apply()
            }

        }

        val btnLoad = findViewById<Button>(R.id.btnLoad)
        btnLoad.setOnClickListener{
            val etName = findViewById<EditText>(R.id.etName)
            val etAge = findViewById<EditText>(R.id.etAge)
            val cbAdult = findViewById<CheckBox>(R.id.cbAdult)


            val name = sharedPref.getString("name",null)
            val age = sharedPref.getInt("age",0)
            val isAdult =  sharedPref.getBoolean("isAdult",false)

            etName.setText(name)
            etAge.setText(age.toString())
            cbAdult.isChecked =isAdult


        }



    }
}