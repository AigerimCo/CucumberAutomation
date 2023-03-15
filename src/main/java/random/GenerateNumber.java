package random;

import java.util.Random;
/*
    PSEUDO CODE for TASK 1
1. Create class and main method
2. Generate a random number btw 0 to 100
3. Store that number somewhere
4. write a loop that runs from 0 to 100
5. On each iteration check if i is equal to random number
6. If it is then print the message and break the loop
7. if not keep iterating until it finds
     Random random = new Random();
      random.nextInt(101);

 */
public class GenerateNumber {
    public static void main(String[] args) {
   /*
   write a program that generates a number between 0 -100,
   and your program should keep looking for the number
   one by one and when its finds it should print
   "random number found" and print that number
    */


        Random random = new Random();
        int thatRandom = random.nextInt(101);
        System.out.println(thatRandom);

       for(int i=0; i<101; i++) {
           if(i==thatRandom){
               System.out.println("I found the number: " + i);
               break;
           }
        }
    }
}
