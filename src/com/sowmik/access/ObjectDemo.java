package com.sowmik.access;

public class ObjectDemo {
    int num;
    float gpa;

    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    @Override
    public int hashCode() {
        return num;
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo(45, 3.47f);
        ObjectDemo obj2 = new ObjectDemo(45, 3.38f);
        if(obj1 == obj2) {
            System.out.println("Obj1 is equal to obj2");
        }
        if(obj1.equals(obj2)) {
            System.out.println("Obj1 is equal to obj2");
        }
//        System.out.println(obj.hashCode());
//        System.out.println(obj2.hashCode());
    }
}
