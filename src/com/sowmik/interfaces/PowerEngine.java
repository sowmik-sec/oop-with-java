package com.sowmik.interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Poser engine start");
    }

    @Override
    public void stop() {
        System.out.println("Power engine stops");
    }

    @Override
    public void acc() {
        System.out.println("Power engine accelerates");
    }
}
