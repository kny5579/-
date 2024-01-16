package com.example.basiclayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        settingButton()
    }

    fun settingButton() { //버튼 클릭시 다른 액티비티로 이동
        val button = findViewById<Button>(R.id.button) //뷰의 id 값을 인수로 받음
        button.setOnClickListener{ // 버튼 클릭시 행동
            val intent=Intent(this,SubActivity::class.java) //현재 객체에서 이동할 목적지 입력
            startActivity(intent) // 인텐트 객체를 인수로 받아서 새로운 액티비티 시작
        }
    }
}