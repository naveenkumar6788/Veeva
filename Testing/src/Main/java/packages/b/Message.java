package packages.b;

import java.util.Scanner;
public class Message {
    public static void main(String[] args) {
        System.out.println("Happy to know that you are upskilling yourself in the field of Testing");
//        Learn();
    }
    public static void Learn() {
        Scanner input = new Scanner(System.in);
        System.out.println("What is Testing?");
//        String ans = input.next();
        String ans = input.nextLine();
        System.out.println(ans);

    }

}
