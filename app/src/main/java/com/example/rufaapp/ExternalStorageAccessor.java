package com.example.rufaapp;

import android.content.Context;
import android.os.Environment;
import android.util.Log;

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
        Log.i("csv","writing to csv");
        Log.i("csv","writeable: " + isStorageWriteable());
        File[] fs = context.getExternalFilesDirs(null);
        if(fs != null && fs.length > 1){
            dir = fs[1].getAbsolutePath();
            Log.i("csv",dir);
        }else{
            dir = "/";
            Log.i("csv","path fail");
        }
        String fileName = values.get(0).getAsString() + "_" + values.get(1).getAsString() + ".csv";
        String path = dir + File.separator + fileName;
        Log.i("csv","opening file");
        Log.i("csv",path);
        File f = new File(path);
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
        //if(f.createNewFile()) {
          //  Log.i("csv","create file");
            writer.writeNext(row1);
        //}
        writer.writeNext(row2);
        writer.close();
        Log.i("csv",row1[0]);
        Log.i("csv",row2[0]);
        Log.i("csv","writer close");
    }
}
