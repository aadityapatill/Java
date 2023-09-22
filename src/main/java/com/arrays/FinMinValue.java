package com.arrays;

import java.util.Arrays;

public class FinMinValue {

        public static void main(String[] args) {
            int[] arr = {10, 5, 20, 15, 30};

            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

            int minValue = arr[arr[1]];

            System.out.println("Sorted Array: " + Arrays.toString(arr));
            System.out.println("Minimum value in the array: " + minValue);
        }
    }