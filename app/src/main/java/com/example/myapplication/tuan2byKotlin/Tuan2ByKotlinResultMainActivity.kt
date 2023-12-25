package com.example.myapplication.tuan2byKotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.myapplication.R

class Tuan2ByKotlinResultMainActivity : AppCompatActivity() {
    var res: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan2_by_kotlin_result_main)

        res = findViewById(R.id.result_kotlin)
        var i1 = intent
        val chuoi1 = i1.extras!!.getString("so1")
        val chuoi2 = i1.extras!!.getString("so2")
        val tong = chuoi1!!.toFloat() + chuoi2!!.toFloat()

        res!!.text = tong.toString()
    }
}