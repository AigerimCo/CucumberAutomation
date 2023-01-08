package arrays;

import java.util.Arrays;

public class ArraysToString {
    public static void main(String[] args){
        String [] strArray1 = {"Good", "Morning", "Everyone:"};
        String [] strArray2 = {"Good", "Morning", "Everyone:"};
        String[] strArray3 = strArray1;

        System.out.println(strArray1);

        System.out.println(strArray2);
        System.out.println(strArray3);

        /*
        Arrays.toString(arr)method converts all values of any type of array into one String.
         */

        System.out.println(Arrays.toString(strArray1));

        int [] intArray = {1,2,3,4,5,6,7,8,9,0} ;
        String str = Arrays.toString(intArray);
        System.out.println(str);

         /*
        please create 8 primitives and 1 String array, put some values
        print the values using toString()
         */
    }

    }

