package com.assignment;

public class PrintEvenAndOddNumber {
        public static void main(String[] args) {
            int num = 123456; // Replace with your integer

            System.out.println("Even Digits:");
            while (num > 0) {
                int digit = num % 10;
                if (digit % 2 == 0) {
                    System.out.println(digit);
                }
                num /= 10;
            }

            num = 123456; // Reset num to its original value

            System.out.println("Odd Digits:");
            while (num > 0) {
                int digit = num % 10;
                if (digit % 2 != 0) {
                    System.out.println(digit);
                }
                num /= 10;
            }
        }
    }

