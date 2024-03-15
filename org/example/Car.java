package org.example;

public class Car extends Vehicle {

    private final int numberOfDoors;

    public Car(String manufacturer, String model, int yearOfManufacture, int numberOfDoors) {
        super(manufacturer, model, yearOfManufacture);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", numberOfDoors = " + numberOfDoors;
    }
}

