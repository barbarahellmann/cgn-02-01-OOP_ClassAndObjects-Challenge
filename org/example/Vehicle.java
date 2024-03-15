package org.example;

import org.w3c.dom.ls.LSOutput;

public class Vehicle {

    private String Manufacturer;
    private String Model;
    private int yearOfManufacture;

    public Vehicle(String Manufacturer, String Model, int yearOfManufacture) {
        this.Manufacturer = Manufacturer;
        this.Model = Model;
        this.yearOfManufacture = yearOfManufacture;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "Manufacturer='" + Manufacturer + '\'' +
                ", Model='" + Model + '\'' +
                ", YearOfManufacture=" + YearOfManufacture +
                '}';
    }





}

