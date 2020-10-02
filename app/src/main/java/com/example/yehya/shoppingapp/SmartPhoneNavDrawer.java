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

public class SmartPhoneNavDrawer extends Fragment {
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        MyHelper myHelper = new MyHelper(getContext(),"smartphone",1);
        SQLiteDatabase db =  myHelper.getWritableDatabase();



        Cursor c =  db.rawQuery("select * from smartphone",null);
        ListView listView = getView().findViewById(R.id.smartPhoneListView);
        Adabter adabter = new Adabter(getContext(),c);
        listView.setAdapter(adabter);
/*
        ContentValues cv1 = new ContentValues();
        cv1.put("_id",41);
        cv1.put("name","Galaxy j7");
        cv1.put("salary",150);
        cv1.put("photo" , R.drawable.galaxy_j7);


        ContentValues cv2 = new ContentValues();
        cv2.put("_id",42);
        cv2.put("name","Galaxy s9");
        cv2.put("salary",150);
        cv2.put("photo" , R.drawable.galaxy_s9);


        ContentValues cv3 = new ContentValues();
        cv3.put("_id",43);
        cv3.put("name","Huawei nova3i");
        cv3.put("salary",150);
        cv3.put("photo" , R.drawable.huawei_nova3i_color_gradient);


        ContentValues cv4 = new ContentValues();
        cv4.put("_id",44);
        cv4.put("name","Huawei p20");
        cv4.put("salary",150);
        cv4.put("photo" , R.drawable.huawei_p20);


        ContentValues cv5 = new ContentValues();
        cv5.put("_id",45);
        cv5.put("name","iphone x");
        cv5.put("salary",150);
        cv5.put("photo" , R.drawable.iphone_x);


        ContentValues cv6 = new ContentValues();
        cv6.put("_id",46);
        cv6.put("name","iphone xr");
        cv6.put("salary",150);
        cv6.put("photo" , R.drawable.iphone_xr);



       long i = db.insert("smartphone",null,cv1);
        db.insert("smartphone",null,cv2);
        db.insert("smartphone",null,cv3);
        db.insert("smartphone",null,cv4);
        db.insert("smartphone",null,cv5);
        db.insert("smartphone",null,cv6);

        if(i != -1){
            Toast.makeText(getContext() , "add" , Toast.LENGTH_SHORT).show();
        }
*/
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getActivity().setTitle("SmartPhone");
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.smartpohnenavdrawer, container , false);
    }

}
