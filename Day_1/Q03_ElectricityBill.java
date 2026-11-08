
//  Q3. Electricity Bill - Easy
 
//   Problem:
//   A customer has to pay an electricity bill based on the number of units consumed.
 
//   Billing Rules:
//   - First 100 units: Rs. 1.5 per unit
//   - Next 100 units: Rs. 2.5 per unit
//   - Above 200 units: Rs. 4 per unit
//   - Fixed charge: Rs. 50
 
//   Calculate the total electricity bill.
 
//   Input:
//   An integer representing the number of units consumed.
 
//   Output:
//   Display the total bill with exactly 2 decimal places.
 
//   Example:
//   Input:
//   150
 
//   Output:
//   325.00
 

import java.util.*;
public class Q03_ElectricityBill {
    public static void main(String[] args) {
        Scanner java = new Scanner(System.in);
        int units = java.nextInt();
        double bill = 50;
        if (units <= 100) {
            bill += units * 1.5;
        } else if (units <= 200) {
            bill += 100 * 1.5;
            bill += (units - 100) * 2.5;
        } else {
            bill += 100 * 1.5;
            bill += 100 * 2.5;
            bill += (units - 200) * 4;
        }
        System.out.printf("%.2f%n", bill);
    }
}