package com.azimzada.imagegalery

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.azimzada.imagegalery.data.ImageDTO

class MyCustomAdapter(val list: List<ImageDTO>) :
    RecyclerView.Adapter<MyCustomAdapter.ViewHolder>() {
    lateinit var list1: List<ImageDTO>

    init {
        this.list1 = list
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // Your holder should contain and initialize a member variable
        // for any view that will be set as you render a row
        val image1 = itemView.findViewById<ImageView>(R.id.imageView2)
        val image2 = itemView.findViewById<ImageView>(R.id.imageView3)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        // Inflate the custom layout
        val contactView = inflater.inflate(R.layout.galery_item, parent, false)
        // Return a new holder instance
        return ViewHolder(contactView)
    }


    override fun getItemCount(): Int {
        return list1.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // position bize scrol un hansi elementde oldugunu gosterir
        val images = list1.get(position)
        holder.image1.setImageResource(images.recurceName)
        holder.image2.setImageResource(images.recurceName2)
    }
}
