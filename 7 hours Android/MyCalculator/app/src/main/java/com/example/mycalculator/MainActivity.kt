package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    
    //Finally did this

    fun onDigit(view: View){
        Toast.makeText(this,"Button works",Toast.LENGTH_SHORT).show()

    }
}
//It's working fine finally
//This is for explaination purpose sorry for that

