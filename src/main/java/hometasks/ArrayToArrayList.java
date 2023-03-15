package hometasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {

   public static void main(String[] args) {

       /*
    1. Create array of Strings, put 10 elements inside.
     Print all values and size of array. Convert array to ArrayList.
     Print all values and size of arraylist.
     */

       String[] weather = {"sunny", "cloudy", "rainy", "snowy", "windy", "humidity", "stormy", "foggy", "blizzard", "cloudless"};
       ArrayList <String> weather1 = new ArrayList<>();
        for(int i = 0; i < weather.length; i++){
           System.out.println("# " + i + " " + weather[i]);
          weather1.add(weather[i]);
       }
       System.out.println(weather1);
       System.out.println("------------------------------------------------------------");

     /*
    2. Create array of int, put 10 elements inside.
     Print all values and size of array.
     Convert array to ArrayListTest. Print all values and size of arraylist.
     */

        int [] numbers = new int[]{1,2,3,4,5,6,7,8,9,10};
        ArrayList <Integer > number = new ArrayList<>();
        for(int a = 0; a < numbers.length; a++){
            System.out.println(numbers[a]);
            number.add(numbers[a]);
        }
       System.out.println(number);
       System.out.println("------------------------------------------------------------");

      /*
    3. Create array of doubles, put 5 elements inside. Print all values and size of array.
    Convert array to ArrayList. Print all values and size of arraylist.
     */
       double[] price = new double[]{15.00d,14.99d,13.49d,12.99d,11.50d};
       ArrayList < Double > price1 = new ArrayList<>();

       for(int b = 0; b < price.length;b++) {
           System.out.println(" $ " + price[b]);
           price1.add(price[b]);
       }
       System.out.println(price1);
       System.out.println("---------------------------------------------------------------" );

       /*
       4. Create array of char, put 8 elements inside. Print all values and size of array.
        Convert array to ArrayList. Print all values and size of arraylist.
        */
       char[]letters = new char[8];
       ArrayList < Character > letter = new ArrayList<>();
       letters[0] = 'a';
       letters[1] = 'b';
       letters[2] = 'c';
       letters[3] = 'd';
       letters[4] = 'e';
       letters[5] = 'f';
       letters[6] = 'g';
       letters[7] = 'h';

       for (int c = 0; c < letters.length;c++) {
           System.out.println("letter " + letters[c]);
           letter.add(letters[c]);
       }
       System.out.println(letter);
       System.out.println("--------------------------------------------");

/*
5. Create array of boolean, put 5 elements inside.
Print all values and size of array. Convert array to ArrayList.
Print all values and size of arraylist.
 */
       boolean[] bool = new boolean[]{true, true, false, true, false};
       ArrayList <Boolean > booll = new ArrayList<>();
       for (int d = 0; d < bool.length; d++) {
           System.out.println(bool[d]);
           booll.add(bool[d]);
       }
       System.out.println(booll);
       }

       }








