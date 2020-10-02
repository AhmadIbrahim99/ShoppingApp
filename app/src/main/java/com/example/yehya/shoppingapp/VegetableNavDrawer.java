package com.example.yehya.shoppingapp;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

public class VegetableNavDrawer extends Fragment {
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        MyHelper myHelper = new MyHelper(getContext(),"vegetable",1);
        SQLiteDatabase db =  myHelper.getWritableDatabase();


        Cursor c =  db.rawQuery("select * from vegetable",null);
        ListView listView = getView().findViewById(R.id.vegtableListView);
        Adabter adabter = new Adabter(getContext(),c);
        listView.setAdapter(adabter);
/*
        ContentValues cv1 = new ContentValues();
        cv1.put("_id",55);
        cv1.put("name","Tomatoes");
        cv1.put("salary",5);
        cv1.put("photo" , R.drawable.tomatoes);


        ContentValues cv2 = new ContentValues();
        cv2.put("_id",56);
        cv2.put("name","Potato");
        cv2.put("salary",5);
        cv2.put("photo" , R.drawable.potato);


        ContentValues cv3 = new ContentValues();
        cv3.put("_id",57);
        cv3.put("name","Green Pepper");
        cv3.put("salary",5);
        cv3.put("photo" , R.drawable.green_pepper);


        ContentValues cv4 = new ContentValues();
        cv4.put("_id",58);
        cv4.put("name","Lemon");
        cv4.put("salary",5);
        cv4.put("photo" , R.drawable.lemon);


        ContentValues cv5 = new ContentValues();
        cv5.put("_id",59);
        cv5.put("name","Onions");
        cv5.put("salary",5);
        cv5.put("photo" , R.drawable.onions);


        ContentValues cv6 = new ContentValues();
        cv6.put("_id",60);
        cv6.put("name","Parsley");
        cv6.put("salary",5);
        cv6.put("photo" , R.drawable.parsley);

        ContentValues cv7 = new ContentValues();
        cv7.put("_id",61);
        cv7.put("name","Radish");
        cv7.put("salary",5);
        cv7.put("photo" , R.drawable.radish);


       long i = db.insert("vegetable",null,cv1);
        db.insert("vegetable",null,cv2);
        db.insert("vegetable",null,cv3);
        db.insert("vegetable",null,cv4);
        db.insert("vegetable",null,cv5);
        db.insert("vegetable",null,cv6);
        db.insert("vegetable",null,cv7);

        if(i != -1){
            Toast.makeText(getContext() , "add" , Toast.LENGTH_SHORT).show();
        }
*/
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getActivity().setTitle("Vegtable");
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.vegtablenavdrawer, container , false);
    }

}
