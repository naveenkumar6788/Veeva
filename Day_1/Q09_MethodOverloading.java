// Q9. Method Overloading Calculator - Moderate
 
//   Problem:
//   Create a calculator using method overloading.
 
//   Create three methods with the same name calculate() but with different parameter lists.
 
//   Operations:
//   1. Addition
//   2. Subtraction
//   3. Multiplication
 
//   The calculator should support:
//   - Two integer numbers.
//   - Three integer numbers.
//   - Two decimal numbers.
 
//   Input:
//   The first line contains the number of values (2 or 3).
//   If the number of values is 2, read two numbers.
//   If the number of values is 3, read three integers.
//   The last input represents the operation code.
 
//   Output:
//   Print the calculated result.
 
//   Example:
//   Input:
//   2
//   10 5
//   1
 
//   Output:
//   15

import java.util.*;
public class Q09_MethodOverloading {
    static int calculate(int a, int b, int operation) {
        switch (operation) {
            case 1:
                return a + b;
            case 2:
                return a - b;
            case 3:
                return a * b;
            default:
                return 0;
        }
    }
    static int calculate(int a, int b, int c, int operation) {
        switch (operation) {
            case 1:
                return a + b + c;
            case 2:
                return a - b - c;
            case 3:
                return a * b * c;
            default:
                return 0;
        }
    }
    static double calculate(double a, double b, int operation) {
        switch (operation) {
            case 1:
                return a + b;
            case 2:
                return a - b;
            case 3:
                return a * b;
            default:
                return 0;
        }
    }
    public static void main(String[] args) {
        Scanner java = new Scanner(System.in);
        int count = java.nextInt();
        if (count == 2) {
            if (java.hasNextInt()) {
                int a = java.nextInt();
                int b = java.nextInt();
                int operation = java.nextInt();
                System.out.println(calculate(a, b, operation));
            } else {
                double a = java.nextDouble();
                double b = java.nextDouble();
                int operation = java.nextInt();
                System.out.printf("%.2f%n", calculate(a, b, operation));
            }
        } else if (count == 3) {
            int a = java.nextInt();
            int b = java.nextInt();
            int c = java.nextInt();
            int operation = java.nextInt();
            System.out.println(calculate(a, b, c, operation));
        } else {
            System.out.println("Invalid Input");
        }
    }
}
