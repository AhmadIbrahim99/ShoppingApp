package com.example.yehya.shoppingapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyHelper extends SQLiteOpenHelper {
    public MyHelper(Context context, String name, int version){
        super(context, name,null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table fish(_id integer primary key not null , name text not null , salary real not null , photo real not null)");
        db.execSQL("create table fruit(_id integer primary key not null , name text not null , salary real not null , photo real not null)");
        db.execSQL("create table vegetable(_id integer primary key not null , name text not null , salary real not null , photo real not null)");
        db.execSQL("create table meat(_id integer primary key not null , name text not null , salary real not null , photo real not null)");
        db.execSQL("create table summer(_id integer primary key not null , name text not null , salary real not null , photo real not null)");
        db.execSQL("create table winter(_id integer primary key not null , name text not null , salary real not null , photo real not null)");
        db.execSQL("create table Computer(_id integer primary key not null , name text not null , salary real not null , photo real not null)");
        db.execSQL("create table smartphone(_id integer primary key not null , name text not null , salary real not null , photo real not null)");
        db.execSQL("create table kitchen(_id integer primary key not null , name text not null , salary real not null , photo real not null)");
        db.execSQL("create table business(_id integer primary key not null , name text not null , salary real not null , photo real not null)");
        db.execSQL("create table choseing(_id integer primary key not null , name text not null , salary real not null , photo real not null)");
        db.execSQL("create table account(_id integer primary key autoincrement not null , name text not null , phonenumber real not null)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
