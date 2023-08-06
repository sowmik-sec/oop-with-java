package com.sowmik.interfaces.extendDemo;

public interface A {
    static void greeting() {
        System.out.println("Hey I'm a static method");
    }
    default void fun(){
        System.out.println("heyyyy");
    }
}
