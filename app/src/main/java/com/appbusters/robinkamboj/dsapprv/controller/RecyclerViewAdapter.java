package com.appbusters.robinkamboj.dsapprv.controller;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.appbusters.robinkamboj.dsapprv.R;
import com.appbusters.robinkamboj.dsapprv.model.Data;
import com.appbusters.robinkamboj.dsapprv.model.View_Holder;
import com.bumptech.glide.Glide;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RecyclerViewAdapter extends RecyclerView.Adapter<View_Holder>{

    private Context context;
    private List<Data> list = Collections.emptyList();
    private Random mRandom = new Random();

    public RecyclerViewAdapter(Context context, List<Data> list ) {
        this.context = context;
        this.list = list;
    }

    @Override
    public View_Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.row_layout, parent, false);
        return new View_Holder(v);
    }

    @Override
    public void onBindViewHolder(View_Holder holder, int position) {
        final Animation animation = AnimationUtils.loadAnimation(context, R.anim.anim);
        holder.itemView.setAnimation(animation);
        Glide.with(context)
                .load(list.get(position).getDrawable())
                .into(holder.drawable);
//        holder.cardView.getLayoutParams().height = getRandomIntInRange(250, 350);
        holder.header.setText(list.get(position).getHeader());
        holder.drawable.setBackgroundColor(list.get(position).getColor());
    }

//    // Custom method to get a random number between a range
//    protected int getRandomIntInRange(int max, int min){
//        return mRandom.nextInt((max-min)+min)+min;
//    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
