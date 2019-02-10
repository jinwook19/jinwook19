package com.example.drum0.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Button01Clicked(View v) {
        setContentView(R.layout.second);
    }

    public void Button02Clicked(View v){
        setContentView(R.layout.third);
    }

}
