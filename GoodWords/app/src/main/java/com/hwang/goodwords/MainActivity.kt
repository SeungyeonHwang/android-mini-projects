package com.hwang.goodwords

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.hwang.goodwords.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sentenceList = mutableListOf<String>()

        sentenceList.add("명언1")
        sentenceList.add("명언2")
        sentenceList.add("명언3")
        sentenceList.add("명언4")
        sentenceList.add("명언5")
        sentenceList.add("명언6")
        sentenceList.add("명언7")
        sentenceList.add("명언8")

        Log.d("MainActivity", sentenceList.random())

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.showAllSentence.setOnClickListener {
            val intent = Intent(this, SentenceActivity::class.java)
            startActivity(intent)
        }

        binding.goodWordText.text = sentenceList.random()
    }
}