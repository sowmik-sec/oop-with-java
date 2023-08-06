package com.sowmik.cloning;

import java.util.Arrays;

public class Main  {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human sowmik = new Human(27, "Ahsan Habib");
//        Human habib = new Human(sowmik);
        Human habib = (Human) sowmik.clone();
        System.out.println(habib.age+" "+habib.name+" "+ Arrays.toString(sowmik.arr));
    }
}
