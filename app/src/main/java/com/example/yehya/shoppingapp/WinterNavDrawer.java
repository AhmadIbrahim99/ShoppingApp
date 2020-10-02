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

public class WinterNavDrawer extends Fragment {

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        MyHelper myHelper = new MyHelper(getContext(),"winter",1);
        SQLiteDatabase db =  myHelper.getWritableDatabase();



        Cursor c =  db.rawQuery("select * from winter",null);
        ListView listView = getView().findViewById(R.id.winterListView);
        Adabter adabter = new Adabter(getContext(),c);
        listView.setAdapter(adabter);
/*
        ContentValues cv1 = new ContentValues();
        cv1.put("_id",62);
        cv1.put("name","Jacket 1");
        cv1.put("salary",35);
        cv1.put("photo" , R.drawable.jacket1);


        ContentValues cv2 = new ContentValues();
        cv2.put("_id",63);
        cv2.put("name","Jacket 2");
        cv2.put("salary",35);
        cv2.put("photo" , R.drawable.jacket2);


        ContentValues cv3 = new ContentValues();
        cv3.put("_id",64);
        cv3.put("name","Jacket 3");
        cv3.put("salary",35);
        cv3.put("photo" , R.drawable.jacket3);


        ContentValues cv4 = new ContentValues();
        cv4.put("_id",65);
        cv4.put("name","Jacket 4");
        cv4.put("salary",35);
        cv4.put("photo" , R.drawable.jacket4);


        ContentValues cv5 = new ContentValues();
        cv5.put("_id",66);
        cv5.put("name","Jacket 5");
        cv5.put("salary",35);
        cv5.put("photo" , R.drawable.jacket5);


       long i = db.insert("winter",null,cv1);
        db.insert("winter",null,cv2);
        db.insert("winter",null,cv3);
        db.insert("winter",null,cv4);
        db.insert("winter",null,cv5);

        if(i != -1){
            Toast.makeText(getContext() , "add" , Toast.LENGTH_SHORT).show();
        }
*/
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getActivity().setTitle("Winter");
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.winternavdrawer, container , false);
    }

}
