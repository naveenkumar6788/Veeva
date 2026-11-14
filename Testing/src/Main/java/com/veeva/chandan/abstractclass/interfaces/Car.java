package com.veeva.chandan.abstractclass.interfaces;

public class Car implements Engine, Brake{
    @Override
    public void brake() {
        System.out.println("I am a break, i used to slow or stop the car");
    }

    @Override
    public void start() {
        System.out.println("I used to start like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("I used to stop like a normal car");
    }
    @Override
    public void acc() {
        System.out.println("I am accelerator i used to increase the speed");
    }
}
