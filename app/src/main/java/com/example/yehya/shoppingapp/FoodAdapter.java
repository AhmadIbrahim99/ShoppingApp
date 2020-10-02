package com.example.yehya.shoppingapp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<CompontViewHolder> {

    ArrayList<componts> compont ;
    final int itemLayoutId ;
    final ShoppingApp mainActivity ;

    public FoodAdapter(ShoppingApp mainActivity, ArrayList<componts>  componts, int itemLayoutId ){

        this.mainActivity = mainActivity;
        this.compont = componts ;
        this.itemLayoutId = itemLayoutId;
    }

    @NonNull
    @Override
    public CompontViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
       View view = LayoutInflater.from(viewGroup.getContext()).inflate(itemLayoutId , viewGroup , false) ;
        CompontViewHolder vh = new CompontViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull CompontViewHolder myViewHolder, int i) {
        componts c = compont.get(i);
        myViewHolder.photoIm.setImageResource(c.getPhotoIm());
        myViewHolder.name.setText(c.getName());

        View view = myViewHolder.itemView;
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mainActivity ,FoodNavigationDrawer.class);
                mainActivity.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return compont.size();
    }
}
