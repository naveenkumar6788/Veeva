package com.veeva.chandan.abstractclass.task01;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Triangle triangle = new Triangle();

        System.out.println(circle.getName() +":"+circle.getShapeDescription());
        System.out.println(triangle.getName() +":"+triangle.getShapeDescription());
    }
}
