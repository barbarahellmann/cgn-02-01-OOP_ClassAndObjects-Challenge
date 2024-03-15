package org.example;

public class Main {
    public static void main(String[] args)
    {
    Car car = new Car(
            "Audi", "80", 1994, 5
    );

    Vehicle vehicle = new Vehicle(
            "Cube", "Hybrid", 2020
    );

        System.out.println(vehicle);
        System.out.println(car);
    }
}