package com.example.myapplication.tuan2byJava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;

import com.example.myapplication.R;

public class Tuan2ByJavaMainActivity extends AppCompatActivity {

    EditText txt1, txt2;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan2_by_java_main);

        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(v -> {
            Intent i = new Intent(Tuan2ByJavaMainActivity.this,
                                Tuan2ByJavaResultMainActivity.class);
            i.putExtra("So1", txt1.getText().toString());
            i.putExtra("So2", txt2.getText().toString());
            startActivity(i);
        });
    }
}