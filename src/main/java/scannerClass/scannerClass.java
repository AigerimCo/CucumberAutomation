package scannerClass;

import java.util.Scanner;
public class scannerClass {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int a = scanner.nextInt();

        System.out.println("Please enter the second number");
        int b = scanner.nextInt();

        int sum = a + b;
        System.out.println(a + " + " + b + " = " +sum);




    }
}
