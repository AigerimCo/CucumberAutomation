package homeAssignment;

import java.util.Scanner;

public class PracticeIfElseOne {
    public static void main(String[] args) {
        /*
     1.   Write a Java program that takes in two integers from the user and uses the arithmetic operators
         to perform addition, subtraction, multiplication, and division. The program should then output
         the results of these operations. Note, that program should perform these operations only if given
         numbers are more than 0 and less than 50.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number (between 0 and 50): ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number (between 0 and 50): ");
        int num2 = scanner.nextInt();

        if (num1 < 0 || num1 > 50 || num2 < 0 || num2 > 50) {
            System.out.println("The entered numbers are not between 0 and 50.");
            System.exit(0);
        }

        int addition = num1 + num2;
        int substraction = num1 - num2;
        int multiplication = num1 * num2;
        int division = num1 / num2;

        System.out.println("Sum of two numbers: " + addition);
        System.out.println("Difference of two numbers: " + substraction);
        System.out.println("Increase of two numbers: " + multiplication);
        System.out.println("Quotient of two numbers: " + division);
        System.out.println("=========================================================");

/*
2. Write a Java program that takes in two integers from the user and uses an if-else statement
 to determine which integer is larger. The program should then return the larger integer.
  If the larger integer is 2 times larger than the smaller one, return 0.
  If the larger integer is 10 times larger than small one, return 1.
 */

    Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
    int a = scan.nextInt();

        System.out.println("Enter the second integer: ");
    int b = scan.nextInt();

        if (a > b) {
        if (a == b * 2) {
            System.out.println("0");
        } else if (a == b * 10) {
            System.out.println("1");
        } else {
            System.out.println(a);
        }
    } else if (b > a) {
        if (b == a * 2) {
            System.out.println("0");
        } else if (b == a * 10) {
            System.out.println("1");
        } else {
            System.out.println(b);
        }
    } else {
        System.out.println("The two integers are equal.");
    }
        System.out.println("======================================================");

        /*
       3. Write a Java program that takes in an integer from the user and returns true of the integer is odd
        and can be divided by 3. If the integer is even and divisible by 5, return true.
        In all other cases, return false.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        boolean isOdd = (num % 2 == 1 && num % 3 == 0);
        boolean isEven = (num % 2 == 0 && num % 5 == 0);

        if (isOdd || isEven) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println("===================================================");

        /*
    4. Write a Java program that takes in 5 integers and returns the largest of the 5 integers.
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int number1 = sc.nextInt();

        System.out.print("Enter the second integer: ");
        int number2 = sc.nextInt();

        System.out.print("Enter the third integer: ");
        int number3 = sc.nextInt();

        System.out.print("Enter the fourth integer: ");
        int number4 = sc.nextInt();

        System.out.print("Enter the fifth integer: ");
        int number5 = sc.nextInt();

        int largest = number1;

        if (number2 > largest) {
            largest = number2;
        }

        if (number3 > largest) {
            largest = number3;
        }

        if (number4 > largest) {
            largest = number4;
        }

        if (number5 > largest) {
            largest = number5;
        }

        System.out.println("The largest number is: " + largest);
        System.out.println("==========================================");

        /*
   5.     Write a Java program that takes in two integers from the user and returns true
          if  the first integer is divisible by the second integer, or
          if second integer is divisible by first integer. Else, return false
         */
        Scanner user = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int n1 = user.nextInt();

        System.out.print("Enter the second integer: ");
        int n2 = user.nextInt();

        boolean divisible = (n1 % n2 == 0 || n2 % n1 == 0);

        if (divisible) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    }




