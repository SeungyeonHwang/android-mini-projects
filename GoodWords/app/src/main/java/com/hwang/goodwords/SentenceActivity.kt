package com.hwang.goodwords

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class SentenceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_sentence)

        val sentenceList = mutableListOf<String>()

        sentenceList.add("명언1")
        sentenceList.add("명언2")
        sentenceList.add("명언3")
        sentenceList.add("명언4")
        sentenceList.add("명언5")
        sentenceList.add("명언6")
        sentenceList.add("명언7")
        sentenceList.add("명언8")

        val sentenceAdapter = ListViewAdapter(sentenceList)
        val listView = findViewById<ListView>(R.id.sentenceListView)

        listView.adapter = sentenceAdapter
    }
}