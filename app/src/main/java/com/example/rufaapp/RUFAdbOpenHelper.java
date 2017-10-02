package com.example.rufaapp;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by David Merriman on 10/02/2017.
 * Helper class to initialize DB inside android internal memory
 */

public class RUFAdbOpenHelper extends SQLiteOpenHelper {

    private static final String TABLE_NAME = "RUFA_DB";
    private static final int VERSION = 1;
    private static final String CREATE_STRING = "CREATE TABLE "+TABLE_NAME+" ("; //TODO figure out table structure

    RUFAdbOpenHelper (Context context){
        super(context,TABLE_NAME,null,VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        //TODO execute sql command we will make with constructor
    }

    @Override
    public void onUpgrade(SQLiteDatabase db,int oldVersion, int newVersion){
        //TODO idfk
        //Not Implemented
    }
}
