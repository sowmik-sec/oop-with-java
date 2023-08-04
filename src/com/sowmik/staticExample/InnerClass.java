package com.sowmik.staticExample;

public class InnerClass {
    static class Test {
        String name;
        public Test(String name) {
            this.name = name;
        }
        @Override
        public String toString() {
            return name;
        }
    }



    public static void main(String[] args) {
        Test a = new Test("Ahsan");
        Test b = new Test("Habib");
        System.out.println(a.name);
        System.out.println(b.name);
        System.out.println(a);
    }
}
