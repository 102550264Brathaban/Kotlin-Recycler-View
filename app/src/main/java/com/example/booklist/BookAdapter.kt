package com.example.booklist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.rowview.view.*

class BookAdapter(private val data: List<Books>, val listener: (Int) -> Unit) : RecyclerView.Adapter<BookAdapter.Holder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.rowview, parent, false) as View
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val item = data[position]
        holder.bind(item, position)

        holder.textV1.text = item.name
        item.des= "Rating ---" + item.rating.toString()
        holder.textV2.text = item.des
        holder.imageView.setImageResource(item.image)

           }


    override fun getItemCount(): Int {
        return data.size
    }


    inner class Holder(private val v: View) : RecyclerView.ViewHolder(v) {
         val textV1: TextView = v.textView
         val textV2: TextView = v.textView2
         val imageView: ImageView = v.findViewById<ImageView>(R.id.imageView1)

        fun bind(book: Books, pos: Int) {

            v.setOnClickListener {
               listener(adapterPosition)

            }


        }
    }
}


