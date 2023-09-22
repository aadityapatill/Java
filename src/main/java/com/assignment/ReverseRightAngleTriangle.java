package com.assignment;

    public class ReverseRightAngleTriangle {
        public static void main(String[] args) {
            int n = 5; // Number of rows

            for (int i = n; i >= 1; i--) {
                // Print '*' for the current row
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }

                // Move to the next line
                System.out.println();
            }
        }
    }
