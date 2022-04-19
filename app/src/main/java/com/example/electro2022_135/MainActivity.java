package com.example.electro2022_135;

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
    public void navigateToSolarMeter(View view) {
        Intent navToSolar = new Intent(MainActivity.this, SolarMeter.class);
        startActivity(navToSolar);
    }

    public void navigateToNextMonth(View view) {
        Intent navToPredict = new Intent(MainActivity.this, PredictBill.class);
        startActivity(navToPredict);
    }
}