package com.hwang.mango_contents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val items = mutableListOf<ContentrsModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        items.add(
            ContentrsModel(
                "https://www.mangoplate.com/restaurants/A2wHyagv8QkV",
                "https://mp-seoul-image-production-s3.mangoplate.com/1861537_1609661398822165.jpg",
                "작은피자집1"
            )
        )

        items.add(
            ContentrsModel(
                "https://www.mangoplate.com/restaurants/A2wHyagv8QkV",
                "https://mp-seoul-image-production-s3.mangoplate.com/1861537_1609661398822165.jpg",
                "작은피자집2"
            )
        )

        items.add(
            ContentrsModel(
                "https://www.mangoplate.com/restaurants/A2wHyagv8QkV",
                "https://mp-seoul-image-production-s3.mangoplate.com/1861537_1609661398822165.jpg",
                "작은피자집3"
            )
        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv)

        recyclerView.adapter = RVAdapter(baseContext, items)
        recyclerView.layoutManager = GridLayoutManager(this, 2)

    }
}