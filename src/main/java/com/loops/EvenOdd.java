package com.loops;

public class EvenOdd {
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
    }

}
