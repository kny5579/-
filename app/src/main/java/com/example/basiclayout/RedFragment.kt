package com.example.basiclayout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class RedFragment : Fragment(){

    override fun onCreateView( // 프래그먼트의 레이아웃을 연결할 때 쓰는 함수
        inflater: LayoutInflater, // 뷰를 생성하는 객체
        container: ViewGroup?, // 생성할 뷰(자식 뷰)가 들어갈 부모 뷰
        savedInstanceState: Bundle? // 이전 프래그먼트 객체에서 전달된 데이터(번들)
    ): View? {
        return inflater.inflate(R.layout.fragment_red, container,false); //각각 레이아웃 참조값, 부모 뷰, 부모 뷰에 뷰를 즉시 추가할 것인지 여부를 나타냄
    }
}