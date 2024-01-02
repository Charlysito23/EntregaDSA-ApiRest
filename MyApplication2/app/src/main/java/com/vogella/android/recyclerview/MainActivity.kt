package com.vogella.android.recyclerview

import android.app.Activity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View

class MainActivity : Activity() {
    private var recyclerView: RecyclerView? = null
    private var mAdapter: RecyclerView.Adapter? = null
    private var layoutManager: LayoutManager? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById<View>(R.id.my_recycler_view) as RecyclerView
        // use this setting to
        // improve performance if you know that changes
        // in content do not change the layout size
        // of the RecyclerView
        recyclerView.setHasFixedSize(true)
        // use a linear layout manager
        layoutManager = LinearLayoutManager(this)
        recyclerView.setLayoutManager(layoutManager)
        val input: MutableList<String> = ArrayList()
        for (i in 0..99) {
            input.add("Test$i")
        } // define an adapter
        mAdapter = MyAdapter(input)
        recyclerView.setAdapter(mAdapter)
    }
}
