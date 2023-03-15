package hometasks;

import java.util.Arrays;

public class ArraysHomework {
    public static void main(String[] args) {
        /*
        1. given below array of ints, write a program to sum values of array and print this sum.
        int [] my_array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Expected output: The sum of given ints is: 55
         */

        int[] my_array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int i = 0; i < my_array.length; i++) {
            sum += my_array[i];
            System.out.println("The sum of given ints is " + sum);
        }
        System.out.println("============================================");
    /*
    2. given below array of ints, write a program to calculate the average value of array elements
    int [] averValues = {3, 6, 8, 10, 90, 0, 25, 2, 32, 11};
    Expected output: The average value of given ints is: 18
     */

        int[] averValues = {3, 6, 8, 10, 90, 0, 25, 2, 32, 11};
        int sum1 = 0;
        for (int i = 0; i < averValues.length; i++) {
            sum1 += averValues[i];
        }
        int average = sum1 / averValues.length;
        System.out.println("The average value of given ints is: " + average);

        System.out.println("======================================");

       /*
     #3 create 5 arrays with different sizes, names and values.
      Try to use different declaration methods, and using for-loop print all values
      of one of the arrays of each type.Print all elements of one array.
      */

//3.1. create 5 arrays of int with different sizes, names and values.
        //   Print all elements of one array.

        System.out.println("INT");
        System.out.println(" ");

//1
        int[] one = new int[]{1, 2, 3, 4, 5,};

        for (int i = one.length - 1; i >= 0; i--) {
            System.out.println(one[i]);
        }
        System.out.println("*****************");
//2

        int[] two = new int[5];
        two[0] = 111;
        two[1] = 222;
        two[2] = 333;
        two[3] = 444;
        two[4] = 555;

        for (int a = 0; a < two.length; a++) {
            System.out.println(two[a]);
        }
        System.out.println("*****************");
//3


        int[] three = {1, 11, 22, 33, 44, 55, 66};
        System.out.println(three[5]);
        System.out.println("*****************");
//4

        int four[] = {6, 7, 8, 9, 10, 11};

        System.out.println(four[4]);
        System.out.println("*****************");
//5
        int[] five = new int[5];
        five[0] = 9;
        five[1] = 99;
        five[2] = 199;
        five[3] = 299;
        five[4] = 399;
        System.out.println(five[2]);
        System.out.println("*****************");
        System.out.println(" ");
    /*
    3.2. create 5 arrays of double with different sizes,
    names  and values. Print all elements of one array.
 */
        System.out.println("DOUBLE");
        System.out.println(" ");
//1
        double[] oned = new double[]{35.0, 36.2, 17.7, 38.5, 39.6};
        for (int x = 0; x < oned.length; x++)
            System.out.println(oned[x]);
        System.out.println("*****************");
//2

        double[] twod = new double[4];
        twod[0] = 1.1;
        twod[1] = 2.2;
        twod[2] = 3.3;
        twod[3] = 4.4;
        System.out.println(twod[1]);
        System.out.println("*****************");

//3
        double threed[] = {1.2, 2.2, 3.2, 4.2, 5.2, 6.2, 7.2};
        System.out.println(threed[3]);
        System.out.println("*****************");

//4
        double[] fourd = new double[5];
        fourd[0] = 1.1;
        fourd[1] = 2.2;
        fourd[2] = 3.3;
        fourd[3] = 4.4;
        fourd[4] = 5.5;
        System.out.println(fourd[4]);
        System.out.println("*****************");

//5
        double[] fived = new double[]{100.0, 200.2, 300.7, 400.5, 500.6};
        System.out.println(fived[2]);
        System.out.println(" ");
  /*
  3.3.  create 5 arrays of short with different sizes, names  and values.
        all elements of one array.
   */
        System.out.println("SHORT");
        System.out.println(" ");
//1
        short[] ones = {11, 22, 33, 44, 55};
        System.out.println(ones[0]);

        for (int b = 1; b < ones.length; b++) {
            System.out.println(ones[b]);

        }
        System.out.println("*****************");
//2
        short[] twos = new short[]{100, 200, 300, 4005, 5006};
        System.out.println(twos[2]);
        System.out.println("*****************");
//3
        short[] threes = new short[4];
        threes[0] = 111;
        threes[1] = 222;
        threes[2] = 333;
        threes[3] = 444;
        System.out.println(threes[1]);
        System.out.println("*****************");
//4
        short[] fours = new short[]{101, 202, 303, 404, 505};
        System.out.println(fours[2]);
        System.out.println("*****************");
//5
        short[] fives = new short[4];
        fives[0] = 1;
        fives[1] = 2;
        fives[2] = 3;
        fives[3] = 4;
        System.out.println(fives[1]);
        System.out.println("*****************");
        System.out.println(" ");


        System.out.println("STRING");
        System.out.println(" ");
    /*
    3.4. create 5 arrays of String with different sizes,
     names  and values. Print all elements of one array.
     */
//1
        String[] berries = new String[5];
        berries[0] = "raspberry";
        berries[1] = "strawberry";
        berries[2] = "blueberry";
        berries[3] = "blackberry";
        berries[4] = "cranberry";


        for (int a = 0; a < berries.length; a++) {
            System.out.println(berries[a]);
        }
        System.out.println("*****************");
//2
        String[] cars = new String[]{"BMW", "MERCEDES", "TOYOTA", "VOLKSWAGEN"};
        System.out.println(cars[2]);
        System.out.println("*****************");
//3
        String[] phones = {"IPHONE", "SAMSUNG", "NOKIA", "PIXEL", "GOOGLE"};
        System.out.println(phones[3]);
        System.out.println("*****************");
//4
        String[] clothes = new String[4];
        clothes[0] = "SHIRT";
        clothes[1] = "SHORTS";
        clothes[2] = "HAT";
        clothes[3] = "VEST";
        System.out.println(clothes[3]);
        System.out.println("*****************");
//5
        String[] colors = new String[]{"BLACK", "BLUE", "YELLOW", "GREEN", "PINK", "BROWN"};
        System.out.println(colors[2]);
        System.out.println("*****************");
        System.out.println(" ");

 //  3.5 create 5 arrays of boolean with different sizes, names  and values.
 //     Print all elements of one array.

        Boolean [] aaa = {false, true, true, false,false,true};

        for (int b = 0; b < aaa.length; b++) {
            System.out.println(aaa[b]);
        }
        System.out.println("*****************");

//2
        Boolean [] bbb = new Boolean[6];
        System.out.println(bbb[2]);
        System.out.println("*****************");

//3
        Boolean [] ccc = new Boolean[4];
        ccc [0] = true;
        ccc [1] = false;
        ccc [2] = false;
        ccc [3] = true;
        System.out.println(ccc[1]);
        System.out.println("*****************");

//4
        Boolean [] ddd = {true,false,true,false,false};
        for(int i = 0; i < ddd.length; i++) {
            System.out.println(ddd[i]);
        }
        System.out.println("*****************");

//5
        Boolean[] eee = new Boolean[4];
        eee [0] = false;
        eee [1] = true;
        eee [2] = false;
        eee [3] = false;
        System.out.println(eee[1]);
        System.out.println("*****************");

    }
}

