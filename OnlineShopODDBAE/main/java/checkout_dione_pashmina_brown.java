package com.example.ecom;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class checkout_dione_pashmina_brown extends AppCompatActivity {

    ImageView back, prof;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout_dione_pashmina_brown);

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
                Intent intent = new Intent(checkout_dione_pashmina_brown.this, profile.class);
                startActivity(intent);
            }
        });

    }
}
