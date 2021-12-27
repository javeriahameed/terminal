package com.example.kotlin_app.recyclerview

import android.text.Layout
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin_app.R

class newAdapter(val titles:Array<String>, val quantity:Array<String>):RecyclerView.Adapter<myViewHolder>()
{
    private lateinit var listen:onItemClickListener

    interface onItemClickListener{
        fun onItemClick(position: Int)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
       val inflator =  LayoutInflater.from(parent.context)
        var view = inflator.inflate(R.layout.single_view,parent,false)
        return myViewHolder(view,listen)
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        holder.title.text =  titles[position]
        holder.quantity.text =  titles[position]
    }

    override fun getItemCount(): Int {
        return titles.size
    }

    fun setOnItemClickListener(listener:onItemClickListener){
        listen = listener
    }


}