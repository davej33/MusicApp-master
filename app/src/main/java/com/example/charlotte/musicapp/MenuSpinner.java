package com.example.charlotte.musicapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dnj on 9/21/16.
 */

public class MenuSpinner extends Activity implements OnItemSelectedListener{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Spinner element
        Spinner menuSpinner = (Spinner) findViewById(R.id.menu_spinner);

        // Spinner click listener
        menuSpinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add("GO TO:");
        categories.add("HOME");
        categories.add("TRACK INFO");
        categories.add("STATIONS");
        categories.add("FAVORITES");
        categories.add("PURCHASES");


        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        menuSpinner.setAdapter(dataAdapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

        if (position == 1){
            Intent toHome = new Intent(MenuSpinner.this, HomePage.class);
            startActivity(toHome);
        } else if (position == 2){
            Intent toInfo = new Intent(MenuSpinner.this, InfoPageActivity.class);
            startActivity(toInfo);
        }

    }
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }
}