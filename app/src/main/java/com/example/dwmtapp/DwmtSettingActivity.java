package com.example.dwmtapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DwmtSettingActivity extends AppCompatActivity {

    public int answertype;
    public int checktype;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dwmt_setting);
        answertype = 1;
        checktype = 1;
    }

    public void onClickOXBtn(View view){
        answertype = 1;
        TextView nowanswer = findViewById(R.id.nowanswer);
        nowanswer.setText("OX퀴즈");
    }

    public void onClickFourBtn(View view){
        answertype = 2;
        TextView nowanswer = findViewById(R.id.nowanswer);
        nowanswer.setText("객관식");
    }

    public void onClickAllBtn(View view){
        answertype = 3;
        TextView nowanswer = findViewById(R.id.nowanswer);
        nowanswer.setText("둘 다");
    }

    public void onClickSpeedBtn(View view){
        checktype = 1;
        TextView nowcheck = findViewById(R.id.nowcheck);
        nowcheck.setText("1분 제한");
    }

    public void onClickManyBtn(View view){
        checktype = 2;
        TextView nowcheck = findViewById(R.id.nowcheck);
        nowcheck.setText("20문제");
    }

    public void onClickSettingEndBtn(View v){
        finish();
    }
}