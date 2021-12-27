package com.example.kotlin_app.recyclerview

import android.Manifest.permission_group.SMS
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin_app.R


class recycler_view : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
        //array of strings
        val titles=arrayOf("Product1","product2",
            "product3","product4","product5", "product6", "product7")
        //array of integers
        val quantity=arrayOf("111","112",
            "product3","113","114", "115", "116")
        val recView =  findViewById<RecyclerView>(R.id.mainRecycler)

        var adapter1 = newAdapter(titles,quantity)
        recView.adapter= adapter1
        adapter1.setOnItemClickListener(object:newAdapter.onItemClickListener{
            override fun onItemClick(position: Int) {

                Toast.makeText(this@recycler_view,"Item ${titles[position]} clicked",Toast.LENGTH_SHORT).show()
            }
        })
        recView.layoutManager = GridLayoutManager(this,1)
    }
}
