package com.assignment;

import java.util.Scanner;

public class PrintMaxAndMinDigit {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();

            int minDigit = 9; // Initialize minDigit to the highest possible digit
            int maxDigit = 0; // Initialize maxDigit to the lowest possible digit

            // Process each digit of the number
            while (number > 0) {
                int digit = number % 10; // Get the last digit
                if (digit < minDigit) {
                    minDigit = digit;
                }
                if (digit > maxDigit) {
                    maxDigit = digit;
                }
                number /= 10; // Remove the last digit
            }

            System.out.println("Minimum Digit: " + minDigit);
            System.out.println("Maximum Digit: " + maxDigit);

            scanner.close();
        }
    }
