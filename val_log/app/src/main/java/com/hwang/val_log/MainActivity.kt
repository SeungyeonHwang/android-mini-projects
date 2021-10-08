package com.hwang.val_log

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val test = "여기는 테스트 값 입니다"

        Log.e("MainActivity", test) //오류
        Log.w("MainActivity", test) //경보
        Log.i("MainActivity", test) //정보
        Log.d("MainActivity", test) //디버그
        Log.v("MainActivity", test) //상세

    }
}