package com.veeva.chandan.abstractclass.task01;

public abstract class Shape {
    //what if the variable is declared as private once think about it
    String name;
    int numberOfSides;

    Shape(String name, int numberOfSides) {
        this.name = name;
        this.numberOfSides = numberOfSides;
    }
    public String getName() {
        return name;
    }
    public int getNumberOfSides() {
        return numberOfSides;
    }

    public abstract String getShapeDescription();

}
