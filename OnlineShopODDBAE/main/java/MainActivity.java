package com.example.ecom;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageView prof;
    ImageView keyna;
    ImageView keynaxl;
    ImageView dione;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prof = findViewById(R.id.prof);
        keyna = findViewById(R.id.keyna);
        keynaxl = findViewById(R.id.keynaxl);
        dione = findViewById(R.id.dione);

        prof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, profile.class);
                startActivity(intent);
            }
        });
        keyna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, keynaa.class);
                startActivity(intent);
            }
        });
        keynaxl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, keynaaxl.class);
                startActivity(intent);
            }
        });
        dione.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, dionee.class);
                startActivity(intent);
            }
        });

    }
}