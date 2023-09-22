package com.loops;

public class FibabocciSeries {
    //5.Fibabocci series(for loop)
    public static void main(String[] args) {
        int n = 16;
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.print("Fibonacci Series up to " + n + " terms: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + " ");

            // Calculate the next term in the sequence
            int nextTerm = firstTerm + secondTerm;

            // Update firstTerm and secondTerm for the next iteration
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
