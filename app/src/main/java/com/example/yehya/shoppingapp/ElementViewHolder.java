package com.example.yehya.shoppingapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ElementViewHolder extends RecyclerView.ViewHolder {

    ImageView photoIm;
    TextView name;
    TextView salary;
    Button addElement;

    public ElementViewHolder(@NonNull View itemView) {
        super(itemView);
        photoIm = itemView.findViewById(R.id.elementPhotoIm);
        name = itemView.findViewById(R.id.elementName);
        salary = itemView.findViewById(R.id.elementSalary);
        addElement = itemView.findViewById(R.id.elementAddBtn);
    }
}
