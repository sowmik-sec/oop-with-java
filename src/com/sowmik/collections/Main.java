package com.sowmik.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        list2.add(32);
        List<Integer> list3 = new Vector<>();
        list3.add(234);
        System.out.println(list3);
    }
}
