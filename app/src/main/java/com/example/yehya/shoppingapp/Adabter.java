package com.example.yehya.shoppingapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Adabter extends CursorAdapter {
    public Adabter(Context context, Cursor c) {
        super(context, c, 1);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {

        View view =LayoutInflater.from(context).inflate(R.layout.element_item_design , parent , false);
        return view;
    }

    @Override
    public void bindView(View view, final Context context, Cursor cursor) {

        TextView nameTv = view.findViewById(R.id.elementName);
        TextView salaryTv = view.findViewById(R.id.elementSalary);
        ImageView photoIm = view.findViewById(R.id.elementPhotoIm);
        Button button = view.findViewById(R.id.elementAddBtn);


        final String name =cursor.getString(cursor.getColumnIndex("name"));
        final int salary =cursor.getInt(cursor.getColumnIndex("salary"));
        final int photo =cursor.getInt(cursor.getColumnIndex("photo"));
        final int id =cursor.getInt(cursor.getColumnIndex("_id"));


        nameTv.setText(name);
        salaryTv.setText(salary + "");
        photoIm.setImageResource(photo);



        MyHelper myHelper = new MyHelper(context,"chose",1);
        final SQLiteDatabase db =  myHelper.getWritableDatabase();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ContentValues cv = new ContentValues();
                cv.put("name",name);
                cv.put("salary",salary);
                cv.put("photo" , photo);
                cv.put("_id" , id);
                long i =  db.insert("choseing",null,cv);
                if(i != -1){
                    Toast.makeText(context , "Add Successf" , Toast.LENGTH_SHORT).show();
                }else if(i == -1) {
                    Toast.makeText(context , "Add not Successf" , Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
