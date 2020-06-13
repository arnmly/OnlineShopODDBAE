package com.example.ecom;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
public class keynaaxl extends AppCompatActivity {
    ImageView burgundy;
    ImageView black;
    ImageView belgian;
    ImageView cream;
    ImageView mauve;
    ImageView prof,back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keynaaxl);
        mauve = findViewById(R.id.a);
        black = findViewById(R.id.c);
        burgundy = findViewById(R.id.g);
        belgian = findViewById(R.id.h);
        cream = findViewById(R.id.i);
        mauve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(keynaaxl.this, detail_keynaxl_square_mauve.class);
                startActivity(intent);
            }
        });
        burgundy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(keynaaxl.this, detail_keynaxl_square_burgundy.class);
                startActivity(intent);
            }
        });
        black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(keynaaxl.this, detail_keynaxl_square_black.class);
                startActivity(intent);
            }
        });
        belgian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(keynaaxl.this, detail_keynaxl_square_belgian.class);
                startActivity(intent);
            }
        });
        cream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(keynaaxl.this, detail_keynaxl_square_cream.class);
                startActivity(intent);
            }
        });
        back = findViewById(R.id.back);
        prof = findViewById(R.id.prof);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        prof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(keynaaxl.this, profile.class);
                startActivity(intent);
            }
        });
    }
}
