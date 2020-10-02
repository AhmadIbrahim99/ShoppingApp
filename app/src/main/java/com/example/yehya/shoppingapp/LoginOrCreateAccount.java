package com.example.yehya.shoppingapp;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.ArrayList;

public class LoginOrCreateAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_or_create_account);

        final Button login = findViewById(R.id.loginOr);
        Button createanAccoount = findViewById(R.id.createanAccoountOr);
        final EditText username = findViewById(R.id.usernameOr);
        final EditText phoneNumber = findViewById(R.id.phoneNumberOr);

        MyHelper myHelper = new MyHelper(getApplicationContext(), "account", 1);
        final SQLiteDatabase db =  myHelper.getReadableDatabase();
        final Cursor cursor =  db.rawQuery("select * from account", null);


        final ArrayList<compontLogin> compontLogins = new ArrayList<>();


        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
        int phonenumber = cursor.getInt(cursor.getColumnIndex("phonenumber"));
        String name = cursor.getString(cursor.getColumnIndex("name"));

            compontLogin cLogin = new compontLogin();
            cLogin.setName(name);
            cLogin.setPhoneNumber(phonenumber);
            compontLogins.add(cLogin);
            cursor.moveToNext();
        }
        db.close();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int y = 0; y < compontLogins.size(); y++) {
                    if (username.equals(compontLogins.get(y).getName())
                            && phoneNumber.equals(compontLogins.get(y).getPhoneNumber())) {
                        Intent intent = new Intent(getApplicationContext(), ShoppingApp.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(getApplicationContext() ,"username or phonenumber not True" ,Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        createanAccoount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CreateanAccoount.class);
                startActivity(intent);
            }
        });
    }
}
