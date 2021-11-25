package com.example.dwmtapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickStartTest(View view){
        Intent intent = new Intent(this, DwmtActivity.class);
        startActivity(intent);
    }

    public void onClickSetting(View view){
        Intent intent = new Intent(this, DwmtSettingActivity.class);
        startActivity(intent);
    }
}