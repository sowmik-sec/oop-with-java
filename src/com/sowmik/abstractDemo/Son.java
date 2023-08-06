package com.sowmik.abstractDemo;

public class Son extends Parent{
    public Son(int age) {
        super(age);
    }

    @Override
    void carrer() {
        System.out.println("I'm going to be a coader");
    }

    @Override
    void partner() {
        System.out.println("I love Thor");
    }
}
