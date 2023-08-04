package com.sowmik.staticExample;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Human sowmik = new Human(27, "Ahsan Habib", 0f, false);
        Human habib = new Human(27, "Habib Ahsan", 0f, false);
        System.out.println(Human.population);
    }
}
