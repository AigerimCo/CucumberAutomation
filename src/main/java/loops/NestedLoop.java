package loops;

public class NestedLoop {
    public static void main(String[] args) {

   /*
    write a program that prints"Hello" 10 times using FOR LOOP
    */
        for (int a = 1; a <= 10; a++) {
            System.out.println("Hello");
        }

        /*
        print "Hi" 10 times using WHILE LOOP
         */
        int b = 1;
        while (b <= 10) {
            System.out.println("Hi");
            b++;
        }
      /*
      print Bye bye 10 times using WHILE DO LOOP
      */
        int a = 10;
        do {
            System.out.println("bye bye");
            a--;
        } while (a > 0);

        /*
        create a loop to iterate three times(3 weeks)
        and,inside, the loop,create another loop to iterate
        7 times(7 days)
         */

        for (int i = 1; i <= 3; i++) {
            System.out.println("WEEK: " + i);

            for (int j = 1; j <= 7; j++) {
                System.out.println("day: " + j);
            }

            /*
            create nested for loop, print
            12 months and 30 days in each of the month
            1 month
            1 day
            2 day
            3 day up to 30 day
            2 month
            1 day
            2 days.....
             */
            for (int c = 1; c <= 12; c++) {
                System.out.println("MONTH: " + c);

                for (int s = 1; s <= 30; s++) {
                    System.out.println(" day : " + s);

                }
            }
            /*

             *
             **
             ***
             ****
             *****
             ******
             *******
             *use nested for loop
             */
            for (int y = 1; y <= 7; y++) {
                for (int g = 1; g <= y; g++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

/*

                 *
                * *
               * * *
              * * * *
             * * * * *
            * * * * * *

      !!!  HAPPY NEW YEAR !!!
      print 5 spaces 1 star
      print 4 spaces 2 stars
      print 3 spaces 3 stars
      print 2 spaces 4 stars
      print 1 space 5 stars
      print 0 space 6 stars
 */
            for (int u = 1; u < 7; u++){
                for (int e = 1; e <= 7 - u; e++){ //print spaces
                    System.out.print(" ");
                }
                for (int v = 1; v <= u*2 -1; v++){
                System.out.print("*");
            }
                System.out.println();
            }
        System.out.println("!!! HAPPY NEW YEAR !!!");



        }
    }
}