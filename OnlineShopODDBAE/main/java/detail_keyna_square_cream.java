package com.example.ecom;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class detail_keyna_square_cream extends AppCompatActivity {

    Button x;
    ImageView prof,back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_keyna_square_cream);
        x = findViewById(R.id.ClickLogin);

        x. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(detail_keyna_square_cream.this, checkout_keyna_square_cream.class);
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
                Intent intent = new Intent(detail_keyna_square_cream.this, profile.class);
                startActivity(intent);
            }
        });

    }
}
