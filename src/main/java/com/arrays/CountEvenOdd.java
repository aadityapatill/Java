package com.arrays;

public class CountEvenOdd {
        public static void main(String[] args) {
            int[] numbers = {2, 3, 4, 5, 6, 7};
            int evenCount = 0;
            int oddCount = 0;


            for(int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
            System.out.println("Number of even elements: " + evenCount);
            System.out.println("Number of odd elements: " + oddCount);
        }

}
