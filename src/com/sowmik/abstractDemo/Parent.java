package com.sowmik.abstractDemo;

public abstract class Parent {
    int age;
    final int value;
    public Parent(int age) {
        this.age = age;
        value = 3;
    }

    abstract void carrer();
    abstract void partner();
}
