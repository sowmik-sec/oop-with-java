package com.sowmik.generics;

import java.util.Arrays;
import java.util.List;

public class WildCardExample<T extends String> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public WildCardExample() {
        this.data = new Object[DEFAULT_SIZE];
    }
    public void getList(List<? extends String> list) {
        // do something

        // here you can only pass String type
    }
    public void add(T value) {
        if(this.isFull()) {
            resize();
        }
        data[size++] = value;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];
        // copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return this.size == this.data.length;
    }
    public T remove() {
        T removed = (T)(data[--size]);
        return removed;
    }
    public T get(int index) {
        return (T)(data[index]);
    }
    public int size() {
        return size;
    }
    public void set(int index, T value) {
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
//        CustomGenericArrayList list = new CustomGenericArrayList();
//        list.add(3);
//        list.set(0, 98);
//        System.out.println(list.get(0));
        WildCardExample<String> list3 = new WildCardExample<>();
        list3.add("Ahsan");
        list3.add("Habib");
        list3.add("Sowmik");
        list3.set(1,"Volga");
        System.out.println(list3);
    }
}
