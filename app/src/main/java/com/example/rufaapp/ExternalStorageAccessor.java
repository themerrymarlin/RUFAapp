package com.example.rufaapp;

import android.os.Environment;

import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Class to access SD card and
 * write CSV file to it, as well as potentially save
 * extra field sheet data or image of sheet
 */

public class ExternalStorageAccessor {
    String dir = android.os.Environment.getExternalStorageDirectory().getAbsolutePath();

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

    public void writeToCsv(ArrayList<String> keyList, ArrayList<Holder<Object>> values) throws IOException {
        CSVWriter writer = new CSVWriter(new FileWriter(dir));
        String fileName = values.get(0).getAsString() + values.get(1).getAsString() + ".csv";
        String path = dir + File.separator + fileName;
        File f = new File(path);
        String[] row1 = new String[keyList.size()];
        row1 = keyList.toArray(row1);
        String[] row2 = new String[keyList.size()];
        ArrayList<String> stringVals = new ArrayList<>(keyList.size());
        for (Holder h : values) {
            stringVals.add(h.getAsString());
        }
        row2 = stringVals.toArray(row2);
        writer.writeNext(row1);
        writer.writeNext(row2);
        writer.close();
    }
}
