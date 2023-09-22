package com.oop.p;
public class Main {
    public static void main(String[] args) {
        // Creating instances of BMW and Mercedes
        BMW bmw = new BMW("320d", 2022, false);
        BMW bmw2 = new BMW("420d",2023,true,true);


        // Accessing methods and properties of BMW class
        bmw.start();
        bmw.activateTurboCharge();
        bmw.stop();
        bmw.displayTires();
        //System.out.println("BMW Year: " + bmw.year);

    }
}
