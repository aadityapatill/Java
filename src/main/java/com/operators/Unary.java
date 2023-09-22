package com.operators;

public class Unary {

    int a=2;
    static int b=3;

    public static void main(String[] args) {

        Unary unary=new Unary();
        System.out.println(unary.a);
        System.out.println(b);
        unary.getValue();

    }
      void getValue(){
        a=20;
        Unary.b=30;
        Unary unary2=new Unary();
        System.out.println(b);
        System.out.println(b);
          System.out.println(a);
    }
}
