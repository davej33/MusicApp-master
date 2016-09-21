package com.example.charlotte.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class InfoPageActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_page);

        // Find menu image view
        ImageView menu = (ImageView) findViewById(R.id.menu);

        // Set click listener to view
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menuDisplay = new Intent(InfoPageActivity.this, MenuSpinnerInfoPage.class);
                startActivity(menuDisplay);

            }
        });
    }
}
