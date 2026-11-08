//   Q4. Second Largest Distinct Element - Moderate
 
//   Problem:
//   Given an array of integers, find the second largest distinct element without sorting the array.
//   Duplicate elements should be considered only once.
//   If the array contains fewer than two distinct elements,
//   print None.
 
//   Input:
//   The first line contains an integer N representing
//   the size of the array.
//   The second line contains N integers.
 
//   Output:
//   Print the second largest distinct element.
//   If no second largest element exists, print None.
 
//   Example:
//   Input:
//   6
//   10 20 5 20 8 15
 
//   Output:
//   15
 

import java.util.*;
public class Q04_SecondLargest {
    public static void main(String[] args) {
        Scanner java = new Scanner(System.in);
        int n = java.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = java.nextInt();
        }
        int largest = arr[0];
        int secondLargest = 0;
        boolean foundSecond = false;
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
                foundSecond = true;
            } else if (arr[i] < largest) {
                if (!foundSecond || arr[i] > secondLargest) {
                    secondLargest = arr[i];
                    foundSecond = true;
                }
            }
        }
        if (foundSecond) {
            System.out.println(secondLargest);
        } else {
            System.out.println("None");
        }
    }
}
