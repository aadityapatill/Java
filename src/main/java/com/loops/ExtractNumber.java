package com.loops;

public class ExtractNumber {


        public static void main(String[] args){
            //Extract the digits from the integer(while loop)
            int d=0;
            int n=2151;
            while(n!=0)
            {
                d=n%10;
                System.out.println(d);
                n=n/10;
            }
        }
}
