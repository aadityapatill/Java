package com.arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] numbers = {10, 425, 30, 65, 25,2};
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("Largest element in the array: " + largest);
    }
}
