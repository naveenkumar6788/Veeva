//   Q5. Multiplication Table - Easy
//  
//   Problem:
//   Given two integers N and K, print the multiplication table of N from 1 to K.
//  
//   Input:
//   Two integers N and K.
//  
//   Output:
//   Print the multiplication table of N from 1 to K.
//  
//   Example:
//   Input:
//   5 10
//  
//   Output:
//   5 x 1 = 5
//   5 x 2 = 10
//   5 x 3 = 15
//   5 x 4 = 20
//   5 x 5 = 25
//   5 x 6 = 30
//   5 x 7 = 35
//   5 x 8 = 40
//   5 x 9 = 45
//   5 x 10 = 50

import java.util.*;
public class Q05_MultiplicationTable {
    public static void main(String[] args) {
        Scanner java = new Scanner(System.in);
        int n = java.nextInt();
        int k = java.nextInt();
        for (int i = 1; i <= k; i++) {
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }
}
