package com.example.comp1011st1178551test2;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.io.IOException;

public class JSONUtility {
    public static Dealership JSONtoDealership(){

        Gson gson = new Gson();
        Dealership dealer = null;
        try(
                FileReader fileReader = new FileReader("C:\\Users\\SChee\\Desktop\\Java\\COMP1011st1178551Test2\\src\\main\\resources\\com\\example\\comp1011st1178551test2\\audi-view.fxml");
                JsonReader jsonReader = new JsonReader(fileReader);
        )
        {
            dealer = gson.fromJson(jsonReader, Dealership.class);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return dealer;
    }
}
