package arrays;

import java.util.Arrays;

public class ArraysPractice2 {
    public static void main(String[] args) {
        int [] arr1 = {1,2,6,8,9};
        int x = 5;
        System.out.println(containsX(arr1, x)); //false
        System.out.println(containsX2(arr1, x)); //false
        int [] arr2 = {1,2,5, 6,8,9};
        int [] arr3 = {1,2,55, 6,8,9};

        System.out.println(containsX(arr2, x)); //true
        System.out.println(containsX2(arr2, x)); //true

        System.out.println(containsX(arr3, x)); //false
        System.out.println(containsX2(arr3, x)); //true

        String name = "1,2,55,6,8,9";
        String name2 = "5";

        System.out.println(name.contains(name2)); //true


    }

    /*
    which takes array of int and int x,
    if array contains x, return true, else false
     */
    public static boolean containsX(int [] array, int x){
        for (int i = 0; i < array.length; i++){
            if (array[i] == x){
                return true;
            }
        }
        return false;
    }

    public static boolean containsX2(int [] array, int x){
        String str = Arrays.toString(array);

        if(str.contains(x+"")){
            return true;
        }else{
            return false;
        }
    }

}
