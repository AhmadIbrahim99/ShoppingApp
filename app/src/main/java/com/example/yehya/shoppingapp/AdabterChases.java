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
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class AdabterChases extends CursorAdapter {
    public AdabterChases(Context context, Cursor c) {
        super(context, c, 1);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {

        View view =LayoutInflater.from(context).inflate(R.layout.purchases_item , parent , false);
        return view;
    }

    @Override
    public void bindView(View view, final Context context, Cursor cursor) {

        TextView nameTv = view.findViewById(R.id.nameChases);
        TextView salaryTv = view.findViewById(R.id.salaryChases);
        ImageView photoImgv = view.findViewById(R.id.photochases);
        TextView allsalaryTv = view.findViewById(R.id.allSalary);
        ImageButton button = view.findViewById(R.id.deleteBut);


        final String name =cursor.getString(cursor.getColumnIndex("name"));
        final String photo =cursor.getString(cursor.getColumnIndex("photo"));
        final double salary =cursor.getDouble(cursor.getColumnIndex("salary"));
        final int id =cursor.getInt(cursor.getColumnIndex("_id"));

        nameTv.setText(name);
        salaryTv.setText((int) salary);
        photoImgv.setImageResource(Integer.parseInt(photo));


        double allSalary = 0;

        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            double salaryForAll = cursor.getDouble(cursor.getColumnIndex("salary"));
            allSalary += salaryForAll;
        }
        cursor.close();

        allsalaryTv.setText((int) allSalary);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyHelper myHelper = new MyHelper(context,"choseing",1);
                SQLiteDatabase db =  myHelper.getWritableDatabase();
                db.delete("choseing" , "_id=?" , new String[]{String.valueOf(id)});
                Cursor newCurser =  db.rawQuery("select * from choseing",null);
                swapCursor(newCurser);
            }
        });
    }
}
