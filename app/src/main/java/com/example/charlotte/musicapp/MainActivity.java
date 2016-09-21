package com.example.charlotte.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find menu image view
        ImageView menu = (ImageView) findViewById(R.id.menu);

        // Set click listener to view
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menuDisplay = new Intent(MainActivity.this, MenuSpinner.class);
                startActivity(menuDisplay);

            }
        });

        // Find info image view
        ImageView trackInfo = (ImageView) findViewById(R.id.track_info);

        // Set click listener
        trackInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trackInfoPage = new Intent(MainActivity.this, InfoPageActivity.class);
                startActivity(trackInfoPage);
            }
        });

    }
}
