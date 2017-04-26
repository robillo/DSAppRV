package com.appbusters.robinkamboj.dsapprv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private String[] allInterests, diet, yoga, health, religion, motivation, ayurveda, astrology;
    private int[] allColors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        allInterests = getResources().getStringArray(R.array.allInterests);
        allColors = getResources().getIntArray(R.array.rvItemColors);
        diet = getResources().getStringArray(R.array.diet_array);
        yoga = getResources().getStringArray(R.array.yoga_array);
        health = getResources().getStringArray(R.array.health_array);
        religion = getResources().getStringArray(R.array.religion_array);
        motivation = getResources().getStringArray(R.array.motivation_array);
        ayurveda = getResources().getStringArray(R.array.ayurveda_array);
        astrology = getResources().getStringArray(R.array.astrology_array);
    }
}
