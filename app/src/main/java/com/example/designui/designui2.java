package com.example.designui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class designui2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_designui2);
        Button button2=findViewById(R.id.button3);
        button2.setOnClickListener(view->{
            Intent intent =new Intent(designui2.this, designui3.class);
            startActivity(intent);
        });
    }
}