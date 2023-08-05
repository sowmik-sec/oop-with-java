package com.sowmik.properties.inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box(5.3, 3.2, 10.1);
//        Box box2 = new Box(box);
//        System.out.println(box.l+" "+box.h+" "+box.w);
//        BoxWeight box3 = new BoxWeight();
//        System.out.println(box3.h + " " + box3.weight);
        Box box5 = new BoxWeight(2,3,4,8);
        // there are many variables in both parent and child classes
        // you are given access to variables that are in the ref type i.e. BoxWeight
        // hence, you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialised
        // but here, when the obj itself is of type parent class, how will you call the constructor of child class
        // this is why error
//        System.out.println(box5);
        BoxPrice box6 = new BoxPrice();
        System.out.println();
    }
}
