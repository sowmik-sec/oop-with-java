package com.sowmik.introduction;

public class WrapperClass {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 20;
        swap(a,b);
//        System.out.println(a+" "+b);
        final int c = 32;
        A a1 = new A("Khalid");
        a1.name = "Habib";
//        System.out.println(a1.name);
        for (int i=0;i<10000000;i++) {
            a1 = new A("another obj");
        }
    }
    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }
}

class A {
    final int num = 10;
    String name;
    A(String name) {
        this.name = name;
    }
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}