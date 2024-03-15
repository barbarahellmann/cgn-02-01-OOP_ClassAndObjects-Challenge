package org.example;

public class Car extends Vehicle {

    private final int numberOfdoors;

    public Car(String manufacturer, String model, int yearOfManufacture, int numberOfdoors) {
        super(manufacturer, model, yearOfManufacture);
        this.numberOfdoors = numberOfdoors;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", numberOfdoors = " + numberOfdoors;
    }
}

