package com.arrays;

public class PrintEvenOdd {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5, 6, 7};

        /*System.out.println("Even and Odd numbers:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println("Even: " + numbers[i]);
            } else {
                System.out.println("Odd: " + numbers[i]);
            }
        }*/
                System.out.println("Even numbers:");
                for (int i = 0; i < numbers.length; i++) {
                    if (numbers[i] % 2 == 0) {
                        System.out.print(numbers[i] + " ");
                    }
                }

                System.out.println("\nOdd numbers:");
                for (int i = 0; i < numbers.length; i++) {
                    if (numbers[i] % 2 != 0) {
                        System.out.print(numbers[i] + " ");
                    }
                }
            }
        }

