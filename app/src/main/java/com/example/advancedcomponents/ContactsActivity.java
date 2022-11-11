package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ContactsActivity extends AppCompatActivity {

    public ArrayList<Contact> contactsList;
    public ListView contactsLv;
    public ContactsAdapter contactsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
        getSupportActionBar().setTitle("Contacts");
        handleContactsAddBtn();
        setupData();
        setupContactsListView();
    }

    public void handleContactsAddBtn() {
        Button addBtn = findViewById(R.id.add_btn);
        addBtn.setOnClickListener(view -> {
            EditText contactNameTxt = findViewById(R.id.name_txt);
            String contactName = contactNameTxt.getText().toString();
            EditText phoneNumberTxt = findViewById(R.id.phone_name_txt);
            String phoneNumber = phoneNumberTxt.getText().toString();
            Toast.makeText(this, contactName + phoneNumber, Toast.LENGTH_SHORT).show();
        });
    }

    public void setupContactsListView() {
        contactsLv = findViewById(R.id.contats_lv);
        contactsAdapter = new ContactsAdapter(this,R.layout.contacts_item, contactsList);
        contactsLv.setAdapter(contactsAdapter);
    }

    public void setupData() {
        contactsList = new ArrayList<>();

        Contact contact1 = new Contact();
        contact1.name = "Viswanath";
        contact1.phoneNumber = "+91 9000540052";
        contactsList.add(contact1);

        Contact contact2 = new Contact();
        contact2.name = "Renuka";
        contact2.phoneNumber = "+91 9886655979";
        contactsList.add(contact2);
    }
}