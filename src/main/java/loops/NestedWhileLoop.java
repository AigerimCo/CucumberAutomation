package loops;

public class NestedWhileLoop {
    public static void main(String[] args) {

        /*
        YEAR: 2021
              month 1
              month 2
        YEAR: 2022
              month 1
              month 2
        YEAR: 2023
              month 1
              month 2
         */
        int r = 2021;
        while (r <= 2023) {
            System.out.println("YEAR: " + r);
            r++;

            int e = 1;
            while (e <= 12) {

                System.out.println("   month: " + e);
                e++;
            }

         /*
         while loop to print
          2000
             2001
             ...
             2049
          3000
             3001
             ...
             3049
          4000
             4001
             ...
             4049
          5000

          Wohoo, I`m done
          */

            int b = 2000;
            while (b <= 5000) {
                System.out.println(b);

                int c = b + 1;
                while (c <= b + 49) {
                    System.out.println("   " + c);
                    c++;
                }
                b += 1000;
            }
            System.out.println("Wohoo, I'm done!");

        }
/*
1
22
333
4444
55555
666666
 */

        int j = 1;

        while (j <= 6) {

            int k = 1;
            while (k <= j) {
                System.out.println(j);
                k++;
            }
            System.out.println();
            j++;
        }
    /*
    Multiplication table for : 2
    2*1=2
    2*2=4
    2*3=6
    ----
    2*10=20

    Multiplication table for : 3
    3*1=3
    3*2=6
    3*3=9
    ----
    3*10=30

////////////////////////////use WHILE LOOP
     */


        int digit = 1;
        while (digit < 10) {
            System.out.println("Multiplication table for: " + digit);

            int digit2 = 1;
            while (digit2 < 10) {
                System.out.println(digit + " * " + digit2 + " = " + (digit * digit2));
                digit2++;
            }
            digit++;
        }
        //=============================NESTED DO WHILE LOOP


        int num1 = 1;
        do {
            System.out.println("Multiplication table for: " + num1);

            int num2 = 1;
            do {
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                num2++;
            } while (num2 <= 10);

            num1++;
        } while (num1 <= 10);


    ///////////////FOR LOOP

        for (int i = 1; i <= 10; i++) {
            System.out.println("ForLoops: Multiplication table for: " + i);
            for(int k = 1; k <= 10; k++){
                System.out.println(i + " * " + k + " = " + (k * i));
            }

            /*
            print numbers from 1 to 10
            if number = even, print this number N times
            if number = odd, print this number just 1 time: number:odd
            USE DO WHILE, if else, modulus
             */

            int number1 = 1;
            do {
                int number2 = 1;
                if (number1 % 2 == 0) {
                    do {
                        System.out.println(number1);
                        number2++;
                    } while (number2 <= number1);
                    System.out.println();
                } else {
                    System.out.println(number1 + " is odd");
                }
                number1++;
            }while(number1 <= 10);
            }
        }
        }


