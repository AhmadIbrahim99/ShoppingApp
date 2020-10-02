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

public class FruitNavDrawer extends Fragment {

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        MyHelper myHelper = new MyHelper(getContext(),"fruit",1);
        SQLiteDatabase db =  myHelper.getWritableDatabase();


        Cursor c =  db.rawQuery("select * from fruit",null);
        ListView listView = getView().findViewById(R.id.fruitListView);
        Adabter adabter = new Adabter(getContext(),c);
        listView.setAdapter(adabter);
/*
        ContentValues cv1 = new ContentValues();
        cv1.put("_id",23);
        cv1.put("name","Apple");
        cv1.put("salary",10);
        cv1.put("photo" , R.drawable.apple);


        ContentValues cv2 = new ContentValues();
        cv2.put("_id",24);
        cv2.put("name","Banana");
        cv2.put("salary",10);
        cv2.put("photo" , R.drawable.banana);


        ContentValues cv3 = new ContentValues();
        cv3.put("_id",25);
        cv3.put("name","Cherries");
        cv3.put("salary",10);
        cv3.put("photo" , R.drawable.cherries);


        ContentValues cv4 = new ContentValues();
        cv4.put("_id",26);
        cv4.put("name","Grape");
        cv4.put("salary",10);
        cv4.put("photo" , R.drawable.grape);


        ContentValues cv5 = new ContentValues();
        cv5.put("_id",27);
        cv5.put("name","Mango");
        cv5.put("salary",10);
        cv5.put("photo" , R.drawable.mango);


        ContentValues cv6 = new ContentValues();
        cv6.put("_id",28);
        cv6.put("name","Orange");
        cv6.put("salary",10);
        cv6.put("photo" , R.drawable.orange);

        ContentValues cv7 = new ContentValues();
        cv7.put("_id",29);
        cv7.put("name","Pineapple");
        cv7.put("salary",10);
        cv7.put("photo" , R.drawable.pineapple);

        ContentValues cv8 = new ContentValues();
        cv8.put("_id",30);
        cv8.put("name","Strawberries");
        cv8.put("salary",10);
        cv8.put("photo" , R.drawable.strawberries);


       long i = db.insert("fruit",null,cv1);
        db.insert("fruit",null,cv2);
        db.insert("fruit",null,cv3);
        db.insert("fruit",null,cv4);
        db.insert("fruit",null,cv5);
        db.insert("fruit",null,cv6);
        db.insert("fruit",null,cv7);
        db.insert("fruit",null,cv8);

        if(i != -1){
            Toast.makeText(getContext() , "add" , Toast.LENGTH_SHORT).show();
        }
*/
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getActivity().setTitle("Fruit");
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fruitnavdrawer, container , false);
    }

}
