package com.veeva.chandan.abstractclass.task01;

public class Circle extends Shape {

    Circle() {
        super("Circle", 0);
    }
    @Override
    public String getShapeDescription() {
        return "A circle is having 0 straight lines";
    }
}
