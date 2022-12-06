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

public class Weight extends AppCompatActivity {

    TextView txt3, txt4;

    Spinner spinwt;
    Spinner resspinwt;

    EditText edtwt;
    TextView txtreswt;

    Button btnwt;

    TextView txtreswt3, txtreswt4;

    ArrayList<String> arrwt = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);

        txt3 = findViewById(R.id.txt3);
        txt4 = findViewById(R.id.txt4);

        edtwt = findViewById(R.id.edtwt);
        txtreswt = findViewById(R.id.txtreswt);

        spinwt = findViewById(R.id.spinwt);
        resspinwt = findViewById(R.id.resspinwt);

        btnwt = findViewById(R.id.btnwt);
        txtreswt3 = findViewById(R.id.txtreswt3);
        txtreswt4 = findViewById(R.id.txtreswt4);

        arrwt.add("Kilograms");
        arrwt.add("Grams");
        arrwt.add("Miligrams");

        ArrayAdapter<String> spinnerAdapterwt = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, arrwt);
        spinwt.setAdapter(spinnerAdapterwt);

        spinwt.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 0){
                    txtreswt3.setText(1+"");
                    txt3.setText("Kilograms");
                } else if(i == 1){
                    txtreswt3.setText(2+"");
                    txt3.setText("Grams");
                } else if(i == 2){
                    txtreswt3.setText(3+"");
                    txt3.setText("Miligrams");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        ArrayAdapter<String> resspinnerAdapterwt = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, arrwt);
        resspinwt.setAdapter(resspinnerAdapterwt);

        resspinwt.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 0){
                    txtreswt4.setText(1+"");
                    txt4.setText("Kilograms");
                } else if(i == 1){
                    txtreswt4.setText(2+"");
                    txt4.setText("Grams");
                } else if(i == 2){
                    txtreswt4.setText(3+"");
                    txt4.setText("Miligrams");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        btnwt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtreswt3.getText().toString() == "1" && txtreswt4.getText().toString() == "1"){
                    Double wt = Double.parseDouble(edtwt.getText().toString());
                    txtreswt.setText(wt+"");

                } else if(txtreswt3.getText().toString() == "1" && txtreswt4.getText().toString() == "2"){
                    double wt = Double.parseDouble(edtwt.getText().toString());
                    double resultwt = wt * 1000;
                    txtreswt.setText(resultwt+"");

                } else if(txtreswt3.getText().toString() == "1" && txtreswt4.getText().toString() == "3"){
                    Double wt = Double.parseDouble(edtwt.getText().toString());
                    double resultwt = wt * 1000000;
                    txtreswt.setText(resultwt+"");

                } else if(txtreswt3.getText().toString() == "2" && txtreswt4.getText().toString() == "1"){
                    Double wt = Double.parseDouble(edtwt.getText().toString());
                    double resultwt = wt / 1000;
                    txtreswt.setText(resultwt+"");

                } else if(txtreswt3.getText().toString() == "2" && txtreswt4.getText().toString() == "2"){
                    Double wt = Double.parseDouble(edtwt.getText().toString());
                    txtreswt.setText(wt+"");

                } else if(txtreswt3.getText().toString() == "2" && txtreswt4.getText().toString() == "3"){
                    Double len = Double.parseDouble(edtwt.getText().toString());
                    double resultwt = len * 1000;
                    txtreswt.setText(resultwt+"");

                } else if(txtreswt3.getText().toString() == "3" && txtreswt4.getText().toString() == "1"){
                    Double wt = Double.parseDouble(edtwt.getText().toString());
                    double resultwt = wt / 1000000;
                    txtreswt.setText(resultwt+"");

                } else if(txtreswt3.getText().toString() == "3" && txtreswt4.getText().toString() == "2"){
                    Double wt = Double.parseDouble(edtwt.getText().toString());
                    double resultwt = wt / 1000;
                    txtreswt.setText(resultwt+"");

                } else if(txtreswt3.getText().toString() == "3" && txtreswt4.getText().toString() == "3"){
                    Double wt = Double.parseDouble(edtwt.getText().toString());
                    txtreswt.setText(wt+"");

                }

            }
        });
    }
}