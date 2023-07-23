package com.example.multityperecycleview

import android.content.Context
import android.util.Log
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ParantAdapter(private val mList: List<ParentModelClass>,val context: Context) : RecyclerView.Adapter<ParantAdapter.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.parent_rc_layout, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val ItemsViewModel = mList[position]
        holder.title.text=mList.get(position).title
        val childAdapter=CustomAdapter(mList.get(position).childModelClass!!)
//        if (position==1){
//
//            holder.rc.layoutManager = GridLayoutManager(context,2,LinearLayoutManager.VERTICAL,false)
//            holder.rc.adapter = childAdapter
//        }else {
            holder.rc.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            holder.rc.adapter = childAdapter
     //   }



        // sets the text to the textview from our itemHolder class

    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val rc=itemView.findViewById<RecyclerView>(R.id.rv_parent)
        val title=itemView.findViewById<TextView>(R.id.tvTitle)



    }
}