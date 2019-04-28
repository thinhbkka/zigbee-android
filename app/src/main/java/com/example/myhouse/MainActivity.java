package com.example.myhouse;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout mLlRoom1;
    private LinearLayout mLlRoom2;
    private LinearLayout mLlRoom3;
    private LinearLayout mLlRoom4;
    private LinearLayout mLlRoom5;
    private LinearLayout mLlRoom6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        setOnClick();
    }

    private void init() {
        mLlRoom1 = findViewById(R.id.llRoom1);
        mLlRoom2 = findViewById(R.id.llRoom2);
        mLlRoom3 = findViewById(R.id.llRoom3);
        mLlRoom4 = findViewById(R.id.llRoom4);
        mLlRoom5 = findViewById(R.id.llRoom5);
        mLlRoom6 = findViewById(R.id.llRoom6);
    }

    private void setOnClick() {
        mLlRoom1.setOnClickListener(this);
        mLlRoom2.setOnClickListener(this);
        mLlRoom3.setOnClickListener(this);
        mLlRoom4.setOnClickListener(this);
        mLlRoom5.setOnClickListener(this);
        mLlRoom6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            // Click listener room 1
            case R.id.llRoom1:
                openRoom(1);
                break;

            // Click listener room 2
            case R.id.llRoom2:
                openRoom(2);
                break;

            // Click listener room 3
            case R.id.llRoom3:
                openRoom(3);
                break;

            // Click listener room 4
            case R.id.llRoom4:
                openRoom(4);
                break;

            // Click listener room 5
            case R.id.llRoom5:
                openRoom(5);
                break;

            // Click listener room 6
            case R.id.llRoom6:
                openRoom(6);
                break;

        }
    }

    //TODO update room later
    private void openRoom(int type) {
        switch (type) {
            case 1:
                startActivity(new Intent(this, LIVINGROOM.class));
                break;
            case 2:
                startActivity(new Intent(this, LIVINGROOM.class));
                break;
            case 3:
                startActivity(new Intent(this, LIVINGROOM.class));
                break;
            case 4:
                startActivity(new Intent(this, LIVINGROOM.class));
                break;
            case 5:
                startActivity(new Intent(this, LIVINGROOM.class));
                break;
            case 6:
                startActivity(new Intent(this, LIVINGROOM.class));
                break;
        }
    }
}