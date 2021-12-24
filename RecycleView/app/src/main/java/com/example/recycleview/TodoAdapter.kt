package com.example.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TodoAdapter(
    var todos: List<Todo>
) : RecyclerView.Adapter<TodoAdapter.Todoviewfolder>(){
    inner class Todoviewfolder (itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Todoviewfolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_todo,parent,false)
        return Todoviewfolder(view)
    }

    override fun onBindViewHolder(holder: Todoviewfolder, position: Int) {
          holder.itemView.apply {
              todos[position].title.also {
                  val tvTitle = findViewById<TextView>(R.id.tvTitle)
                  tvTitle.text = todos[position].title
                  val cdDone = findViewById<CheckBox>(R.id.cbDone)
                  cdDone.isChecked = todos[position].isChecked
              }
          }
    }

    override fun getItemCount(): Int {
        return todos.size

    }


}