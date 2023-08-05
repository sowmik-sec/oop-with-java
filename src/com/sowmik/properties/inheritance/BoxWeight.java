package com.sowmik.properties.inheritance;

public class BoxWeight extends Box{
    double weight;
    public BoxWeight() {
        this.weight = -1;
    }
    public BoxWeight(BoxWeight other) {
        super(other);
        this.weight = other.weight;
    }
    BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);
        this.weight = weight;
    }
}
