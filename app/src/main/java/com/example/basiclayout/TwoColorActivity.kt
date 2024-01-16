package com.example.basiclayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class TwoColorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two_color)

        settingButtons()
    }

    fun settingButtons(){
        val redButton=findViewById<Button>(R.id.button_red_fragment) //id로 뷰를 찾음
        val blueButton=findViewById<Button>(R.id.button_blue_fragment)

        redButton.setOnClickListener{ // red 버튼 누를 시
            val fragmentTransaction=supportFragmentManager.beginTransaction() //트랜잭션 호출
            fragmentTransaction.replace(R.id.fragmentFrame,RedFragment()) //트랜잭션을 통해 프레임레이아웃이 레드레이아웃으로 프래그먼트 변경
            fragmentTransaction.commit()
        }
        blueButton.setOnClickListener{
            val fragmentTransaction=supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentFrame,BlueFragment())
            fragmentTransaction.commit()
        }
    }
}