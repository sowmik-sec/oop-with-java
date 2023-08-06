package com.sowmik.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(27);
        son.carrer();
        System.out.println(son.age);
        Daughter daughter = new Daughter(16);
        daughter.carrer();
        System.out.println(daughter.age);
    }
}
