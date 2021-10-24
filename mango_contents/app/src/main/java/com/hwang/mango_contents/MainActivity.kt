package com.hwang.mango_contents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val items = mutableListOf<ContentrsModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bookmarkButton = findViewById<TextView>(R.id.bookmarkBtn)
        bookmarkButton.setOnClickListener {

            val intent = Intent(this, BookmarkActivity::class.java)
            startActivity(intent)

        }

        items.add(
            ContentrsModel(
                "https://www.mangoplate.com/restaurants/QipTpfE2QC",
                "https://mp-seoul-image-production-s3.mangoplate.com/624184_1618745991597182.jpg",
                "영양숯불갈비"
            )
        )

        items.add(
            ContentrsModel(
                "https://www.mangoplate.com/restaurants/KJo3zG_phR",
                "https://mp-seoul-image-production-s3.mangoplate.com/116308/570821_1549870762188_35354",
                "황남빵"
            )
        )

        items.add(
            ContentrsModel(
                "https://picsum.photos/200/300",
                "https://i.picsum.photos/id/238/200/300.jpg?hmac=WF3u-tnO4aoQvz_F9p7zS0Dr5LwGx74tPabQf7EjHkw",
                "sample3"
            )
        )

        items.add(
            ContentrsModel(
                "https://picsum.photos/200/300",
                "https://i.picsum.photos/id/210/200/300.jpg?hmac=xq_AloJ8pIOvSilFZdFGDfUQZb3gN-nApbDPSecpqa4",
                "sample4"
            )
        )

        items.add(
            ContentrsModel(
                "https://picsum.photos/200/300",
                "https://i.picsum.photos/id/374/200/300.jpg?hmac=O7_6jZztETgk8S2eFcdlCNlqe50qS5u-OW5hs-EoNMo",
                "sample1"
            )
        )

        items.add(
            ContentrsModel(
                "https://picsum.photos/200/300",
                "https://i.picsum.photos/id/38/200/300.jpg?hmac=-3xmMd1qccZR3fLPMvwj8D3GgMIIDCKTpXJspTKuZW0",
                "sample2"
            )
        )

        items.add(
            ContentrsModel(
                "https://picsum.photos/200/300",
                "https://i.picsum.photos/id/238/200/300.jpg?hmac=WF3u-tnO4aoQvz_F9p7zS0Dr5LwGx74tPabQf7EjHkw",
                "sample3"
            )
        )

        items.add(
            ContentrsModel(
                "https://picsum.photos/200/300",
                "https://i.picsum.photos/id/210/200/300.jpg?hmac=xq_AloJ8pIOvSilFZdFGDfUQZb3gN-nApbDPSecpqa4",
                "sample4"
            )
        )

        //recyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.rv)
        val rvAdapter = RVAdapter(this, items)
        recyclerView.adapter = rvAdapter

        rvAdapter.itemClick = object : RVAdapter.ItemClick {
            override fun onClick(view: View, position: Int) {

                val intent = Intent(baseContext, ViewActivity::class.java)
                intent.putExtra("url", items[position].url)
                intent.putExtra("title", items[position].titleText)
                intent.putExtra("imageUrl", items[position].imageUrl)
                startActivity(intent)

            }
        }

        recyclerView.layoutManager = GridLayoutManager(this, 2)

    }
}