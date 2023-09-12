package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ItemsScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items_screen);

        TextView text1= findViewById(R.id.search);
        TextView text2= findViewById(R.id.chat);
        TextView text3= findViewById(R.id.profile);
        TextView text4= findViewById(R.id.plusb);
//        spotit
//        loginin


        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ItemsScreen.this, Profilescreen.class);
                startActivity(intent);
            }
        });
        text4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ItemsScreen.this, ItemNav.class);
                startActivity(intent);
            }
        });

        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ItemsScreen.this, DisplayScreen.class);
                startActivity(intent);
            }
        });
        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ItemsScreen.this, chatScreen.class);
                startActivity(intent);
            }
        });
    }
}