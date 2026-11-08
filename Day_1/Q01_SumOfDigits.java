import java.util.*;
public class Q01_SumOfDigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
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
