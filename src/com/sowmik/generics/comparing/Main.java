package com.sowmik.generics.comparing;

public class Main{
    public static void main(String[] args) {
        Student sowmik = new Student(506, 72.5f);
        Student habib = new Student(10, 76.5f);
        if(sowmik.compareTo(habib)>0) {
            System.out.println("Sowmik has more marks");
        }
        else {
            System.out.println("Habib has more marks");
        }
    }


}
