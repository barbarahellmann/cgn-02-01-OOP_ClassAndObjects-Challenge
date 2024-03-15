package org.example;

import org.w3c.dom.ls.LSOutput;

public class Vehicle {

    private String manufacturer;
    private String model;
    private int yearOfManufacture;

    public Vehicle(String manufacturer, String model, int yearOfManufacture) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
    }

    @Override
    public String toString() {
        return "Vehicle: " +
                "Manufacturer = " + manufacturer +
                ", Model = " + model +
                ", YearOfManufacture = " + yearOfManufacture +
                ".";
    }





}

