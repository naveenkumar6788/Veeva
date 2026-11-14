package com.veeva.chandan.abstractclass.interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("I am a power engine i used to take fuel to start");
    }

    @Override
    public void stop() {
        System.out.println("I am power engine you can stop me");
    }

    @Override
    public void acc() {
        System.out.println("I am power engine you can accelerate me as much you can");
    }
}
