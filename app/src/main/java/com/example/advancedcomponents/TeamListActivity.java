package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class TeamListActivity extends AppCompatActivity {
    public ArrayList<String> teamList;
    public ListView teamListLv;
    public ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_list);
        getSupportActionBar().setTitle("Team List");
        handleTeamListAddButton();
        handleDeleteButton();
        setupTeamListData();
        setupListView();
    }

    public void handleDeleteButton() {
        Button deleteBtn = findViewById(R.id.delate_btn);
        deleteBtn.setOnClickListener(view -> {
            EditText memberNameTxt = findViewById(R.id.member_name_txt);
            String memberName = memberNameTxt.getText().toString();
            arrayAdapter.remove(memberName);
            arrayAdapter.notifyDataSetChanged();
            memberNameTxt.setText("");
        });
    }

    public void handleTeamListAddButton() {
        Button addBtn = findViewById(R.id.add_btn);
        addBtn.setOnClickListener(view -> {
            EditText memberNameTxt = findViewById(R.id.member_name_txt);
            String memberName = memberNameTxt.getText().toString();
            if(memberName.equals("") == false) {
                arrayAdapter.add(memberName);
                arrayAdapter.notifyDataSetChanged();
            }
            memberNameTxt.setText("");
        });
    }

    public void setupTeamListData() {
        teamList = new ArrayList<>();
        teamList.add("Viswanath");
        teamList.add("Renuka");
    }

    public void setupListView() {
        teamListLv = findViewById(R.id.team_list_lv);
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, teamList);
        teamListLv.setAdapter(arrayAdapter);
        teamListLv.setOnItemClickListener((adapterView, view, position, l) -> {
            String memberName = teamList.get(position);
            EditText memberNameTxt = findViewById(R.id.member_name_txt);
            memberNameTxt.setText(memberName);
            Toast.makeText(this, "Click : " + teamList.get(position), Toast.LENGTH_SHORT).show();
        });
    }
}