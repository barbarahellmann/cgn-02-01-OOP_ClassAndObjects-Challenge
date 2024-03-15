package org.example;

public class Vehicle {

    private final String manufacturer;
    private final String model;
    private final int yearOfManufacture;

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
                ", YearOfManufacture = " + yearOfManufacture;
    }
}

