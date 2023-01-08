package recap;

public class RecapForLoop {
    public static void main(String[] args) {


        System.out.println(1);
        System.out.println(2);
        System.out.println(3);

        System.out.println(100);
        //    initialization     condition     changing
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);//1
        }


     /*
     create for loop which prints numb from 10 to 1
     */
        for (int a = 10; a >= 1; a--) {
            System.out.println(a);//10
        }


        //number++; // number = number + 1

        //   number --;// number=number-1


    /*
    print number from 20 to 25 inclusive
     */


        for (int v = 20; v <= 25; v++) {
            System.out.println(v + "hello");
        }
    /*
    print number from 0 to 10
    0-even
    2-even
    4-even
    6-even
    8-even
    10-even
     */
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i + " - even");
        }
    /*
    compound operators
     */

        int num1 = 30;
        num1 += 3; //33 ===> num1=num1+3

        num1 += 5;//38===> num1=33+5

        num1 /= 2;//19===>num1=38/2
        int num2 = 10;
        //       num2 % 3= 1;// ===> num1 = num1 % 3


        for (int i = 1; i <= 30; i += 2) {////
            System.out.println(i + " - odd");
        }
        for (int i = 0; i <= 20; i++) {
            System.out.println(i + " apples");
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(2 + " * " + i + " = " + (2 * i));
        }
        for (int i = 0; i <= 5; i++) {
            System.out.println("java is fun");
        }
        for (int i = 10; i >= 0; i--) {
            System.out.println("The value of x is:" + i);
        }

        int budget = 12;
        int priceForIceCream = 10;

        if (priceForIceCream < budget) {
            System.out.println("buy ice cream");//buy ice cream
        } else {
            System.out.println("no ice cream");

        }

        //print 1 to 10

        for (int i = 1; i <= 10; i++) {  // or i < 11 any version can work
            System.out.println(i + " ");
        }
        for (int i = 10; i >= 0; i -= 2) {
            System.out.println("The value of y is: " + i);
        }
        /*

        int sum = 55;

        for (int i = 1; i <= 10; i++) {
            System.out.println("the value of i: " + i);
            sum = sum + i;
        }

        System.out.println("The sum of first 10 numbers is: " + sum);
    }

         */


    }
}


