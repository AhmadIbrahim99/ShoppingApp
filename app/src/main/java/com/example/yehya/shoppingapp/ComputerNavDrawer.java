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

public class ComputerNavDrawer extends Fragment {

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        MyHelper myHelper = new MyHelper(getContext(),"Computer",1);
        SQLiteDatabase db =  myHelper.getReadableDatabase();



        Cursor c =  db.rawQuery("select * from Computer",null);
        ListView listView = getView().findViewById(R.id.computerListView);
        Adabter adabter = new Adabter(getContext(),c);
        listView.setAdapter(adabter);
 /*
        ContentValues cv1 = new ContentValues();
        cv1.put("_id",8);
        cv1.put("name","Apple Mac Mini");
        cv1.put("salary",100);
        cv1.put("photo" , R.drawable.apple_mac_mini);


        ContentValues cv2 = new ContentValues();
        cv2.put("_id",9);
        cv2.put("name","Macbook Air Gold");
        cv2.put("salary",100);
        cv2.put("photo" , R.drawable.macbook_air_gold);


        ContentValues cv3 = new ContentValues();
        cv3.put("_id",10);
        cv3.put("name","Macbook Air Space Gray");
        cv3.put("salary",100);
        cv3.put("photo" , R.drawable.macbook_air_space_gray);


        ContentValues cv4 = new ContentValues();
        cv4.put("_id",11);
        cv4.put("name","Macbook Pro");
        cv4.put("salary",100);
        cv4.put("photo" , R.drawable.macbook_pro);


        ContentValues cv5 = new ContentValues();
        cv5.put("_id",12);
        cv5.put("name","HP Laptop i7");
        cv5.put("salary",100);
        cv5.put("photo" , R.drawable.hp_laptop_i7);


        ContentValues cv6 = new ContentValues();
        cv6.put("_id",13);
        cv6.put("name","HP Laptop i5");
        cv6.put("salary",100);
        cv6.put("photo" , R.drawable.hp_laptop_i5);

        ContentValues cv7 = new ContentValues();
        cv7.put("_id",14);
        cv7.put("name","HP Laptop i3");
        cv7.put("salary",100);
        cv7.put("photo" , R.drawable.hp_laptop_i3);

        ContentValues cv8 = new ContentValues();
        cv8.put("_id",15);
        cv8.put("name","Lenovo Laptop i7");
        cv8.put("salary",100);
        cv8.put("photo" , R.drawable.lenovo_laptop_i7);

        ContentValues cv9 = new ContentValues();
        cv9.put("_id",16);
        cv9.put("name","Lenovo Laptop i5");
        cv9.put("salary",100);
        cv9.put("photo" , R.drawable.lenovo_laptop_i5);

        long i =db.insert("Computer",null,cv1);
        db.insert("Computer",null,cv2);
        db.insert("Computer",null,cv3);
        db.insert("Computer",null,cv4);
        db.insert("Computer",null,cv5);
        db.insert("Computer",null,cv6);
        db.insert("Computer",null,cv7);
        db.insert("Computer",null,cv8);
        db.insert("Computer",null,cv9);

        if(i != -1){
            Toast.makeText(getContext() , "add" , Toast.LENGTH_SHORT).show();
        }
        */
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getActivity().setTitle("Laptop");
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.computernavdrawer, container , false);
    }

}
