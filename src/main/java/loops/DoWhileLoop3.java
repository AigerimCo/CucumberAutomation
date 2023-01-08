package loops;

import java.util.Scanner;

public class DoWhileLoop3 {
    public static void main(String[] args) {

    /*
    ask user to input first number
    ask user to input arithmetic operator
    ask user to input second number
    print the result
    ask user if he wants to try again: true or false
    if true, keep doing until false
     */
        Scanner scan = new Scanner(System.in);

        boolean answer;
        do {
            System.out.println("Enter first number: ");
            int a = scan.nextInt();

            System.out.println("Enter arithmetic operator");
            String operator = scan.next();


            System.out.println("Enter second number: ");
            int b = scan.nextInt();

            if (operator.equals("+")) {
                System.out.println(a + " + " + b + " = " + (a + b));
            } else if (operator.equals("-")) {
                System.out.println(a + " - " + b + " = " + (a - b));
            } else if (operator.equals("*")) {
                System.out.println(a + " * " + b + " = " + (a * b));
            } else if (operator.equals("/")) {
                System.out.println(a + " / " + b + " = " + (a / b));
            }
            System.out.println("Do you want to try again? true/false");
            answer = scan.nextBoolean();
        } while (answer);
    }
}

