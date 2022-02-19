package com.example.androidrecyclerview3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardTitles : Array<String> = resources.getStringArray(R.array.cardTitles)

        val cardImages : Array<String> = resources.getStringArray(R.array.cardImages)
        val adapter = GridItemAdapter(cardTitles,cardImages)

        val gridLayout = GridLayoutManager(this,2)
        gridItem.layoutManager = gridLayout
        gridItem.adapter = adapter

    }
}