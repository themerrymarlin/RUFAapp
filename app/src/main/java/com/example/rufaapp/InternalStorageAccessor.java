package com.example.rufaapp;

import android.content.Context;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Handles access to devices internal storage
 */

public class InternalStorageAccessor {

    public static void writeToFile(Context context,String fileName,String jsonString) throws IOException{
        FileOutputStream out = context.openFileOutput(fileName, Context.MODE_PRIVATE);
        out.write(jsonString.getBytes());
        out.close();
    }

    public static JsonObject readFromFile(Context context, String fileName) throws IOException{

        FileInputStream in = context.openFileInput(fileName);
        InputStreamReader inReader = new InputStreamReader(in);
        BufferedReader bufRead = new BufferedReader(inReader);
        StringBuilder fileString = new StringBuilder();
        String line = bufRead.readLine();
        while(line != null){
            fileString.append(line);
            line = bufRead.readLine();
        }

        //convert string to json
        JsonParser parser = new JsonParser();
        return parser.parse(fileString.toString()).getAsJsonObject();
    }
}
