package com.loops;

public class HigestNumber {

        public static void main(String[] args) {
            int d=0;
            int n =347254;
            int max=1;
            while(n!=0)
            {
                d=n%10;
                if(max<d)
                    max = d;
                n=n/10;
            }
            System.out.println("max digit is : "+max);
        }
}
