package com.sowmik.interfaces.extendDemo;

public interface B extends A{
    default void greet() {
        System.out.println("world");
    }
    default void fun() {
        System.out.println("inside B");
    }
}
