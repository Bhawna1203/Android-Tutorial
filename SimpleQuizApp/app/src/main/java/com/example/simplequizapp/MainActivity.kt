package com.example.simplequizapp
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        //before starting mene ye viewbinding kabhi kiya nahi hei
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}