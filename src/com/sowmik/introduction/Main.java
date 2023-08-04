package com.sowmik.introduction;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        Student sowmik = new Student("Ahsan Habib", 506, 72.5f);
        Student habib = new Student("Habib", 10, 78f);
        Student ahsan = new Student();
        sowmik.name = "Ahsan Habib";
        sowmik.rno = 506;
        sowmik.marks = 72.3f;
//        System.out.println(sowmik.rno);
//        System.out.println(sowmik.name);
//        System.out.println(sowmik.marks);
//        sowmik.greeting();
//        habib.greeting();
//        ahsan.greeting();
        Student one = new Student();
        Student two = one;
        one.name = "Khaled";
        System.out.println(two.name);
    }
}
class Student {
    int rno;
    String name;
    float marks;
    void greeting() {
        System.out.println("My name is "+this.name);
    }
    Student(String name, int rno, float marks) {
        this.name = name;
        this.rno = rno;
        this.marks = marks;
    }
    Student() {
//        this.name = "Sowmik";
//        this.rno = 506;
//        this.marks = 72.5f;
        this("Ahsan", 506, 65.3f);
    }
    Student(Student other) {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }
}
