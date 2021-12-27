package com.example.kotlin_app.recyclerview

import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin_app.R

class myViewHolder(itemView: View, listener:newAdapter.onItemClickListener):RecyclerView.ViewHolder(itemView) {

    var title = itemView.findViewById<TextView>(R.id.appText)
    var quantity = itemView.findViewById<TextView>(R.id.quantity)
    var btn = itemView.findViewById<Button>(R.id.appButton)

  init {
      btn.setOnClickListener(){
          listener.onItemClick(adapterPosition)
      }
  }
}
