package com.oop.demo.constructor;

class A {
    private int age;
    private String Name;

    A() {
        System.out.println("Inside class A C1");
        methodA();
    }

    A(int a) {
        System.out.println("Inside class A " + a);
    }

    void methodA(){
        System.out.println("Inside Method  A");
    }

}

class B extends A {

    B(int c) {
        //super(8);
        System.out.println("Inside class B " + c);
        methodA();
    }
    B(){
        System.out.println("Inside class B 1 ");
    }


}

class C {
    C() {
        System.out.println("Inside class C C1");
    }

    public static void main(String[] args) {
        B b = new B(3);
        C c = new C();
    }
}
