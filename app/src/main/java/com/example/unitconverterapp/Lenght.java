package com.example.unitconverterapp;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Lenght extends AppCompatActivity {

    TextView txt1, txt2;

    Spinner spinlen;
    Spinner resspinlen;

    EditText edtlen;
    TextView txtresln;

    Button btnlen;

    TextView txtreslen1, txtreslen2;

    ArrayList<String> arrlen = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lenght);

        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);

        edtlen = findViewById(R.id.edtlen);
        txtresln = findViewById(R.id.txtresln);

        spinlen = findViewById(R.id.spinlen);
        resspinlen = findViewById(R.id.resspinlen);

        btnlen = findViewById(R.id.btnlen);
        txtreslen1 = findViewById(R.id.txtreslen1);
        txtreslen2 = findViewById(R.id.txtreslen2);

        arrlen.add("Metre");
        arrlen.add("Centimetre");
        arrlen.add("kilometre");

        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, arrlen);
        spinlen.setAdapter(spinnerAdapter);

        spinlen.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 0){
                    txtreslen1.setText(1+"");
                    txt1.setText("Meter");
                } else if(i == 1){
                    txtreslen1.setText(2+"");
                    txt1.setText("Centimeter");
                } else if(i == 2){
                    txtreslen1.setText(3+"");
                    txt1.setText("kilometer");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        ArrayAdapter<String> resspinnerAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, arrlen);
        resspinlen.setAdapter(resspinnerAdapter);

        resspinlen.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 0){
                    txtreslen2.setText(1+"");
                    txt2.setText("Meter");
                } else if(i == 1){
                    txtreslen2.setText(2+"");
                    txt2.setText("Centimeter");
                } else if(i == 2){
                    txtreslen2.setText(3+"");
                    txt2.setText("kilometer");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        btnlen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtreslen1.getText().toString() == "1" && txtreslen2.getText().toString() == "1"){
                    Double len = Double.parseDouble(edtlen.getText().toString());
                    txtresln.setText(len+"");

                } else if(txtreslen1.getText().toString() == "1" && txtreslen2.getText().toString() == "2"){
                    double len = Double.parseDouble(edtlen.getText().toString());
                    double resultlen = len * 100;
                    txtresln.setText(resultlen+"");

                } else if(txtreslen1.getText().toString() == "1" && txtreslen2.getText().toString() == "3"){
                    Double len = Double.parseDouble(edtlen.getText().toString());
                    double resultlen = len / 1000;
                    txtresln.setText(resultlen+"");

                } else if(txtreslen1.getText().toString() == "2" && txtreslen2.getText().toString() == "1"){
                    Double len = Double.parseDouble(edtlen.getText().toString());
                    double resultlen = len / 100;
                    txtresln.setText(resultlen+"");

                } else if(txtreslen1.getText().toString() == "2" && txtreslen2.getText().toString() == "2"){
                    Double len = Double.parseDouble(edtlen.getText().toString());
                    txtresln.setText(len+"");

                } else if(txtreslen1.getText().toString() == "2" && txtreslen2.getText().toString() == "3"){
                    Double len = Double.parseDouble(edtlen.getText().toString());
                    double resultlen = len / 100000;
                    txtresln.setText(resultlen+"");

                } else if(txtreslen1.getText().toString() == "3" && txtreslen2.getText().toString() == "1"){
                    Double len = Double.parseDouble(edtlen.getText().toString());
                    double resultlen = len * 1000;
                    txtresln.setText(resultlen+"");

                } else if(txtreslen1.getText().toString() == "3" && txtreslen2.getText().toString() == "2"){
                    Double len = Double.parseDouble(edtlen.getText().toString());
                    double resultlen = len * 100000;
                    txtresln.setText(resultlen+"");

                } else if(txtreslen1.getText().toString() == "3" && txtreslen2.getText().toString() == "3"){
                    Double len = Double.parseDouble(edtlen.getText().toString());
                    txtresln.setText(len+"");

                }

            }
        });
    }
}