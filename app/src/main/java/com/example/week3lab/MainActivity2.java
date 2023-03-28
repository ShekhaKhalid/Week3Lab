package com.example.week3lab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent i = getIntent();
        String s= i.getStringExtra("PersonName");

        TextView tv = findViewById(R.id.msg);
        tv.setText("HELLO "+s+" !");
    }
}