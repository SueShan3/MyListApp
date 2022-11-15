package com.example.mylistapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mylistapplication.databinding.ActivityMainBinding

/** If does not apply data binding, open the command line and hide some related lines with data binding **/

class MainActivity : AppCompatActivity() {

    private lateinit var dataBinding: ActivityMainBinding
    private lateinit var storyList: ArrayList<StoryInfo>

    // ?= checking null and set it null
//    private var layoutManager: RecyclerView.LayoutManager? = null
//    private var adapter: RecyclerView.Adapter<RecyclerAdapter.StoryInfoViewHolder> ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        storyList = ArrayList()

        //Dummy Data
        storyList.apply {
            add(StoryInfo("Chapter One", "Item one details", R.drawable.gus_mouse))
            add(StoryInfo("Chapter Two", "Item two details", R.drawable.gus_mouse))
            add(StoryInfo("Chapter Three", "Item three details", R.drawable.gus_mouse))
            add(StoryInfo("Chapter Four", "Item four details", R.drawable.gus_mouse))
            add(StoryInfo("Chapter Five", "Item five details", R.drawable.gus_mouse))
            add(StoryInfo("Chapter Six", "Item six details", R.drawable.gus_mouse))
            add(StoryInfo("Chapter Seven", "Item seven details", R.drawable.gus_mouse))
            add(StoryInfo("Chapter Eight", "Item eight details", R.drawable.gus_mouse))

        }

        dataBinding.recyclerView.layoutManager = LinearLayoutManager(this)
        dataBinding.recyclerView.adapter = RecyclerAdapter(storyList)

//        layoutManager = LinearLayoutManager(this)
//        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
//        recyclerView.layoutManager = layoutManager
//        adapter = RecyclerAdapter()
//        recyclerView.adapter = adapter
    }
}