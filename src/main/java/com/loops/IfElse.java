package com.loops;

public class IfElse {

        public static void main(String[] args)
        {

            int age = 17;


            if(age>=1 && age<=100)
            {
                if(age>=18)
                    System.out.println("you are eligible for vote");
                else
                    System.out.println("you are not eligible for vote");
            }
            else
                System.out.println("pls enter valid age...");
        }
}
