package beginningPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class PracticeHome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write any number until 10 -> ");
        int num = scanner.nextInt(); // 7

        int counter = 0;


//variable
        int i = 0;
//conditions
        while (i < 10) {
            System.out.println("Hello " + counter);
            counter++;
            //change
            i++;
        }

        for (int a = 0; a < 10; a++) {
            System.out.println("test " + i);
        }


        int number = 0;
        do {
            number++;
            System.out.println("hello " + number);
        }while (number < 10);



        int[] array = new int[]{235,63456,234,5,1245,1,5,12,54,3256,532,6,236};

        for (int num1: array){
            System.out.println(num1);
        }


    }
}