package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class DateOfBirthActivity extends AppCompatActivity {

    public ArrayList<Integer> dates;
    public Spinner dateSp;
    public ArrayAdapter<Integer> arrayAdapter;

    public ArrayList<String> months;
    public Spinner monthSp;
    public ArrayAdapter<String> stringArrayAdapter;

    public ArrayList<Integer> years;
    public Spinner yearSp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_of_birth);
        getSupportActionBar().setTitle("Date of Birth");
        setUpDateData();
        setUpMonthData();
        setUpYearData();
        setSpinnerDate();
        setSpinnerMonth();
        setSpinnerYear();
    }

    public void setUpYearData() {
        years = new ArrayList<>();
        years.add(1961);
        years.add(1962);
        years.add(1963);
        years.add(1964);
        years.add(1965);
        years.add(1966);
        years.add(1967);
        years.add(1968);
        years.add(1969);
        years.add(1970);
        years.add(1971);
        years.add(1972);
        years.add(1973);
        years.add(1974);
        years.add(1975);
        years.add(1976);
        years.add(1977);
        years.add(1978);
        years.add(1979);
        years.add(1980);
        years.add(1981);
        years.add(1982);
        years.add(1983);
        years.add(1984);
        years.add(1985);
        years.add(1986);
        years.add(1987);
        years.add(1988);
        years.add(1989);
        years.add(1990);
        years.add(1991);
        years.add(1992);
        years.add(1993);
        years.add(1994);
        years.add(1995);
        years.add(1996);
        years.add(1997);
        years.add(1998);
        years.add(1999);
        years.add(2000);
        years.add(2001);
        years.add(2002);
        years.add(2003);
        years.add(2004);
        years.add(2005);
        years.add(2006);
        years.add(2007);
        years.add(2008);
        years.add(2009);
        years.add(2010);
        years.add(2011);
        years.add(2012);
        years.add(2013);
        years.add(2014);
        years.add(2015);
        years.add(2016);
        years.add(2017);
        years.add(2018);
        years.add(2019);
        years.add(2020);
        years.add(2021);
        years.add(2022);
    }

    public void setUpMonthData() {
        months = new ArrayList<>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");
    }

    public void setUpDateData() {
        dates = new ArrayList<>();
        dates.add(1);
        dates.add(2);
        dates.add(3);
        dates.add(4);
        dates.add(5);
        dates.add(6);
        dates.add(7);
        dates.add(8);
        dates.add(9);
        dates.add(10);
        dates.add(11);
        dates.add(12);
        dates.add(13);
        dates.add(14);
        dates.add(15);
        dates.add(16);
        dates.add(17);
        dates.add(18);
        dates.add(19);
        dates.add(20);
        dates.add(21);
        dates.add(22);
        dates.add(23);
        dates.add(24);
        dates.add(25);
        dates.add(26);
        dates.add(27);
        dates.add(28);
        dates.add(29);
        dates.add(30);
        dates.add(31);
    }

    public void setSpinnerDate() {
        dateSp = findViewById(R.id.date_sp);
        arrayAdapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_list_item_1, dates);
        dateSp.setAdapter(arrayAdapter);
        dateSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(DateOfBirthActivity.this, "Date : " + dates.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public void setSpinnerMonth() {
        monthSp = findViewById(R.id.month_sp);
        stringArrayAdapter = new ArrayAdapter<String>(this, R.layout.months_dropdwon_item,months);
        monthSp.setAdapter(stringArrayAdapter);
        monthSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(DateOfBirthActivity.this, "Month : " + months.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public void setSpinnerYear() {
        yearSp = findViewById(R.id.year_sp);
        arrayAdapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_list_item_1, years);
        yearSp.setAdapter(arrayAdapter);
        yearSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(DateOfBirthActivity.this, "Year : " + years.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}