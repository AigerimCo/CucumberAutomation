package recap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class PracticeHashMaps {
    /*
    create a method, that takes ArrayListTest of Integers as parameter
    returns HashMap <Integer, Integer> with arrayList integers as the keys,
    and integers *100 as values

    ArrayListTest<Integer> al = 1,4,6,7,9,2

    1=100
    4=400
    6=600
    7=700
    9=900
    2=200

     */

    public static HashMap<Integer, Integer> returnHashMapOf100(ArrayList<Integer> numbers) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer i : numbers) {
            map.put(i, i * 100);
        }
        System.out.println(map);
        return map;
    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < 90; i++) {
            al.add(new Random().nextInt(5, 700));

/*
or instead of loop - from line 34 to 36 use add method
            al.add(1);
            al.add(2);
            al.add(4);
            al.add(9);
 */

        }
        returnHashMapOf100(al);
    }
    /*
    create a method that takes HashMap<String, Double> products
    and prints all product names in one line comma separated
    and returns all prices as ArrayListTest

    bread = 3.49
    milk = 6.99
    avocado = 1.99

    bread, milk, avocado
     */

 //   public static ArrayListTest<Double> getPrices(HashMap<String, Double> products){

 //   }


    /*
    create a method that takes HashMap<String, Integer>
    returns HashMap <Integer, String>
    it needs to swap keys and values

    bread = 3
    milk = 6
    avocado = 1

    return ===>
    3 = bread
    6 = milk
    1 = avocado
     */
 //   public static HashMap<Integer, String> swapKeyValues(HashMap<String, Integer> map){

  //  }

    /*
    create a method that takes HashMap<String, Short> as paramater
    and returns HashMap<Short, String>, swap key and values
    concatenate SWAP to String

    bread = 1
    milk = 5
    avocado = 2

    return ===>
    1 = bread SWAP
    5 = milk SWAP
    2 = avocado SWAP
     */
 //   public static HashMap<Short, String> swapKeyValues2(HashMap<String, Short> map){

//    }


    /*
    create a method which takes HashMap<Integer, Integer>
    returns Array of Integers with sums of 2 integers from map

    2=4
    1=5
    6=0
    3=7

    Integers [] {6, 6, 6, 10}
     */
 //   public static int [] returnSums(HashMap<Integer, Integer>){

 //   }
}