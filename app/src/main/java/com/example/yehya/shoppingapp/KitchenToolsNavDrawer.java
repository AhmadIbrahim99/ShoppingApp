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

public class KitchenToolsNavDrawer extends Fragment {

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        MyHelper myHelper = new MyHelper(getContext(),"kitchen",1);
        SQLiteDatabase db =  myHelper.getWritableDatabase();



        Cursor c =  db.rawQuery("select * from kitchen",null);
        ListView listView = getView().findViewById(R.id.kitchenToolsListView);
        Adabter adabter = new Adabter(getContext(),c);
        listView.setAdapter(adabter);
      /*

        ContentValues cv1 = new ContentValues();
        cv1.put("_id",31);
        cv1.put("name","Cafe Machine");
        cv1.put("salary",50);
        cv1.put("photo" , R.drawable.cafe_machine);


        ContentValues cv2 = new ContentValues();
        cv2.put("_id",32);
        cv2.put("name","Juice Machine");
        cv2.put("salary",50);
        cv2.put("photo" , R.drawable.juice_machine);


        ContentValues cv3 = new ContentValues();
        cv3.put("_id",33);
        cv3.put("name","Meat Grinders");
        cv3.put("salary",50);
        cv3.put("photo" , R.drawable.meat_grinders);


        ContentValues cv4 = new ContentValues();
        cv4.put("_id",34);
        cv4.put("name","POP Corn Maker");
        cv4.put("salary",50);
        cv4.put("photo" , R.drawable.pop_corn_maker);


        ContentValues cv5 = new ContentValues();
        cv5.put("_id",35);
        cv5.put("name","Stand Mixer");
        cv5.put("salary",50);
        cv5.put("photo" , R.drawable.stand_mixer);


        ContentValues cv6 = new ContentValues();
        cv6.put("_id",36);
        cv6.put("name","Steam Irons");
        cv6.put("salary",50);
        cv6.put("photo" , R.drawable.steam_irons);


        long i =db.insert("kitchen",null,cv1);
        db.insert("kitchen",null,cv2);
        db.insert("kitchen",null,cv3);
        db.insert("kitchen",null,cv4);
        db.insert("kitchen",null,cv5);
        db.insert("kitchen",null,cv6);

        if(i != -1){
            Toast.makeText(getContext() , "add" , Toast.LENGTH_SHORT).show();
        }
*/
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getActivity().setTitle("KitchenTools");
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.kitchentoolsnavdrawer, container , false);
    }

}
