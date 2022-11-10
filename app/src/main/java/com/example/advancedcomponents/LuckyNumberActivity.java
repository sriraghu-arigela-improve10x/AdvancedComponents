package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class LuckyNumberActivity extends AppCompatActivity {

    public ArrayList<Integer> luckyNumbers;
    public Spinner luckyNumberSp;
    public ArrayAdapter<Integer> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lucky_number);
        getSupportActionBar().setTitle("Lucky Number");
        setUpData();
        setupSpinner();
    }

    public void setUpData() {
        luckyNumbers = new ArrayList<>();
        luckyNumbers.add(1);
        luckyNumbers.add(2);
        luckyNumbers.add(3);
        luckyNumbers.add(4);
        luckyNumbers.add(5);
        luckyNumbers.add(6);
        luckyNumbers.add(7);
        luckyNumbers.add(8);
        luckyNumbers.add(9);
        luckyNumbers.add(10);

    }

    public void setupSpinner() {
        luckyNumberSp = findViewById(R.id.lucky_number_sp);
        arrayAdapter = new ArrayAdapter<Integer>(this, R.layout.dropdwon_item, luckyNumbers);
        luckyNumberSp.setAdapter(arrayAdapter);
        luckyNumberSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(LuckyNumberActivity.this, "Lucky Number : " + luckyNumbers.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}