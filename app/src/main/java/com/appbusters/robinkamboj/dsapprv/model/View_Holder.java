package com.appbusters.robinkamboj.dsapprv.model;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.appbusters.robinkamboj.dsapprv.R;

public class View_Holder extends RecyclerView.ViewHolder{

    public CardView cardView;
    public ImageView drawable;
    public TextView header;
    public LinearLayout ll;

    public View_Holder(View itemView) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.cardView);
        drawable = (ImageView) itemView.findViewById(R.id.imageView);
        header = (TextView) itemView.findViewById(R.id.textView);
        ll = (LinearLayout) itemView.findViewById(R.id.ll);
    }
}
