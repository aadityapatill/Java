package com.loops;

public class Palindrome {
    public static void main(String[] args) {
        int d=0;
        int n =12321;
        int temp = n;
        int rev = 0;
        while(n!=0)
        {
            d=n%10;
            // This line extracts the last digit of n
            // by taking the remainder when n is divided by 10. This digit is stored in d.
            rev = rev*10 + d;
            n=n/10;
        }
        if(temp==rev){
            System.out.println("No is palindrome");
        }else{
            System.out.println("No is not palindrome");
        }
    }
}
