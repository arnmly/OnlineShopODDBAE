package com.example.ecom;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.example.ecom.AppController;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kuncoro on 03/24/2017.
 */
public class Login extends AppCompatActivity {
    EditText u;
    EditText p;
    Button l;
    Button r;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        u = (EditText) findViewById(R.id.txt_username);
        p = (EditText) findViewById(R.id.txt_password);
        l = (Button) findViewById(R.id.btn_login);
        r = (Button) findViewById(R.id.btn_register);

        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                intent = new Intent(Login.this, Register.class);
                startActivity(intent);
            }
        });


        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (u.getText().toString().equals("admin") && p.getText().toString().equals("admin")) {
                    Toast.makeText(Login.this, "sukses", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(Login.this, MainActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(Login.this, "gagal", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}