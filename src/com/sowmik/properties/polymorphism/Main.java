package com.sowmik.properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Square();
        shape.area();
        Numbers numbers = new Numbers();
//        System.out.println(numbers.func(3,2));
    }
}
