package com.example.yehya.shoppingapp;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CreateanAccoount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createan_accoount);

        final EditText phoneNumber = findViewById(R.id.creatPhoneN);
        final EditText username = findViewById(R.id.creatUsername);
        Button button = findViewById(R.id.creatBtn);

        MyHelper myHelper = new MyHelper(getApplicationContext(),"account",1);
        final SQLiteDatabase db =  myHelper.getWritableDatabase();




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ContentValues cv1 = new ContentValues();
                cv1.put("name", username.getText().toString());
                cv1.put("phonenumber" ,phoneNumber.getText().toString());

                final long i =db.insert("account" , null , cv1);

                if (i != -1){
                    Intent intent = new Intent(getApplicationContext() , ShoppingApp.class);
                    startActivity(intent);
                }

            }
        });
    }
}
