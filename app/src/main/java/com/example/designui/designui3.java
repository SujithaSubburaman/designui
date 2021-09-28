package com.example.designui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class designui3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_designui3);
        Button button3=findViewById(R.id.button4);
        button3.setOnClickListener(view->{
            Intent intent =new Intent(designui3.this, designui4.class);
            startActivity(intent);
        });
        Button button8=findViewById(R.id.button5);
        button8.setOnClickListener(view->{
            Intent intent =new Intent(designui3.this, designui5.class);
            startActivity(intent);
        });
    }
}