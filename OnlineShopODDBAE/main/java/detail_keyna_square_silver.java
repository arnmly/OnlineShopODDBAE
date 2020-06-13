package com.example.ecom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class detail_keyna_square_silver extends AppCompatActivity {

    Button x;
    ImageView prof,back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_keyna_square_silver);

        x = findViewById(R.id.ClickLogin);

        x. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(detail_keyna_square_silver.this, checkout_keyna_square_silver.class);
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
                Intent intent = new Intent(detail_keyna_square_silver.this, profile.class);
                startActivity(intent);
            }
        });

    }
}
