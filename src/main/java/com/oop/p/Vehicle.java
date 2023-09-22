package com.oop.p;

public class Vehicle {
   private String brand;
    private int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void start() {
        System.out.println("Starting the vehicle.");
    }

    public void stop() {
        System.out.println("Stopping the vehicle.");
    }

    // Common feature: All vehicles have 4 tires
    public void displayTires() {
        System.out.println("This vehicle has 4 tires.");
    }
}

