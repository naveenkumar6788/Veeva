// Q7. Menu-Driven Shape Area - Easy
 
//   Problem:
//   Write a Java program to calculate the area of different shapes using a menu-driven approach.
 
//   Choices:
//   1. Circle
//   2. Rectangle
//   3. Triangle
 
//   Formulas:
//   Circle = 3.14 * radius * radius
//   Rectangle = length * breadth
//   Triangle = 0.5 * base * height
 
//   If the user enters an invalid choice, print Invalid Choice.
 
//   Input:
//   The first line contains an integer representing the shape choice.
//   Based on the choice, read the required dimensions.
 
//   Output:
//   Print the calculated area with 2 decimal places.
//   For an invalid choice, print Invalid Choice.
 
//   Example:
//   Input:
//   1
//   5
 
//   Output:
//   78.50

import java.util.*;
public class Q07_ShapeArea {
    public static void main(String[] args) {
        Scanner java = new Scanner(System.in);
        int choice = java.nextInt();
        double area;
        switch (choice) {
            case 1:
                double radius = java.nextDouble();
                area = 3.14 * radius * radius;
                System.out.printf("%.2f%n", area);
                break;
            case 2:
                double length = java.nextDouble();
                double breadth = java.nextDouble();
                area = length * breadth;
                System.out.printf("%.2f%n", area);
                break;
            case 3:
                double base = java.nextDouble();
                double height = java.nextDouble();
                area = 0.5 * base * height;
                System.out.printf("%.2f%n", area);
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
