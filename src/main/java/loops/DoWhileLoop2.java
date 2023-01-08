package loops;

import java.util.Scanner;

public class DoWhileLoop2 {
    public static void main(String[] args) {


    /*
    ask user to enter integers. Two numbers should be added,
    and you need to print out sum of 2 numbers.
    The loop should ask user if he wants to perform
     this operation again: true or false;
     If true,again get 2 numbers and display the sum.
     Ask again until false
     */

        Scanner user = new Scanner(System.in);


        boolean answer;
        do {
            System.out.println("Enter first number: ");
            int a = user.nextInt();

            System.out.println("Enter second number");
            int b = user.nextInt();

            System.out.println(a + b);
            System.out.println("Do you want to try again? true/false");
           answer = user.nextBoolean();
        }while(answer);
        }
    }

