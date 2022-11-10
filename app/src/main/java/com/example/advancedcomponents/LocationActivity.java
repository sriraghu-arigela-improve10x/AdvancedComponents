package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class LocationActivity extends AppCompatActivity {

    public ArrayList<String> locations;
    public Spinner stateLocationSp;
    public ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        getSupportActionBar().setTitle("Location");
        setUpData();
        setupSpinnerLocation();
    }

    public void setUpData() {
        locations = new ArrayList<>();
        locations.add("Andhra Pradesh");
        locations.add("Arunachal Pradesh");
        locations.add("Assam");
        locations.add("Bihar");
        locations.add("Chhattisgarh");
        locations.add("Goa");
        locations.add("Gujarat");
        locations.add("Haryana");
        locations.add("Himachal Pradesh");
        locations.add("Jharkhand");
        locations.add("Karnataka");
        locations.add("Kerala");
        locations.add("Madhya Pradesh");
        locations.add("Maharashtra");
        locations.add("Manipur");
        locations.add("Meghalaya");
        locations.add("Mizoram");
        locations.add("Nagaland");
        locations.add("Odisha");
        locations.add("Punjab");
        locations.add("Rajasthan");
        locations.add("Sikkim");
        locations.add("Tamil Nadu");
        locations.add("Telangana");
        locations.add("Tripura");
        locations.add("Uttar Pradesh");
        locations.add("Uttarakhand");
        locations.add("West Bengal");
    }

    public void setupSpinnerLocation() {
        stateLocationSp = findViewById(R.id.state_location_sp);
        arrayAdapter = new ArrayAdapter<String>(this, R.layout.state_dropdwon_item, locations);
        stateLocationSp.setAdapter(arrayAdapter);
        stateLocationSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(LocationActivity.this, "Location : " + locations.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
