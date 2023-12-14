package com.example.comp1011st1178551test2;

import com.google.gson.annotations.SerializedName;

public class Audi {
    @SerializedName("Year")
    private int year;
    @SerializedName("MODEL")
    private String model;
    private String fuelType;
    @SerializedName("Price")
    private double price;
    @SerializedName("mpg")
    private double mpg;
    @SerializedName("EngineSize")
    private double engineSize;
    @SerializedName("transmission")
    private String transmission;


    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public String getFuelType() {
        return fuelType;
    }

    public double getPrice() {
        return price;
    }

    public double getMpg() {
        return mpg;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public String getTransmission() {
        return transmission;
    }


}
