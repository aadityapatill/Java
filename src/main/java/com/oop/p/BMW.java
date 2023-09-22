package com.oop.p;

public class BMW extends Vehicle{
    // Subclass BMW
        boolean turboCharged;
        boolean sunRoof;

        public BMW(String modelNo, int year, boolean turboCharged,boolean sunRoof) {
            super(modelNo, year);
            this.turboCharged = turboCharged;
            this.sunRoof=sunRoof;
        }

    public BMW(String modelNo, int year, boolean turboCharged) {
        super(modelNo, year);
        this.turboCharged = turboCharged;
    }
        // Method overriding to customize start message
        @Override
        public void start() {
            System.out.println("Starting the BMW.");
        }

        // Feature specific to BMW
        public void activateTurboCharge() {
            System.out.println("Turbo charge activated for BMW.");
        }
    }
