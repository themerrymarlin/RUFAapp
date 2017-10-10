package com.example.rufaapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

/**
 * Gets an instance of the RUFAdb and provides methods to read/write from it
 */

public class RUFAdbModifier {

    private static final int NUMBER_OF_COLUMNS = 97;
    private static final String TABLE = "RUFA-DB";

    public boolean insertRow(Context context, ArrayList<String> keys, ArrayList<String> values){
        RUFAdbOpenHelper openHelper = new RUFAdbOpenHelper(context);
        SQLiteDatabase db = openHelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues(NUMBER_OF_COLUMNS);
        for(int i = 0; i < keys.size(); i ++){
            contentValues.put(keys.get(i),values.get(i));
        }
        return db.insert(TABLE,null,contentValues) != -1L;
    }
}
