package com.example.counttimeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var countDownTimer: CountDownTimer?= null
    private var timerDuration:Long = 60000
    private var pauseOffset: Long = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        val tvTimer = findViewById<TextView>(R.id.tvTimer)
        tvTimer.text = "${(timerDuration/10000).toString()}"
        btnStart.setOnClickListener {
            startTimer(pauseOffset)
        }
        btnPause.setOnClickListener{
            pauseTimer()
        }
        btnStop.setOnClickListener{
            resetTimer()
        }
    }
}