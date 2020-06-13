package com.example.ecom;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
public class dionee extends AppCompatActivity {
    ImageView d_beige, d_black, d_brown, d_silver, d_peach, d_maroon, prof,back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dionee);
        d_beige = findViewById(R.id.d_beige);
        d_black = findViewById(R.id.d_black);
        d_brown = findViewById(R.id.d_brown);
        d_maroon = findViewById(R.id.d_maroon);
        d_peach = findViewById(R.id.d_peach);
        d_silver = findViewById(R.id.d_silver);
        d_beige.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dionee.this, detail_dione_pashmina_beige.class);
                startActivity(intent);
            }
        });
        d_brown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dionee.this, detail_dione_pashmina_brown.class);
                startActivity(intent);
            }
        });
        d_black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dionee.this, detail_dione_pashmina_beige.class);
                startActivity(intent);
            }
        });
        d_maroon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dionee.this, detail_dione_pashmina_maroon.class);
                startActivity(intent);
            }
        });
        d_silver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dionee.this, detail_dione_pashmina_silver.class);
                startActivity(intent);
            }
        });
        d_peach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dionee.this, detail_dione_pashmina_peach.class);
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
                Intent intent = new Intent(dionee.this, profile.class);
                startActivity(intent);
            }
        });
    }
}
