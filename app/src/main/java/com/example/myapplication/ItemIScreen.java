package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ItemIScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_iscreen);
        ImageView text3= findViewById(R.id.backButton);
        TextView text4= findViewById(R.id.report);
        ImageView text5=  findViewById(R.id.uimage);
        ImageView text6=findViewById(R.id.uvideo);
        Button text7= findViewById(R.id.postitem);

        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ItemIScreen.this, ItemsScreen.class);
                startActivity(intent);
            }
        });
        text4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ItemIScreen.this, report.class);
                startActivity(intent);
            }
        });
        text5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ItemIScreen.this, CameraScreen.class);
                startActivity(intent);
            }
        });
        text6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ItemIScreen.this, videoscreen.class);
                startActivity(intent);
            }
        });
        text7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ItemIScreen.this, editProfile.class);
                startActivity(intent);
            }
        });
    }
}