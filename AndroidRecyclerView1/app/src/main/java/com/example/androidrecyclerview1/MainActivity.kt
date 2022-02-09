package com.example.androidrecyclerview1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val songsObjects:MutableList<song> = mutableListOf<song>()
        songsObjects.add(song("hello","Just have a great day me bunny"))
        songsObjects.add(song("hey","I am Bhawna what about you"))
        songsObjects.add(song("Bhilu","Have we can talk "))
        songsObjects.add(song("My cutie","Just have a day me bunny"))
        songsObjects.add(song("bhumi","Just have a great day me bhumi"))
        songsObjects.add(song("harshi","Just have a great day me harshi"))
        songsObjects.add(song("harshu","Just have a great day me harshu"))
        songsObjects.add(song("Ritik","Just have a great day me Ritik"))
        songsObjects.add(song("Hello","Just have a great day me bunny"))
        songsObjects.add(song("hello","Just have a great day me bunny"))
        songsObjects.add(song("hello","Just have a great day me bunny"))


        val songs :List<String> = listOf("Hello","Abcd","Chill","Quarentines","Hello","Abcd","Chill","Quarentines","Hello","Abcd","Chill","Quarentines","Hello","Abcd","Chill","Quarentines")
        val songList = findViewById<RecyclerView>(R.id.songList)
        songList.adapter = MyAdapter(songsObjects)
        songList.layoutManager = LinearLayoutManager(this)
    }
}
