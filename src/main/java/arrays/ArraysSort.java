package arrays;

import java.util.Arrays;

public class ArraysSort {
    public static void main(String[] args){
        //                         0       1         2        3
        String [] strArray = {"banana", "orange", "apple", "kiwi"};
        Arrays.sort(strArray); // this sorts array in ascending order
        System.out.println(Arrays.toString(strArray));// apple, banana, kiwi, orange [

        double[] doubleArr = new double[] {3, 7.5, 7.1, 9, 0, 3.12};
        System.out.println("original: " + Arrays.toString(doubleArr));
        Arrays.sort(doubleArr);
        System.out.println("sorted: " + Arrays.toString(doubleArr));

        //create 9 arrays,print them,sort them and again print values besides boolean(which doesn`t work)

        byte[] byteArr = new byte[] {3, 7, 7, 9, 0, 3};
        System.out.println("original: " + Arrays.toString(byteArr));
        Arrays.sort(byteArr);
        System.out.println("sorted: " + Arrays.toString(byteArr));

        short[] shortArr = new short[] {3000, 7000, 7500, 9350, 12366};
        System.out.println("original: " + Arrays.toString(shortArr));
        Arrays.sort(shortArr);
        System.out.println("sorted: " + Arrays.toString(shortArr));

        int[] intArr = new int[] {30564, 7500, 71000, 90560, 115026, 312000};
        System.out.println("original: " + Arrays.toString(intArr));
        Arrays.sort(intArr);
        System.out.println("sorted: " + Arrays.toString(intArr));

        long[] longArr = new long[] {150660000, 7500000, 7100000, 642036122, 895623015, 31235648};
        System.out.println("original: " + Arrays.toString(longArr));
        Arrays.sort(longArr);
        System.out.println("sorted: " + Arrays.toString(longArr));

        float[] floatArr = new float[] {250.5f, 722.5f, 765.1f,256.45f, 234.25f, 344.12f};
        System.out.println("original: " + Arrays.toString(floatArr));
        Arrays.sort(floatArr);
        System.out.println("sorted: " + Arrays.toString(floatArr));

        char[] charArr = new char[] {'b','h','t','w', 'a', 'l'};
        System.out.println("original: " + Arrays.toString(charArr));
        Arrays.sort(charArr);
        System.out.println("sorted: " + Arrays.toString(charArr));

    }
}
