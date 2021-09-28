package com.example.designui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class designui4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_designui4);
        Button button9=findViewById(R.id.button6);
        button9.setOnClickListener(view->{
            Intent intent =new Intent(designui4.this, designui6.class);
            startActivity(intent);
        });
        Button button10=findViewById(R.id.button7);
        button10.setOnClickListener(view->{
            Intent intent =new Intent(designui4.this, designui6.class);
            startActivity(intent);
        });
        Button button12=findViewById(R.id.button8);
        button12.setOnClickListener(view->{
            Intent intent =new Intent(designui4.this, designui6.class);
            startActivity(intent);
        });


    }



}