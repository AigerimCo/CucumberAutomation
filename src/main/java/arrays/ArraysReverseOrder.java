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
        System.out.println("ascending: "+ Arrays.toString(intArray)); //ascending: [0, 1, 2, 3, 5, 6]
        Arrays.sort(intArray, Collections.reverseOrder());
        System.out.println("descending: " + Arrays.toString(intArray));//descending: [6, 5, 3, 2, 1, 0]

        /*
        String, Character, Double
         */

        Character [] charArray = {'v', 'b', 'r', 'a', 'c', '5'};
        Arrays.sort(charArray);
        System.out.println("ascending: " + Arrays.toString(charArray));//ascending: [5, a, b, c, r, v]

        Arrays.sort(charArray, Collections.reverseOrder());
        System.out.println("descending: " + Arrays.toString(charArray));//descending: [v, r, c, b, a, 5]

        int [] arr1 = {3,7,9,3,6,8,0};
        sortInt(arr1);
        sortInt(new int [] {3,7,9,3,6,8,0});//[0, 3, 3, 6, 7, 8, 9]

        Integer [] intArr1 = {1,2,3,4,57,90,3};//[90, 57, 4, 3, 3, 2, 1]
        reverseOrder(intArr1);
        reverseOrder(new Integer[]{3,56,8,9,0});//[56, 9, 8, 3, 0]

        String [] strArr1 = {"hi", "bye", "abc", "xyz"};//[abc, bye, hi, xyz]
        sortString(strArr1);
        sortString(new String [] {"a", "hello", "code", "work"});//[xyz, hi, bye, abc]

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
