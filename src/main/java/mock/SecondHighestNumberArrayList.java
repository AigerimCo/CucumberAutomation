package mock;

import java.util.ArrayList;
import java.util.Arrays;

public class SecondHighestNumberArrayList {

    //8.	 Write a program to find the Second Highest number in an ArrayListTest
    public static void main(String[] args) {

    }
    public static int secondHighest(ArrayList<Integer> arrList){
       int[]arr = new int[arrList.size()];
       int index = 0;
       for(int i : arrList){
           arr[index]=i;
           index++;
       }
       Arrays.sort(arr);
       return arr[arr.length - 2];
    }
}
