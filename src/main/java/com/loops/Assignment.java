package com.loops;

public class Assignment {
        public static void main(String[] args) {
            int num = 347254; // Replace with your integer

            int min = 9; // Initialize min to a high value
            int max = 0; // Initialize max to a low value

            while (num != 0) {
                int digit = num % 10;
                if (digit < min) {
                    min = digit;
                }
                if (digit > max) {
                    max = digit;
                }
                num = num / 10;
            }

            System.out.println("The minimum digit is: " + min);
            System.out.println("The maximum digit is: " + max);
        }
    }

