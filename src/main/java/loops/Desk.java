package loops;

public class Desk {
    public static void main(String[] args) {

        /*
        create public static method that accepts integer and checks if its even or odd.
         If the  number is even print "Hi" 30 times. If the  umber is odd, print "Hello" 30  times using while loop
              PSEUDO CODE
         1.Method signature
         2.use if else statement to identify if the  umber is even or odd
         3. if its even ==> we use loop to run 30 times and print "Hi".
         4.If its odd ==> we use loop to run and print "Hello".
         */

        checkEvenOrOdd(101);
    }

    public static void checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            //even
            for (int i = 1; i <= 30; i++) {
                System.out.println(i + ". Hi");
            }
        } else {
            //odd
            for (int i = 0; i < 30; i++) {
                System.out.println((i + 1) + ". Hello"); ///(i+1) = podschet hello from 1 to 30
            }
        }

    }


        }
