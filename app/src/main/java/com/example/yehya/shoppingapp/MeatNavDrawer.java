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

public class MeatNavDrawer extends Fragment {

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        MyHelper myHelper = new MyHelper(getContext(),"meat",1);
        SQLiteDatabase db =  myHelper.getWritableDatabase();



        Cursor c =  db.rawQuery("select * from meat",null);
        ListView listView = getView().findViewById(R.id.meatListView);
        Adabter adabter = new Adabter(getContext(),c);
        listView.setAdapter(adabter);
 /*

        ContentValues cv1 = new ContentValues();
        cv1.put("_id",37);
        cv1.put("name","Chicken Breast");
        cv1.put("salary",40);
        cv1.put("photo" , R.drawable.chicken_breast);


        ContentValues cv2 = new ContentValues();
        cv2.put("_id",38);
        cv2.put("name","Chicken Fled");
        cv2.put("salary",40);
        cv2.put("photo" , R.drawable.chicken_fled);


        ContentValues cv3 = new ContentValues();
        cv3.put("_id",39);
        cv3.put("name","Chicken Full");
        cv3.put("salary",40);
        cv3.put("photo" , R.drawable.chicken_full);


        ContentValues cv4 = new ContentValues();
        cv4.put("_id",40);
        cv4.put("name","Hepatic Calf");
        cv4.put("salary",40);
        cv4.put("photo" , R.drawable.hepatic_calf);


        long i =db.insert("meat",null,cv1);
        db.insert("meat",null,cv2);
        db.insert("meat",null,cv3);
        db.insert("meat",null,cv4);
        if(i != -1){
            Toast.makeText(getContext() , "add" , Toast.LENGTH_SHORT).show();
        }
*/
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getActivity().setTitle("Meat");
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.meatnavdrawer, container , false);
    }

}
