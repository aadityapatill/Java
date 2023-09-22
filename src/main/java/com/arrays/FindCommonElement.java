package com.arrays;

public class FindCommonElement {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};
        int[] array3 = {4, 6, 5, 8, 9};

        System.out.print("Common elements in three arrays: ");

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                for (int k = 0; k < array3.length; k++) {
                    if (array1[i] == array2[j] && array2[j] == array3[k]) {
                        System.out.print(array1[i] + " ");
                    }
                }
            }
        }
    }
}
