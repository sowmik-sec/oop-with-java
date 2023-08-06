package com.sowmik.abstractDemo;

public class Daughter extends Parent{
    public Daughter(int age) {
        super(age);
    }

    @Override
    void carrer() {
        System.out.println("I'm going to be a home maker");
    }

    @Override
    void partner() {
        System.out.println("I love Iron man");
    }
}
