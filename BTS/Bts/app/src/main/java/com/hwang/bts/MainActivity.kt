package com.hwang.bts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

//화면의 로직을 작성
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. 화면이 클릭되었다는 것을 알아야 함(프로그램이)
        val image1 = findViewById<ImageView>(R.id.bts_image_1)
        image1.setOnClickListener {
            Toast.makeText(this, "1번 클릭 완료", Toast.LENGTH_LONG).show()

            // 2. 화면이 클릭되면, 다음 화면으로 넘어가서 사진을 크게 보여줌
            var intent = Intent(this, Bts1MainActivity::class.java)
            startActivity(intent)
        }

        //7개 image들의 이름을 다 붙이고 각가 클릭시, 다른 액티비로 이동
        val image2 = findViewById<ImageView>(R.id.bts_image_2)
        val image3 = findViewById<ImageView>(R.id.bts_image_3)
        val image4 = findViewById<ImageView>(R.id.bts_image_4)
        val image5 = findViewById<ImageView>(R.id.bts_image_5)
        val image6 = findViewById<ImageView>(R.id.bts_image_6)
        val image7 = findViewById<ImageView>(R.id.bts_image_7)

        image2.setOnClickListener {
            var intent = Intent(this, Bts2MainActivity::class.java)
            startActivity(intent)
        }

        image3.setOnClickListener {
            var intent = Intent(this, Bts3MainActivity::class.java)
            startActivity(intent)
        }

        image4.setOnClickListener {
            var intent = Intent(this, Bts4MainActivity::class.java)
            startActivity(intent)
        }

        image5.setOnClickListener {
            var intent = Intent(this, Bts5MainActivity::class.java)
            startActivity(intent)
        }

        image6.setOnClickListener {
            var intent = Intent(this, Bts6MainActivity::class.java)
            startActivity(intent)
        }

        image7.setOnClickListener {
            var intent = Intent(this, Bts7MainActivity::class.java)
            startActivity(intent)
        }



    }
}