// Q6. Rotate Array Right - Moderate

//   Problem:Given an array of N integers and an integer K, rotate the array to the right by K positions.Elements moved beyond the last position should
//   come back to the beginning of the array. K may be greater than N.
 
//   Input:
//   The first line contains an integer N representing
//   the size of the array.
//   The second line contains N integers.
//   The third line contains an integer K.
 
//   Output:
//   Print the rotated array elements separated by spaces.
 
//   Example:
//   Input:
//   5
//   1 2 3 4 5
//   2
 
//   Output:
//   4 5 1 2 3


import java.util.*;
public class Q06_RotateArray {
    public static void main(String[] args) {
        Scanner java = new Scanner(System.in);
        int n = java.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = java.nextInt();
        }
        int k = java.nextInt();
        k = k % n;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int newIndex = (i + k) % n;
            result[newIndex] = arr[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}
