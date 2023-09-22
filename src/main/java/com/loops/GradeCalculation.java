package com.loops;

import java.util.Scanner;

public class GradeCalculation {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter s1, s2, s3, s4, s5 & s6 marks: ");
        int sub1 = obj.nextInt();
        int sub2 = obj.nextInt();
        int sub3 = obj.nextInt();
        int sub4 = obj.nextInt();
        int sub5 = obj.nextInt();
        int sub6 = obj.nextInt();

        if(sub1>=40 && sub2>=40 && sub3>=40 && sub4>=40 && sub5>=40 && sub6>=40)
        {
            int total = sub1 + sub2 + sub3 + sub4 + sub5 + sub6;
            float per = (float) (total / 600.0 * 100);

            if(per>=75)
                System.out.println("Grade: A");
            else if(per>=60)
                System.out.println("Grade: B");
            else if(per>=50)
                System.out.println("Grade: C");
            else if(per>=40)
                System.out.println("Grade: D");
            else
                System.out.println("Grade: Fail");
        }
        else
            System.out.println("student failed in at least one sub...");
    }
}
