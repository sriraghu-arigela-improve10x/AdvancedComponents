package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().setTitle("Home");
        handleLuckyNumberBtn();
        handleLocationBtn();
        handleDateOfBirthBtn();
        handleTeamBtn();
        handleTeamListBtn();
        handleContactsBtn();
        handleAddMembersBtn();

    }

    public void handleLuckyNumberBtn() {
        Button luckyNumberBtn = findViewById(R.id.lucky_number_btn);
        luckyNumberBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, LuckyNumberActivity.class);
            startActivity(intent);
        });
    }

    public void handleLocationBtn() {
        Button locationBtn = findViewById(R.id.location_btn);
        locationBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, LocationActivity.class);
            startActivity(intent);
        });
    }

    public void handleDateOfBirthBtn() {
        Button locationBtn = findViewById(R.id.date_of_birth_btn);
        locationBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, DateOfBirthActivity.class);
            startActivity(intent);
        });
    }

    public void handleTeamBtn() {
        Button teamBtn = findViewById(R.id.team_btn);
        teamBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, TeamActivity.class);
            startActivity(intent);
        });
    }

    public void handleTeamListBtn() {
        Button teamListBtn = findViewById(R.id.team_list_btn);
        teamListBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, TeamListActivity.class);
            startActivity(intent);
        });
    }

    public void handleContactsBtn() {
        Button contactsBtn = findViewById(R.id.contacts_btn);
        contactsBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, ContactsActivity.class);
            startActivity(intent);
        });
    }

    public void handleAddMembersBtn() {
        Button addMembersBtn = findViewById(R.id.add_members_btn);
        addMembersBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, AddMembersActivity.class);
            startActivity(intent);
        });
    }
}