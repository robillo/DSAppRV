package com.appbusters.robinkamboj.dsapprv.controller;

import android.animation.Animator;
import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

import com.appbusters.robinkamboj.dsapprv.R;
import com.appbusters.robinkamboj.dsapprv.model.Data;
import com.appbusters.robinkamboj.dsapprv.model.View_Holder;
import com.bumptech.glide.Glide;
import com.willowtreeapps.spruce.Spruce;
import com.willowtreeapps.spruce.animation.DefaultAnimations;
import com.willowtreeapps.spruce.sort.LinearSort;

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
    public void onBindViewHolder(final View_Holder holder, int position) {
//        animateView(holder.cardView);
        Glide.with(context)
                .load(list.get(position).getDrawable())
                .into(holder.drawable);
        holder.header.setText(list.get(position).getHeader());
        holder.drawable.setBackgroundColor(list.get(position).getColor());
        holder.setClickListener(new ItemClickListener() {
            @Override
            public void onCLick(View v, int position, Boolean isLongClick) {
                if(!isLongClick){
                    if(!list.get(position).getSelected()){
                        Glide.with(context)
                                .load(R.drawable.ic_check_circle_white_24dp)
                                .into(holder.drawable);
                        list.get(position).setSelected(Boolean.TRUE);
                    }
                    else {
                        Glide.with(context)
                                .load(list.get(position).getDrawable())
                                .into(holder.drawable);
                        list.get(position).setSelected(Boolean.FALSE);
                    }
                }
            }
        });
    }

    private void animateView(CardView linearLayout) {

        Animator[] animators = new Animator[]{
                DefaultAnimations.shrinkAnimator(linearLayout, 800L),
                DefaultAnimations.fadeInAnimator(linearLayout, 800L)
        };

        LinearSort linearSort = new LinearSort(100L, false, LinearSort.Direction.TOP_TO_BOTTOM);

        Animator spruceAnimator = new Spruce
                .SpruceBuilder(linearLayout)
                .sortWith(linearSort)
                .animateWith(animators)
                .start();
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
