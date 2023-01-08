package recap;

import java.util.Scanner;

public class DoWhileCalculator1 {
    public static void main(String[] args) {

    /*
 ask for the first number
 ask for arithmetic operator : +,-,*,/,%
 ask for the second number
 perform your operation
 and print out the result
 --------------------------
 Enter first number:
 5
 Enter arithmetic operator : +,-,*,/,%
 +
 enter second number:
 10
 the result : 5 + 10 = 15
  */
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first number");
        int a = sc.nextInt();

        System.out.println("Please enter your second number");
        int b = sc.nextInt();
        System.out.println("Please enter arithmetic operator");
        String operator = sc.next();
        if (operator.equals("+")) {
            System.out.println(a + b);
        } else if (operator.equals("-")) {
            System.out.println(a - b);
        } else if (operator.equals("*")) {
            System.out.println(a * b);
        } else if (operator.equals("/")) {
            System.out.println(a / b);
        } else if (operator.equals("%")) {
            System.out.println(a % b);
        } else {
            System.out.println("incorrect arithmetic operator");
        }


        Scanner user = new Scanner(System.in);

        boolean answer = false;
        do {
            System.out.println("enter first number: ");
            int aa = user.nextInt();

            System.out.println("enter arithmetic operator: ");
            String Operator = user.next();

            System.out.println("enter second number: ");
            int bb = user.nextInt();

            if (operator.equals("+")) {
                System.out.println(aa + " + " + bb + " = " + (aa + bb));
            } else if (operator.equals("-")) {
                System.out.println(aa + " - " + bb + " = " + (aa - bb));
            } else if (operator.equals("*")) {
                System.out.println(aa + " * " + bb + " = " + (aa * bb));
            } else if (operator.equals("/")) {
                System.out.println(aa + " / " + bb + " = " + (aa / bb));
            } else if (operator.equals("%")) {
                System.out.println(aa + " % " + bb + " = " + (aa % bb));
            } else {
                System.out.println("Sorry, wrong operator! Please enter + or - or / or * or %");
            }
            System.out.println("Do you want to try again? true/false");
            answer = user.nextBoolean();
        } while (answer);
    }
}



