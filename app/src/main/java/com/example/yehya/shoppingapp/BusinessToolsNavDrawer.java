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

public class BusinessToolsNavDrawer extends Fragment {


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        MyHelper myHelper = new MyHelper(getContext(),"business",1);
        SQLiteDatabase db =  myHelper.getReadableDatabase();


        Cursor c =  db.rawQuery("select * from business",null);
        ListView listView = getView().findViewById(R.id.businessToolListView);
        Adabter adabter = new Adabter(getContext(),c);
        listView.setAdapter(adabter);
/*
        ContentValues cv1 = new ContentValues();
        cv1.put("_id",1);
        cv1.put("name","glasses1");
        cv1.put("salary",30);
        cv1.put("photo" , R.drawable.glasses1);


        ContentValues cv2 = new ContentValues();
        cv2.put("_id",2);
        cv2.put("name","glasses2");
        cv2.put("salary",30);
        cv2.put("photo" , R.drawable.glasses2);


        ContentValues cv3 = new ContentValues();
        cv3.put("_id",3);
        cv3.put("name","glasses3");
        cv3.put("salary",30);
        cv3.put("photo" , R.drawable.glasses3);


        ContentValues cv4 = new ContentValues();
        cv4.put("_id",4);
        cv4.put("name","Jaguar");
        cv4.put("salary",30);
        cv4.put("photo" , R.drawable.perfume1);


        ContentValues cv5 = new ContentValues();
        cv5.put("_id",5);
        cv5.put("name","Sauvage");
        cv5.put("salary",30);
        cv5.put("photo" , R.drawable.perfume2);


        ContentValues cv6 = new ContentValues();
        cv6.put("_id",6);
        cv6.put("name","watch1");
        cv6.put("salary",30);
        cv6.put("photo" , R.drawable.watch1);

        ContentValues cv7 = new ContentValues();
        cv7.put("_id",7);
        cv7.put("name","watch2");
        cv7.put("salary",30);
        cv7.put("photo" , R.drawable.watch2);


        long i =db.insert("business",null,cv1);
        db.insert("business",null,cv2);
        db.insert("business",null,cv3);
        db.insert("business",null,cv4);
        db.insert("business",null,cv5);
        db.insert("business",null,cv6);
        db.insert("business",null,cv7);
        if(i != -1){
            Toast.makeText(getContext() , "add" , Toast.LENGTH_SHORT).show();
        }
        */
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getActivity().setTitle("Accessories");
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.businesstoolsnavdrawer, container , false);
    }

}
