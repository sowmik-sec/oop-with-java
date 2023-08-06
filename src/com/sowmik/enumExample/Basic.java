package com.sowmik.enumExample;

public class Basic {
    enum Week implements A{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
//        Week() {
//            System.out.println("Constructor called for "+this);
//        }

        @Override
        public void greet() {
            System.out.println("hey there");
        }
    }
    public static void main(String[] args) {
        Week week;
        week = Week.Friday;
//        for(Week day: Week.values()) {
//            System.out.println(day);
//        }
        week.greet();
    }
}
