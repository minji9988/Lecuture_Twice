package com.bokchi.lecuture_twice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class ImageInsideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_inside)

        //MainActivity에서 넘어온 data를 받아주고자 한다.
        //getData란 변수 안에 MainAcitivity에서 넘어온 data를 저장해줬다.
        //만약 MainAcitivity에 data란 변수 이름대신 abc를 작성했다면 아래도 data 대신 abc라고 작성해야 함
        val getData = intent.getStringExtra("data")

        //MainAcitivy에서 toast를 통해 data가 잘 들어왔는지 확인해보자
        Toast.makeText(this, getData, Toast.LENGTH_LONG).show()


        //1번 이미지 클릭하면 1번 이미지가, 2번 이미지 클릭하면 2번 이미지가 뜨도록 만들기
        val memberImage = findViewById<ImageView>(R.id.memberImageArea)


        // getData에 들어온 data가 1이라면
        // member 1의 이미지를 보여줘라, 란 뜻
        if(getData == "1"){
            memberImage.setImageResource(R.drawable.member_1)
        }

        if(getData == "2"){
            memberImage.setImageResource(R.drawable.member_2)
        }

        if(getData == "3"){
            memberImage.setImageResource(R.drawable.member_3)
        }

        if(getData == "4"){
            memberImage.setImageResource(R.drawable.member_4)
        }


    }
}