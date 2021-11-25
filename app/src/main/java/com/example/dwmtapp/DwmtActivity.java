package com.example.dwmtapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class DwmtActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dwmt);

        Intent intent = new Intent(this, Dwmt.class);
        startActivity(intent);

        Metronome metronome = new Metronome();
    }
    
    
}