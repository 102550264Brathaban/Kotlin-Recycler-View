package com.example.booklist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.rowview.*
import kotlinx.android.synthetic.main.rowview.view.*

class MainActivity : AppCompatActivity() {
    val data  = mutableListOf<Books>()
     lateinit var adapter  : BookAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val linearLayoutManager  = LinearLayoutManager(this)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = linearLayoutManager


      //  val data  = mutableListOf<Books>()
        data.add(Books("Going Long 1",R.drawable.a,1))
        data.add(Books("Going Long 2",R.drawable.b,2))
        data.add(Books("The commitment dialogues 1",R.drawable.c,3))
        data.add(Books("The commitment dialogues 2",R.drawable.d,4))
        data.add(Books("Principals of digital audio",R.drawable.e,5))
        data.add(Books("Say it with charts",R.drawable.f,6))
        data.add(Books("Radiography Prep",R.drawable.g,7))
        data.add(Books("Radiography Prep 2",R.drawable.h,8))
        data.add(Books("Radiography Examination",R.drawable.i,9))
        data.add(Books("Play and learn Spanish",R.drawable.j,10))

       val a: (Int) -> Unit = {a -> ClckFun(a)}
        //val adapter = BookAdapter(data) {ClckFun (it)}
        adapter = BookAdapter(data,a)
        recyclerView.adapter = adapter

    }

    private fun ClckFun(it:Int) {
        data[it].des = "hkhjkh"
        adapter.notifyItemChanged(it)
         Toast.makeText(this, "You clicked Book number ---  ${it+1}", Toast.LENGTH_SHORT).show()

    }


}

