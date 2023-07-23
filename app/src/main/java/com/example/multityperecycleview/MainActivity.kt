package com.example.multityperecycleview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
//this is my main activity
class MainActivity : AppCompatActivity() {
    val parentModelClass:ArrayList<ParentModelClass> = ArrayList()
    val childModelClass:ArrayList<ChildModelClass> = ArrayList()
    val recentlylist:ArrayList<ChildModelClass> = ArrayList()

    val favoriteList:ArrayList<ChildModelClass> = ArrayList()
    val recentlist:ArrayList<ChildModelClass> = ArrayList()
    val latestlist:ArrayList<ChildModelClass> = ArrayList()


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView=findViewById<RecyclerView>(R.id.Recycleview1)
        latestlist.add(ChildModelClass(R.drawable.apple))
        latestlist.add(ChildModelClass(R.drawable.mango))
        latestlist.add(ChildModelClass(R.drawable.banana))
        latestlist.add(ChildModelClass(R.drawable.orange))
        latestlist.add(ChildModelClass(R.drawable.splash))
        parentModelClass.add(ParentModelClass("Leatest Fruit list---",latestlist))

        recentlist.add(ChildModelClass(R.drawable.apple))
        recentlist.add(ChildModelClass(R.drawable.banana))
        recentlist.add(ChildModelClass(R.drawable.orange))
        recentlist.add(ChildModelClass(R.drawable.splash))
        recentlist.add(ChildModelClass(R.drawable.mango))
        recentlist.add(ChildModelClass(R.drawable.mango))
        recentlist.add(ChildModelClass(R.drawable.orange))
        recentlist.add(ChildModelClass(R.drawable.splash))
        parentModelClass.add(ParentModelClass("Recently Fruit",recentlist))

        favoriteList.add(ChildModelClass(R.drawable.apple))
        favoriteList.add(ChildModelClass(R.drawable.banana))
        favoriteList.add(ChildModelClass(R.drawable.orange))
        favoriteList.add(ChildModelClass(R.drawable.splash))
        favoriteList.add(ChildModelClass(R.drawable.mango))
        parentModelClass.add(ParentModelClass("Recently movie",favoriteList))

        favoriteList.add(ChildModelClass(R.drawable.apple))
        favoriteList.add(ChildModelClass(R.drawable.banana))
        favoriteList.add(ChildModelClass(R.drawable.orange))
        favoriteList.add(ChildModelClass(R.drawable.splash))
        favoriteList.add(ChildModelClass(R.drawable.mango))
        parentModelClass.add(ParentModelClass("Recently favourite",favoriteList))

        childModelClass.clear()
        childModelClass.add(ChildModelClass(R.drawable.mango))
        childModelClass.add(ChildModelClass(R.drawable.apple))
        childModelClass.add(ChildModelClass(R.drawable.mango))
        childModelClass.add(ChildModelClass(R.drawable.orange))
        childModelClass.add(ChildModelClass(R.drawable.splash))
        childModelClass.add(ChildModelClass(R.drawable.banana))
        childModelClass.add(ChildModelClass(R.drawable.mango))
        childModelClass.add(ChildModelClass(R.drawable.banana))
        childModelClass.add(ChildModelClass(R.drawable.apple))
        childModelClass.add(ChildModelClass(R.drawable.orange))

        parentModelClass.add(ParentModelClass("Recent",childModelClass))
        parentModelClass.add(ParentModelClass("Recent1",childModelClass))
        parentModelClass.add(ParentModelClass("Recent2",childModelClass))
        parentModelClass.add(ParentModelClass("Recent3",childModelClass))
        parentModelClass.add(ParentModelClass("Recent4",childModelClass))
        parentModelClass.add(ParentModelClass("Recent5",childModelClass))

        val parantAdapter=ParantAdapter(parentModelClass,this)
        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.adapter=parantAdapter
        parantAdapter.notifyDataSetChanged()



    }
}