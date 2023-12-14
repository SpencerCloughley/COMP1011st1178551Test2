package com.example.comp1011st1178551test2;

import com.google.gson.Gson;

import java.io.IOException;

public class JSONUtility {
    public static Dealership JSONtoDealership() throws IOException, InterruptedException {

        Gson gson = new Gson();
        return gson.fromJson("audi.json",Dealership.class);
    }
}
