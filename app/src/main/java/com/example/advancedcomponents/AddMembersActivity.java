package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class AddMembersActivity extends AppCompatActivity {

    public ArrayList<String> teamList;
    public Spinner selectTeamSp;
    public ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addm_members);
        getSupportActionBar().setTitle("Add Members");
        handleAddButton();
        setUpData();
        setupSpinnerSelectTeam();
    }

    public void handleAddButton() {
        Button addBtn = findViewById(R.id.add_btn);
        addBtn.setOnClickListener(view -> {
            EditText enterNameTxt = findViewById(R.id.enter_name_txt);
            String enterName = enterNameTxt.getText().toString();
            arrayAdapter.add(enterName);
            arrayAdapter.notifyDataSetChanged();
            enterNameTxt.setText("");
        });
    }

    public void setUpData() {
        teamList = new ArrayList<>();
        teamList.add("Team A");
        teamList.add("Team B");
    }

    public void setupSpinnerSelectTeam() {
        selectTeamSp = findViewById(R.id.select_team_sp);
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, teamList);
        selectTeamSp.setAdapter(arrayAdapter);
        selectTeamSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(AddMembersActivity.this, "Select Team = " + teamList.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}