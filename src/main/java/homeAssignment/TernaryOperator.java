package homeAssignment;

import java.util.Scanner;
/*
1. Write a program that takes in two integers, x and y,
and uses a ternary operator to determine if x is greater than y.
If x is greater than y, the program should print "x is greater than y".
If x is not greater than y, the program should print "x is not greater than y".
 */
public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int x = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int y = scanner.nextInt();

        String result = (x > y) ? "x is greater than y" : "x is not greater than y";
        System.out.println(result);
        System.out.println("=======================================================");

        /*
        2. Write a program that takes in a year and uses a ternary operator
        to determine if it is a leap year or not. If the year is a leap year,
         the program should print "Leap year", if the year is not a leap year,
         the program should print "Not a leap year".
        Hint: if year % 4 == 0 and  year % 100 != 0, then it's a leap year.
        If year % 400 == 0, not a leap year;
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scan.nextInt();
        String text = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? "Leap year" : "Not a leap year";
        System.out.println(text);
        System.out.println("=============================================================================");

        /*
        3. Write a program that takes in three integers, a, b and c,
        and uses a ternary operator to find the largest number among them.
         Print the largest number.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int largest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println("Largest number: " + largest);
    }
}
