// Q8. Maximum Subarray Sum - Moderate
 
//   Problem:
//   Given an array of integers, find the maximum sum of a non-empty contiguous subarray.
//   A subarray is a continuous part of an array.
//   The array may contain negative numbers.
//   The solution should run in O(N) time.
 
//   Input:
//   The first line contains an integer N representing the size of the array.
//   The second line contains N integers.
 
//   Output:
//   Print the maximum subarray sum.
 
//   Example:
//   Input:
//   9
//   -2 1 -3 4 -1 2 1 -5 4
 
//   Output:
//   6

import java.util.*;

public class Q08_MaximumSubarraySum {
    public static void main(String[] args) {
        Scanner java = new Scanner(System.in);
        int n = java.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = java.nextInt();
        }
        int currentSum = arr[0];
        int maxSum = arr[0];
        for (int i = 1; i < n; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        System.out.println(maxSum);
    }
}
