package com.example.rufaapp;

import android.content.Context;
import android.media.MediaScannerConnection;
import android.os.Environment;
import android.util.Log;
import android.widget.Toast;

import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Class to access SD card and
 * write CSV file to it, as well as potentially save
 * extra field sheet data or image of sheet
 */

public class ExternalStorageAccessor {
    String dir;

    //TODO acquire write permissions in manifest.xml
    public boolean isStorageWriteable() {
        String state = Environment.getExternalStorageState();
        return Environment.MEDIA_MOUNTED.equals(state);
    }

    public boolean isStorageReadable() {
        String state = Environment.getExternalStorageState();
        boolean rw = Environment.MEDIA_MOUNTED.equals(state);
        boolean r = Environment.MEDIA_MOUNTED_READ_ONLY.equals(state);
        return r || rw;
    }

    public void writeToCsv(Context context, ArrayList<String> keyList, ArrayList<Holder<Object>> values) throws IOException {
        Log.i("csv","writable: " + isStorageWriteable());
        File[] fs = context.getExternalFilesDirs(null);
        if(fs != null && fs.length > 1){
            for(int i = 1; i < fs.length; i ++) {
                if(fs[i] != null && fs[i].canWrite()) {
                    dir = fs[i].getAbsolutePath();
                    Log.i("csv", dir);
                    break;
                }
            }
        }else{
            dir = "/";
            Log.i("csv","path fail");
        }
        Log.i("csv","opening file");
        File p = new File(dir);
        Log.i("csv",p.getAbsolutePath());
        if(!p.mkdirs()) {
            Log.i("csv","dir failure");
        }else{
            Log.i("csv","dirs made");
        }
        File f = new File(p,"data.csv");
        boolean newFile = f.createNewFile();
        Log.i("csv",f.getAbsolutePath());
        String[] row1 = new String[keyList.size()];
        row1 = keyList.toArray(row1);
        String[] row2 = new String[keyList.size()];
        ArrayList<String> stringVals = new ArrayList<>(keyList.size());
        for (Holder h : values) {
            stringVals.add(h.getObj() != null ? h.getAsString() : "");
        }
        row2 = stringVals.toArray(row2);
        Log.i("csv","ready to write");
        CSVWriter writer = new CSVWriter(new FileWriter(f,true));
        Log.i("csv","can write " + f.canWrite());
        Log.i("csv","f:"+f.getAbsolutePath());
        Log.i("csv","new" + f.createNewFile());
        if(newFile) {
            Log.i("csv","create file");
            writer.writeNext(row1);
        }
        writer.writeNext(row2);
        writer.close();
        Log.i("csv","writer close");
        MediaScannerConnection.scanFile(context,new String[]{f.getAbsolutePath()},new String[]{"text/csv"},null);
        Log.i("csv","index updated");
    }
}
