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

public class SummerNavDrawer extends Fragment {
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        MyHelper myHelper = new MyHelper(getContext(),"summer",1);
        SQLiteDatabase db =  myHelper.getWritableDatabase();


        Cursor c =  db.rawQuery("select * from summer",null);
        ListView listView = getView().findViewById(R.id.summerListView);
        Adabter adabter = new Adabter(getContext(),c);
        listView.setAdapter(adabter);
/*
        ContentValues cv1 = new ContentValues();
        cv1.put("_id",47);
        cv1.put("name","Blouse 1");
        cv1.put("salary",15);
        cv1.put("photo" , R.drawable.blouse1);


        ContentValues cv2 = new ContentValues();
        cv2.put("_id",48);
        cv2.put("name","Blouse 2");
        cv2.put("salary",15);
        cv2.put("photo" , R.drawable.blouse2);


        ContentValues cv3 = new ContentValues();
        cv3.put("_id",49);
        cv3.put("name","Blouse 3");
        cv3.put("salary",15);
        cv3.put("photo" , R.drawable.blouse3);


        ContentValues cv4 = new ContentValues();
        cv4.put("_id",50);
        cv4.put("name","Blouse 4");
        cv4.put("salary",15);
        cv4.put("photo" , R.drawable.blouse4);


        ContentValues cv5 = new ContentValues();
        cv5.put("_id",51);
        cv5.put("name","Blouse 5");
        cv5.put("salary",15);
        cv5.put("photo" , R.drawable.blouse5);


        ContentValues cv6 = new ContentValues();
        cv6.put("_id",52);
        cv6.put("name","Blouse 6");
        cv6.put("salary",15);
        cv6.put("photo" , R.drawable.blouse6);

        ContentValues cv7 = new ContentValues();
        cv7.put("_id",53);
        cv7.put("name","Blouse 7");
        cv7.put("salary",15);
        cv7.put("photo" , R.drawable.blouse7);

        ContentValues cv8 = new ContentValues();
        cv8.put("_id",54);
        cv8.put("name","Blouse 8");
        cv8.put("salary",15);
        cv8.put("photo" , R.drawable.blouse8);


       long i = db.insert("summer",null,cv1);
        db.insert("summer",null,cv2);
        db.insert("summer",null,cv3);
        db.insert("summer",null,cv4);
        db.insert("summer",null,cv5);
        db.insert("summer",null,cv6);
        db.insert("summer",null,cv7);
        db.insert("summer",null,cv8);

        if(i != -1){
            Toast.makeText(getContext() , "add" , Toast.LENGTH_SHORT).show();
        }
*/
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getActivity().setTitle("Summer");
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.summernavdrawer, container , false);
    }

}
