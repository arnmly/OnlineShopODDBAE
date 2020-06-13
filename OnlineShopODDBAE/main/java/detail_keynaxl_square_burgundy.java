package com.example.ecom;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class detail_keynaxl_square_burgundy extends AppCompatActivity {

    Button x;
    ImageView prof,back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_keynaxl_square_burgundy);
        x = findViewById(R.id.ClickLogin);

        x. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(detail_keynaxl_square_burgundy.this, checkout_keynaxl_square_burgundy.class);
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
                Intent intent = new Intent(detail_keynaxl_square_burgundy.this, profile.class);
                startActivity(intent);
            }
        });

    }
}
