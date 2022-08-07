package com.ozlem.navigationkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
// MainActivity ve XML arasındaki senkronizasyonu sağlamak için:
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
}