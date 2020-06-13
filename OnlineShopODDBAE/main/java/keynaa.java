package com.example.ecom;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
public class keynaa extends AppCompatActivity {
    ImageView a, b, c, g, h, i;
    ImageView prof,back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keynaa);
        a=findViewById(R.id.a);
        b=findViewById(R.id.b);
        c=findViewById(R.id.c);
        g=findViewById(R.id.g);
        h=findViewById(R.id.h);
        i=findViewById(R.id.i);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(keynaa.this, detail_keyna_square_maroon.class);
                startActivity(intent);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(keynaa.this, detail_keyna_square_beige.class);
                startActivity(intent);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(keynaa.this, detail_keyna_square_silver.class);
                startActivity(intent);
            }
        });
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(keynaa.this, detail_keyna_square_taro.class);
                startActivity(intent);
            }
        });
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(keynaa.this, detail_keyna_square_black.class);
                startActivity(intent);
            }
        });
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(keynaa.this, detail_keyna_square_cream.class);
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
                Intent intent = new Intent(keynaa.this, profile.class);
                startActivity(intent);
            }
        });
    }
}
