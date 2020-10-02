package com.example.yehya.shoppingapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class FishNavDrawer extends Fragment {

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        MyHelper myHelper = new MyHelper(getContext(),"fish",1);
        SQLiteDatabase db =  myHelper.getReadableDatabase();


        Cursor c =  db.rawQuery("select * from fish",null);
        ListView listView = getView().findViewById(R.id.fishListView);
        Adabter adabter = new Adabter(getContext(),c);
        listView.setAdapter(adabter);

/*

        ContentValues cv1 = new ContentValues();
        cv1.put("_id",17);
        cv1.put("name","Bream Fish");
        cv1.put("salary",20);
        cv1.put("photo" , R.drawable.bream_fish);


        ContentValues cv2 = new ContentValues();
        cv2.put("_id",18);
        cv2.put("name","Mullet Fish");
        cv2.put("salary",20);
        cv2.put("photo" , R.drawable.mullet_fish);


        ContentValues cv3 = new ContentValues();
        cv3.put("_id",19);
        cv3.put("name","Salmon Fish");
        cv3.put("salary",20);
        cv3.put("photo" , R.drawable.salmon_fish);


        ContentValues cv4 = new ContentValues();
        cv4.put("_id",20);
        cv4.put("name","Sardine Fish");
        cv4.put("salary",20);
        cv4.put("photo" , R.drawable.sardine_fish);


        ContentValues cv5 = new ContentValues();
        cv5.put("_id",21);
        cv5.put("name","Shrimp Fish");
        cv5.put("salary",20);
        cv5.put("photo" , R.drawable.shrimp_fish);


        ContentValues cv6 = new ContentValues();
        cv6.put("_id",22);
        cv6.put("name","Bream Fish");
        cv6.put("salary",20);
        cv6.put("photo" , R.drawable.bream_fish);


       long i =  db.insert("fish",null,cv1);
        db.insert("fish",null,cv2);
        db.insert("fish",null,cv3);
        db.insert("fish",null,cv4);
        db.insert("fish",null,cv5);
        db.insert("fish",null,cv6);

        if (i!=-1){
            Toast.makeText(getContext(), "add" , Toast.LENGTH_SHORT).show();
        }
*/
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Fish");
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fishnavdrawer, container , false);
    }

}
