package hometasks;

import java.util.Scanner;

public class ForLoopHomework {
    public static void main(String[] args) {

        // 1. create a loop that prints all December days from 1 to 31:

        for (int i = 1; i <= 31; i++) {
            System.out.println("December " + i);
        }


        //   2. create a loop that prints all even numbers from 1 to 200:  even: 2
        for (int i = 0; i <= 200; i += 2) {
            System.out.println("even: " + i);
        }

        //  3. create a loop that prints all odd numbers from 100 to 1:
//  99 - odd
//  97 - odd
//   1 - odd

        for (int b = 100; b >= 1; b--) {
            if (b % 2 != 0) {
                System.out.println(b + " - odd");
            }


            //   4. create a loop that prints all the values divisible by 7 in the range of 1 to 100 in reverse order.

//JUST PUT COMMENT ON or HIDE TASK #3,THEN REMOVE COMMENT ON TASK#4 to check result please.
            /*
            for (int c = 100; c >= 1; c--) {
                if (c % 7 == 0) {
                    System.out.println(c + " - divisible");
                } else {
                    System.out.println(c);
             */
        }
    }
}




















