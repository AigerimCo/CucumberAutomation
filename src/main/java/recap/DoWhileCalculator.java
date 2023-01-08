package recap;

import java.util.Scanner;

public class DoWhileCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter number");
        int a = sc.nextInt();

        System.out.println("Wohoo, your number is: " + a);

        System.out.println("Please enter your name?");
        String name = sc.next();
        System.out.println("Hello " + name);
    }
}

