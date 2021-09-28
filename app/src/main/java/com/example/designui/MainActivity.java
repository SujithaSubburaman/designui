package com.example.designui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import static android.content.ClipData.newIntent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1=findViewById(R.id.button2);
        button1.setOnClickListener(view->{
            Intent intent =new Intent(MainActivity.this, designui2.class);
            startActivity(intent);
        });

    }
}