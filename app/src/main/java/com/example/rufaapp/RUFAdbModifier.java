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

    public boolean insertRow(Context context, ArrayList<String> keys, ArrayList<Holder<?>> values){
        RUFAdbOpenHelper openHelper = new RUFAdbOpenHelper(context);
        SQLiteDatabase db = openHelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues(NUMBER_OF_COLUMNS);
        for(int i = 0; i < keys.size(); i ++){
            Holder<?> value = values.get(i);
            int type = value.getTypeCode();
            if(type == 0){
                contentValues.put(keys.get(i),value.getAsString());
            }else{

                contentValues.put(keys.get(i),value.getAsInteger());
            }
        }
        return db.insert(TABLE,null,contentValues) != -1L;
    }
}
