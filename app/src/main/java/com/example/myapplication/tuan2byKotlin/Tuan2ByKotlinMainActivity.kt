package com.example.myapplication.tuan2byKotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Button
import android.content.Intent
import android.view.View
import com.example.myapplication.R

class Tuan2ByKotlinMainActivity : AppCompatActivity() {
    var txt1: EditText? = null
    var txt2: EditText? = null
    var btn1: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan2_by_kotlin_main)

        txt1 = findViewById(R.id.txt1_kotlin)
        txt2 = findViewById(R.id.txt2_kotlin)
        btn1 = findViewById(R.id.btn_kotlin)

        btn1!!.setOnClickListener(View.OnClickListener {
            var i = Intent(this@Tuan2ByKotlinMainActivity,
                            Tuan2ByKotlinResultMainActivity::class.java)

            i.putExtra("so1", txt1!!.text.toString())
            i.putExtra("so2", txt2!!.text.toString())

            startActivity(i)
        })
    }
}