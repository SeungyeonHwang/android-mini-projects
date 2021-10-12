package com.hwang.backbuttonex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    
    private var isDouble = false
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onBackPressed() {
        Log.d("MainActivity", "backButton")
        if (isDouble) {
            finish()
        }
        
        this.isDouble = true
        Toast.makeText(this, "종료 하실려면 더블 클릭", Toast.LENGTH_SHORT).show()

        //2초 지나면 false로 변환
        Handler().postDelayed(Runnable {
            isDouble = false
        },2000)
    }
}