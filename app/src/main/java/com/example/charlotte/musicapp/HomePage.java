package com.example.charlotte.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        // Create textview object for resumeJammin
        TextView resumeJammin = (TextView) findViewById(R.id.resumeJamm);

        // Set click listener
        resumeJammin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resumeMainActivity = new Intent(HomePage.this, MainActivity.class);
                startActivity(resumeMainActivity);
            }
        });
    }
}
