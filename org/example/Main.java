package org.example;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args)
    {
    Car car = new Car(
            "Audi", "80", 1994, 5
    );

    Vehicle vehicle = new Vehicle(
            "Cube", "Hybrid", 2020
    );

    Motorcycle motorcycle = new Motorcycle(
            "Piaggio", "Vespa", 1995, "80ccm", "Scooter"
    );

        System.out.println(vehicle);
        System.out.println(car);
        String text = motorcycle + ", Type = " + motorcycle.getType(motorcycle) + ", Engine = " + motorcycle.getEngine(motorcycle);
        System.out.println(text);
    }
}