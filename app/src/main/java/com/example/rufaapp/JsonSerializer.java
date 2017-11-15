package com.example.rufaapp;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * Created by David Merriman on 11/14/2017.
 */

public class JsonSerializer {

    public static RUFASheetData deserialize(JsonObject json){
        Gson gson = new Gson();
        return gson.fromJson(json,RUFASheetData.class);
    }

    public static JsonObject serialize(RUFASheetData data){
        Gson gson = new Gson();
        JsonParser parser = new JsonParser();
        return parser.parse(gson.toJson(data)).getAsJsonObject();
    }
}
