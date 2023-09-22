package com.loops;

public class BreakAndContine {
        public static void main(String[] args) {
            int i = 1;

            System.out.println("Using break:");

            // Using break to exit a loop
            while (i <= 5) {
                if (i == 3) {
                    break; // Exit the loop when i is 3
                }
                System.out.println("i: " + i);
                i++;
            }

            System.out.println("\nUsing continue:");

            i = 1;

            // Using continue to skip an iteration
            while (i <= 5) {
                if (i == 3) {
                    i++; // Increment i and skip the rest of the current iteration
                    continue;
                }
                System.out.println("i: " + i);
                i++;
            }

            System.out.println("\nUsing do-while loop:");

            i = 1;

            // Using do-while loop to execute at least once
            do {
                System.out.println("i: " + i);
                i++;
            } while (i <= 5);
        }

}
