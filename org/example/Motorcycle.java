package org.example;

public class Motorcycle extends Vehicle {

    private final String engine;
    private final String type;

    public Motorcycle(String manufacturer, String model, int yearOfManufacture, String engine, String type) {
        super(manufacturer, model, yearOfManufacture);
        this.engine = engine;
        this.type = type;
    }

    public String getType(Motorcycle motorcycle) {
        return motorcycle.type;
    }
    public String getEngine(Motorcycle motorcycle) {
        return motorcycle.engine;
    }
}
