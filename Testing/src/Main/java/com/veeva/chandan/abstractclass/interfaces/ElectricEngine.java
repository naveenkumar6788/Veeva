package com.veeva.chandan.abstractclass.interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("I am a Electric engine, i need electricity to run");
    }

    @Override
    public void stop() {
        System.out.println("you can stop me to save your battery");
    }

    @Override
    public void acc() {
        System.out.println("I am a electric engine you can not accelerate more than my power");
    }
}
