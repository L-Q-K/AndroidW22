package com.example.myapplication.tuan2byJava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.R;

public class Tuan2ByJavaResultMainActivity extends AppCompatActivity {

    TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan2_by_java_result_main);

        res = findViewById(R.id.resulttxt);

        Intent i1 = getIntent();

        String chuoi1 = i1.getExtras().getString("So1");
        String chuoi2 = i1.getExtras().getString("So2");

        float tong = Float.parseFloat(chuoi1) + Float.parseFloat(chuoi2);
        res.setText(String.valueOf(tong));
    }
}