package com.example.comp1011st1178551test2;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Dealership {
    @SerializedName("Dealer")
    private String dealer;

    @SerializedName("Address")
    private String address;
    @SerializedName("Audis")
    private ArrayList<Audi> audis;

    public String getDealer() {
        return dealer;
    }

    public String getAddress() {
        return address;
    }

    public ArrayList<Audi> getAudis() {
        return audis;
    }
}
