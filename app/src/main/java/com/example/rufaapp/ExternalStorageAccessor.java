package com.example.rufaapp;

import android.os.Environment;

/**
 * Class to access SD card and
 * write CSV file to it, as well as potentially save
 * extra field sheet data or image of sheet
 */

public class ExternalStorageAccessor {
    //TODO acquire write permissions in manifest.xml
    public boolean isStorageWriteable(){
        String state = Environment.getExternalStorageState();
        return Environment.MEDIA_MOUNTED.equals(state);
    }

    public boolean isStorageReadable(){
        String state = Environment.getExternalStorageState();
        boolean rw = Environment.MEDIA_MOUNTED.equals(state);
        boolean r = Environment.MEDIA_MOUNTED_READ_ONLY.equals(state);
        return r || rw;
    }
}
