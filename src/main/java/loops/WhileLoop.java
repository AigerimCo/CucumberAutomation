package loops;

public class WhileLoop {
    public static void main(String[] args) {
/*
Using while loop, 10 times print:
good morning everyone!
 */
        // while(boolean condition)
        //statement
        //update

        for (int i = 1; i <= 5; i++) {
            System.out.println("Good morning everyone!");


        }
        int i = 1;
        while (i <= 10) {
            System.out.println("Good morning!");
            i++;
        }
        int x = 0;
        while (x <= 20) {
            System.out.println(x);
            x++;
        }
/*
Using while loop, write a program that prints
1 January 2023
2 January 2023
3 January 2023
up to 31 January 2023
 */
        int y = 1;
        while (y <= 31) {
            System.out.println(y + " January 2023 ");
            y++;
        }
/*
print numbers from 1 to 30
if number is even add 3, if number is odd add2
1-odd + 2 =3
2 - even + 3 = 5
3 - odd + 2 = 5
4 - even + 3 = 7
 */
        int a = 1;
        while (a <= 30) {
            if (a % 2 == 0) {
                System.out.println(a + " - even " + 3 + " = " + (a + 3));
            } else {
                System.out.println(a + " -odd " + 2 + " = " + (a + 2));
            }
            a++;
        }
        /*
        print numbers from 100 to 1 - USE ForLoop, %, If else condition
        if number can be divided by 4, print number: quarter
        if number can be divided by 2, print number: double

        100 double
        100 quarter
        99
        98 double
        97
        96 double
        95
        94 double
        93
        92 quarter
         */
        for (int b = 100; b > 0; b--) {
            if (b % 4 == 0) {
                System.out.println(b + " quarter");
            }
            if (b % 2 == 0) {
                System.out.println(b + " double");
            } else {
                System.out.println(b);
            }


        }
    }
}