package com.example.rufaapp;

import android.content.Context;
import android.media.MediaScannerConnection;
import android.os.Environment;
import android.util.Log;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Handles access to devices internal storage
 */

public class InternalStorageAccessor {

    public static void writeToFile(Context context,String fileName,String jsonString) throws IOException{
        String dir;
        Log.i("int", Environment.getExternalStorageDirectory().getAbsolutePath());
        File[] fs = context.getExternalFilesDirs(null);
        if(fs != null){
            dir = fs[0].getAbsolutePath();
            Log.i("int",dir);
        }else{
            dir = "/";
            Log.i("int","path fail");
        }

        File f = new File(dir,fileName + ".txt");
        Log.i("int",f.getAbsolutePath());
        if(!f.createNewFile()){
            Log.i("int","file exists");
        }

        FileWriter out = new FileWriter(f);
        if(f.canWrite()){
            Log.i("int","writing");
            out.write(jsonString);
        }else{
            Log.i("int","can't write");
        }
        out.close();

        /*FileOutputStream out = context.openFileOutput(fileName, Context.MODE_WORLD_READABLE);
        out.write(jsonString.getBytes());
        out.close();*/
        MediaScannerConnection.scanFile(context,new String[]{f.getAbsolutePath()},new String[]{"text/plain"},null);
        Log.i("int","closed and indexed");
    }

    public static JsonObject readFromFile(Context context, String fileName) throws IOException{
        String dir;
        Log.i("int", Environment.getExternalStorageDirectory().getAbsolutePath());
        File[] fs = context.getExternalFilesDirs(null);
        if(fs != null){
            dir = fs[0].getAbsolutePath();
            Log.i("load",dir);
        }else{
            dir = "/";
            Log.i("load","path fail");
        }

        File f = new File(dir,fileName + ".txt");
        Log.i("load",f.getAbsolutePath());
        if(!f.createNewFile()){
            Log.i("load","file exists");
        }else{
            Log.i("load","file doesn't exist");
        }

        InputStreamReader in = new InputStreamReader(new FileInputStream(f));
        BufferedReader bufRead = new BufferedReader(in);
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
