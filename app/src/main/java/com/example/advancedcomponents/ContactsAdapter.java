package com.example.advancedcomponents;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ContactsAdapter extends ArrayAdapter<Contact> {
    public ContactsAdapter(@NonNull Context context, int resource, @NonNull List<Contact> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.contacts_item, parent, false);
        Contact contact = getItem(position);
        TextView nameTxt = view.findViewById(R.id.name_txt);
        nameTxt.setText(contact.name);
        TextView phoneNumberTxt = view.findViewById(R.id.phone_number_txt);
        phoneNumberTxt.setText(contact.phoneNumber);
        return view;
    }
}
