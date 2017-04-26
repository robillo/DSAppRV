package com.appbusters.robinkamboj.dsapprv.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;

import com.appbusters.robinkamboj.dsapprv.R;
import com.appbusters.robinkamboj.dsapprv.controller.RecyclerViewAdapter;
import com.appbusters.robinkamboj.dsapprv.model.Data;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    private String[] allInterests, diet, yoga, health, religion, motivation, ayurveda, astrology;
    private int[] allColors, allDrawables;
    private RecyclerView recyclerView;
    private GridLayoutManager gridLayoutManager;
    private StaggeredGridLayoutManager staggeredGridLayoutManager;
    private List<Data> data;
    private RecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        allDrawables = new int[]{R.drawable.ic_diet, R.drawable.ic_yoga, R.drawable.ic_health, R.drawable.ic_god, R.drawable.ic_motivation, R.drawable.ic_peace, R.drawable.ic_astrology};
        allInterests = getResources().getStringArray(R.array.allInterests);
        allColors = getResources().getIntArray(R.array.rvItemColors);
        diet = getResources().getStringArray(R.array.diet_array);
        yoga = getResources().getStringArray(R.array.yoga_array);
        health = getResources().getStringArray(R.array.health_array);
        religion = getResources().getStringArray(R.array.religion_array);
        motivation = getResources().getStringArray(R.array.motivation_array);
        ayurveda = getResources().getStringArray(R.array.ayurveda_array);
        astrology = getResources().getStringArray(R.array.astrology_array);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        staggeredGridLayoutManager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        gridLayoutManager = new GridLayoutManager(getApplicationContext(), 3);
        recyclerView.setLayoutManager(gridLayoutManager);

        data = fillWithData();
        adapter = new RecyclerViewAdapter(getApplicationContext(), data);
        recyclerView.setAdapter(adapter);
    }

    private List<Data> fillWithData(){
        List<Data> data = new ArrayList<>();
        for(int i = 0; i < diet.length; i++){
            data.add(new Data(diet[i], allDrawables[0], i+1, allColors[5]));
        }
        for(int i = 0; i < health.length; i++){
            data.add(new Data(health[i], allDrawables[2], i+1, allColors[6]));
        }
        for(int i = 0; i < yoga.length; i++){
            data.add(new Data(yoga[i], allDrawables[1], i+1, allColors[2]));
        }
        return data;
    }
}
