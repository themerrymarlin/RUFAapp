package com.example.rufaapp;


import com.google.gson.JsonObject;

import java.util.ArrayList;

/**
 * handles turning RUFA data into json format
 */

public class JsonHandler {

    public static String toJsonString(ArrayList<String> keys,ArrayList<Holder> values){
        JsonObject ret = new JsonObject();
        for(int i = 0; i < keys.size(); i ++){
            ret.addProperty(keys.get(i),values.get(i).getAsString());
        }
        return ret.getAsString();
    }


}
