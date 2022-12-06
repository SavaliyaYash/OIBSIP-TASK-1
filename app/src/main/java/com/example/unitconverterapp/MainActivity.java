package com.example.unitconverterapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView txtname;
    Button btnlenght, btnweight;

    Intent ilenghth, iweight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtname = findViewById(R.id.txtname);
        btnlenght = findViewById(R.id.btnlenght);
        btnweight = findViewById(R.id.btnweight);

        ilenghth = new Intent(MainActivity.this, Lenght.class);
        iweight = new Intent(MainActivity.this, Weight.class);

        btnlenght.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(ilenghth);
            }
        });

        btnweight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(iweight);
            }
        });
    }
}