package com.bokchi.lecuture_twice

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //첫 번째 사진 클릭했을 때
        val btn1 = findViewById<ImageView>(R.id.member1)
        val btn2 = findViewById<ImageView>(R.id.member2)
        val btn3 = findViewById<ImageView>(R.id.member3)
        val btn4 = findViewById<ImageView>(R.id.member4)
        val btn5 = findViewById<ImageView>(R.id.member5)
        val btn6 = findViewById<ImageView>(R.id.member6)
        val btn7 = findViewById<ImageView>(R.id.member7)
        val btn8 = findViewById<ImageView>(R.id.member8)
        val btn9 = findViewById<ImageView>(R.id.member9)



        btn1.setOnClickListener{

            val intent = Intent(this, ImageInsideActivity::class.java)
            //intent가 이동할 때 1이라는 값을 담아서 보낸다.
            // 즉 activity 화면 전환 시 데이터를 전달하는 것
            // 여기선 1번 버튼 클릭하면 1이란 data가 넘어가는 것이다.
            intent.putExtra("data", "1")

            startActivity(intent)
        }

        btn2.setOnClickListener{

            val intent = Intent(this, ImageInsideActivity::class.java)

            // 여기선 2번 버튼 클릭하면 2이란 data가 넘어가는 것이다.
            intent.putExtra("data", "2")
            startActivity(intent)
        }

        btn3.setOnClickListener{

            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "3")

            startActivity(intent)
        }

        btn4.setOnClickListener{

            val intent = Intent(this, ImageInsideActivity::class.java)

            intent.putExtra("data", "4")

            startActivity(intent)
        }

        btn5.setOnClickListener{

            val intent = Intent(this, ImageInsideActivity::class.java)
            startActivity(intent)
        }

        btn6.setOnClickListener{

            val intent = Intent(this, ImageInsideActivity::class.java)
            startActivity(intent)
        }

        btn7.setOnClickListener{

            val intent = Intent(this, ImageInsideActivity::class.java)
            startActivity(intent)
        }

        btn8.setOnClickListener{

            val intent = Intent(this, ImageInsideActivity::class.java)
            startActivity(intent)
        }

        btn9.setOnClickListener{

            val intent = Intent(this, ImageInsideActivity::class.java)
            startActivity(intent)
        }

    }
}