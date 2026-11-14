package com.veeva.chandan.abstractclass.task01;

public class Triangle extends Shape{
    Triangle() {
        super("Triangle", 3);
    }

    @Override
    public String getShapeDescription() {
        return "A Triangle is having 3 straight lines";
    }
}
