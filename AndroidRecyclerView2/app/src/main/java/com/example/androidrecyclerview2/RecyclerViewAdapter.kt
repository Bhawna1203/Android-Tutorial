package com.example.androidrecyclerview2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter: RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    private val itemTitles = arrayOf(
        "Pietro Aretino","I am, indeed, a king, because I know how to rule myself.",
        "Pietro Aretino","I am, indeed, a king, because I know how to rule myself.",
        "Pietro Aretino","I am, indeed, a king, because I know how to rule myself.",
        )

    private val itemDetails = arrayOf(
        "Be yourself; everyone else is already taken","Existence wants you to be you",
        "Be yourself; everyone else is already taken","Existence wants you to be you",
        "Be yourself; everyone else is already taken","Existence wants you to be you",
          )

    private val itemImages = intArrayOf(
        R.drawable.photo1,
        R.drawable.photo2,
        R.drawable.photo3,
        R.drawable.photo4

    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v:View = LayoutInflater.from(parent.context)
            .inflate(R.layout.recyclerview_model,parent,false)

        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.textTitle.text = itemTitles[position]
        holder.textData.text = itemDetails[position]
        holder.image.setImageResource(itemImages[position])

        holder.itemView.setOnClickListener { v: View ->
            Toast.makeText(v.context, "Clicked on the item", Toast.LENGTH_SHORT).show()
        }


    }

    override fun getItemCount(): Int {
        return itemTitles.size
    }
    inner class ViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){

        var image : ImageView
        var textTitle : TextView
        var textData : TextView

        init {
            image = itemView.findViewById(R.id.item_image)
            textTitle = itemView.findViewById(R.id.item_title)
            textData = itemView.findViewById(R.id.item_details)
        }
    }
}
