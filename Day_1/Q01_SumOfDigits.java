// Problem: Read an integer N and print the sum of its digits. Treat a negative number using its absolute Value. 
 
// Input: N 
// Expected Output: Sum of digits 

// Test Cases: 
// Input: 4821 
// Output: 15 
// Input: -709 
// Output: 16



import java.util.*;
public class Q01_SumOfDigits{
    public static void main(String[] args){
        Scanner java = new Scanner(System.in);
        long n = java.nextLong();
        n = Math.abs(n);
        int sum = 0;
        while (n > 0) {
            int digit = (int)(n % 10);
            sum = sum + digit;
            n = n / 10;
        }
        System.out.println(sum);
    }
}
