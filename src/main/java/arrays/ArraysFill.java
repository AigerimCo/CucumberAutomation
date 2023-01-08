package arrays;

import java.util.Arrays;

public class ArraysFill {
    public static void main (String[] args) {
        String [] strArr = new String[10];
        System.out.println(strArr[2]); // null

        Arrays.fill(strArr, "code");
        System.out.println(strArr[2]); //code

        double [] doubleArr = new double[5];
        Arrays.fill(doubleArr,99.99);
        System.out.println(Arrays.toString(doubleArr));
    }

}
