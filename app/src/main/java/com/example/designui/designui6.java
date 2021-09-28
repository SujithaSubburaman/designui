package com.example.designui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class designui6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_designui6);
        Button button11=findViewById(R.id.button15);
        button11.setOnClickListener(view->{
            Intent intent =new Intent(designui6.this, MainActivity.class);
            startActivity(intent);
        });
    }
}