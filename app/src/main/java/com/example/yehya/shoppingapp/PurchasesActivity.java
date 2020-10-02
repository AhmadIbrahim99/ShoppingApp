package com.example.yehya.shoppingapp;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public  class   PurchasesActivity extends AppCompatActivity {



    @Override
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchases);


        MyHelper myHelper = new MyHelper(getApplicationContext(),"chose",1);
        SQLiteDatabase db =  myHelper.getReadableDatabase();

        Cursor c =  db.rawQuery("select * from choseing",null);
        ListView listView = findViewById(R.id.purchases);
        AdabterChases adabter = new AdabterChases(getApplicationContext(),c);
        listView.setAdapter(adabter);

        Button next = findViewById(R.id.nextBut);
        Button back = findViewById(R.id.backBut);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext() , PayActivity.class);
                startActivity(intent);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext() , ShoppingApp.class);
                startActivity(intent);
            }
        });
    }
}
