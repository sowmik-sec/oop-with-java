package com.sowmik.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }
    public void add(int num) {
        if(this.isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];
        // copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return this.size == this.data.length;
    }
    public int remove() {
        int removed = data[--size];
        return removed;
    }
    public int get(int index) {
        return data[index];
    }
    public int size() {
        return size;
    }
    public void set(int index, int value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        list.add(34);
//        list.remove(0);
//        list.get(0);
//        list.set(0,3432);
//        list.add(34);
//        list.set(0,3432);
//        System.out.println(list.get(0));
        CustomArrayList list = new CustomArrayList();
        list.add(3);
        list.set(0, 98);
        System.out.println(list.get(0));
    }
}
