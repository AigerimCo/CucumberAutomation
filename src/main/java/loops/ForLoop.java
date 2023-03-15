package loops;

public class ForLoop {
    public static void main(String[] args) {
        /*
        create a program that will print num from 0 to 100
        from 2 to 50
         */


        for (int i = 0; i <= 100; i++) {
//            System.out.println(i);
        }

        for (int i = 2; i <= 50; i++) {
//            System.out.println(i);
        }

        /*
        print
        apple #1
        apple #2
        apple #3
        up to 50
         */

        for (int i = 1; i <= 20; i++) {
            System.out.println(i + " apples");
        }


        /*
        2 * 1 = 2
        2 * 2 = 4
        2 * 3 = 6
        ...
        2 * 10 = 20
         */
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + (2 * i));
        }

        /*
        100 * 1 = 100
        100 * 2 = 200
        100 * 3 = 300

        100 * 100 = 10000

         */

        for (int i = 0; i <= 5; i++) {
            System.out.println("Java is fun");
        }

        /*
        My name is yourName
        50 times
         */

        for (int j = 0; j < 50; j++) {
            System.out.println("My name is Gera");
        }


        for (int i = 10; i > 0; i--) {
            System.out.println("The value of x is: " + i);
        }

        /*
        create a loop that will
        print from 100 to 1

        hint: use if-else
        i % 2 = 0 ==> even
        i % 2 != 0 ==> odd

        100 - even
        99 - odd
        98 - even

        1 - odd
         */

        for (int i = 100; i > 0; i--) {
            if (i % 2 == 0) {
                System.out.println(i + " - even");
            } else {
                System.out.println(i + " - odd");
            }

        }

        multiplication(3);
        multiplication(7);
        multiplication(922);
        multiplication(329319);
        addition(90);
        addition(-20);
        division(20);


        for (int i = 10; i >= 0; i = i - 2) {
            System.out.println(i);
        }


        for (int m = 1; m <= 15; m = m + 2) {
            System.out.println("The value of num is: " + m);
        }


        method1(10);

        int i = 0;
        for (i = 0; i < 1; i++) {
            System.out.println("bena: " + i);
            String hello = new String("Codewise");
            System.out.println(hello);
        }
    }

    /*
    number * 1 = ?
    number * 2 = ?
    number * 3 = ?
    number * 4 = ?
    -----
    up to 10
     */
    public static void multiplication(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }

    /*
    number + 1 = ?
    number + 2 = ?
    ---
    up to 50
     */
    public static void addition(int number) {
        for (int i = 1; i <= 50; i++) {
            System.out.println(number + " + " + i + " = " + (number + i));
        }
    }

    /*
    use double
    number / 1 = ?

    number / 5 = ?

    16 / 5 = 3.33131
     */

    public static void division(int number) {

        for (double i = 1; i <= 5; i++) {
            System.out.println(number + " / " + i + " = " + number / i);
        }
    }

    /*
    number = 10
    the number is: 1 * 1 * 2 * 3 * 4 * 5 .... * 10 =
    the number is: 2
    the number is: 3

    The total sum is: 55
     */
    public static void method1(int number) {
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            System.out.println("the number is: " + i);
            sum = sum + i;
        }

        System.out.println("The total sum is: " + sum);
    }


    public static void method2(int number) {
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            System.out.println("the number is: " + i);
            sum = sum * i;
        }

        System.out.println("The total sum is: " + sum);
    }
}