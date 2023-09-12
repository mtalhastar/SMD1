package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.myapplication.databinding.ActivitySearchResultScreenBinding;

public class SearchResultScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result_screen);
        ImageView text3= findViewById(R.id.backButton);
//        spotit
//        loginin


        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearchResultScreen.this, ItemsScreen.class);
                startActivity(intent);
            }
        });
    }

}