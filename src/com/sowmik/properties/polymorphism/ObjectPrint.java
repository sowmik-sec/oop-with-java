package com.sowmik.properties.polymorphism;

public class ObjectPrint {
    int num;

    public ObjectPrint(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "The number is " + num;
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(32);
        System.out.println(obj);
    }
}
