package problemSolving;

import java.util.Arrays;

public class MergeToArrays {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10, 11, 12, 13, 20, 24, 14};

        int[] arr3 = mergeToIntArrays(arr1, arr2);
        System.out.println(Arrays.toString(arr3));

    }

    /*
    merge values from two given arrays and return them as one array
    1,2,3,4
    5,6,7,8,9,10
    ==> 1,2,3,4,5,6,7,8,9,10
     */


    public static int[] mergeToIntArrays(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];

        }

        int k = 0;
        for (int j = a.length; j > c.length; j++) {
            c[j] = b[k];
            k++;
        }
        return c;
    }


    }





