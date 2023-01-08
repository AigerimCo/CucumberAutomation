package arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArraysReverseOrder {
    public static void main(String[] args) {

        int a = 6; //primitive
        Integer b = 6; //non primitive, objects, wrapper class

        Integer [] intArray = {5,6,3,0,1,2};
        //0,1,2,3,5,6 ==> ascending order
        //6,5,3,2,1,0 ==> descending order
        Arrays.sort(intArray);
        System.out.println("ascending: "+ Arrays.toString(intArray)); //sorted in ascending

        Arrays.sort(intArray, Collections.reverseOrder()); //sorted in desc
        System.out.println("descending: " + Arrays.toString(intArray));

        /*
        String, Character, Double
         */

        Character [] charArray = {'v', 'b', 'r', 'a', 'c', '5'};
        Arrays.sort(charArray);
        System.out.println("ascending: " + Arrays.toString(charArray));

        Arrays.sort(charArray, Collections.reverseOrder());
        System.out.println("descending: " + Arrays.toString(charArray));

        int [] arr1 = {3,7,9,3,6,8,0};
        sortInt(arr1);
        sortInt(new int [] {3,7,9,3,6,8,0});

        Integer [] intArr1 = {1,2,3,4,57,90,3};
        reverseOrder(intArr1);
        reverseOrder(new Integer[]{3,56,8,9,0});

        String [] strArr1 = {"hi", "bye", "abc", "xyz"};
        sortString(strArr1);
        sortString(new String [] {"a", "hello", "code", "work"});

        reverseStringArr(strArr1);


    }

    public static int [] sortInt(int [] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static Integer [] reverseOrder(Integer [] arr){
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static String [] sortString(String [] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static String [] reverseStringArr(String [] arr){
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
        return arr;
    }


}
