package com.example.simplequizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class QuizQuestionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)
        setData.getQuestion()
        var demo=setData.getQuestion()
        if (demo != null) {
            Log.e("my test","${demo.size}")
        }
    }
}