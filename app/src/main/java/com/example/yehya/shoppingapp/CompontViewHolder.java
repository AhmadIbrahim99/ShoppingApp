package com.example.yehya.shoppingapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class CompontViewHolder extends RecyclerView.ViewHolder {

    ImageView photoIm;
    TextView name;
    public CompontViewHolder(@NonNull View itemView) {
        super(itemView);
        photoIm = itemView.findViewById(R.id.compontPhotoIm);
        name = itemView.findViewById(R.id.compontName);
    }
}
