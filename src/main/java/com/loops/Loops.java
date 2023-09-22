package com.loops;
public class Loops {
    public static void main(String[] args) {
        int number = 10;

        // If statement
        if(number > 5) {
            System.out.println("The number is greater than 5.");
        }

        // If-else statement
        if(number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        // If-else if-else statement
        if(number > 10) {
            System.out.println("The number is greater than 10.");
        } else if(number < 10) {
            System.out.println("The number is less than 10.");
        } else {
            System.out.println("The number is equal to 10.");
        }

        // Switch statement
        int dayOfWeek = 3;
        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Other day");
        }

        // While loop
        int count = 0;
        while (count < 5) {
            System.out.println("Count: " + count);
            count++;
        }

        // Do-while loop
        int doCount = 0;
        do {
            System.out.println("Do Count: " + doCount);
            doCount++;
        } while (doCount < 5);

        // For loop
        for (int i = 0; i < 5; i++) {
            System.out.println("For Loop Iteration: " + i);
        }

        // Break statement
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // Exit the loop when i is 5
            }
            System.out.println("Break Example: " + i);
        }

        // Continue statement
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue; // Skip iteration when i is 2
            }
            System.out.println("Continue Example: " + i);
        }
    }
}
