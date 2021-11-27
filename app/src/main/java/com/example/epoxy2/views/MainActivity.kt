package com.example.epoxy2.views

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.epoxy2.R
import com.example.epoxy2.viewmodels.SingleItemController

class MainActivity : AppCompatActivity() {

    private val recyclerView: RecyclerView by lazy { findViewById<RecyclerView>(R.id.recycler_view) }
    private val singleItemController: SingleItemController by lazy { SingleItemController() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (!initRecycler())
            findViewById<TextView>(R.id.empty).text = ""
    }

    private fun initRecycler() : Boolean{
        val linearLayoutManager = LinearLayoutManager(this)
        var lm:RecyclerView.LayoutManager?
        recyclerView.apply {
            layoutManager = linearLayoutManager
            lm = layoutManager
            setHasFixedSize(true)
            adapter = singleItemController.adapter
            addItemDecoration(
                DividerItemDecoration(
                    this@MainActivity,
                    linearLayoutManager.orientation
                )
            )
        }

        singleItemController.requestModelBuild()
        return (lm?.childCount!! > 0)
    }
}