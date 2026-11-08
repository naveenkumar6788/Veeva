// Q2. Prime Numbers in a Range – Moderate  

// Problem: Print all prime numbers between L and R, inclusive, in ascending order. If no prime exists, print None. Constraints: 1 ≤ L ≤ R ≤ 100000. 

// Input: L R 
// Expected Output: Primes separated by one space, or None 

// Test Cases: 
// Input: 10 20 
// Output: 11 13 17 19


import java.util.*;
public class Q02_PrimeNumbersInRange{
    static boolean isPrime(int n){
        if(n < 2){
            return false;
        }
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner java = new Scanner(System.in);
        int l = java.nextInt();
        int r = java.nextInt();
        boolean found = false;
        for(int i = l; i <= r; i++){
            if(isPrime(i)){
                if(found){
                    System.out.print(" ");
                }
                System.out.print(i);
                found = true;
            }
        }
        if(!found){
            System.out.println("None");
        }else{
            System.out.println();
        }
    }
}
