package com.example.androidrecyclerview3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class GridItemAdapter(val cardTitle: Array<String>,val cardImages: Array<String>): RecyclerView.Adapter<GridItemAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.grid_item_view,parent,false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.cardTitle.text = cardTitle[position]
        Picasso.get().load(cardImages[position]).into(holder.cardImages)
    }

    override fun getItemCount(): Int {
        return cardTitle.size
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        var cardImages:ImageView = itemView.findViewById(R.id.cardImages)
        var cardTitle:TextView = itemView.findViewById(R.id.cardTitle)


    }

}