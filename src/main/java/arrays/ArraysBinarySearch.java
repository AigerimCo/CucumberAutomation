package arrays;

import java.util.Arrays;

public class ArraysBinarySearch {
    public static void main(String[] args){
        String [] strArr = {"Chicago", "LA","San-Francisco", "New York"};
        int index = Arrays.binarySearch(strArr, "LA");
        System.out.println(index); //1

        System.out.println(Arrays.binarySearch(strArr, "Chicago"));//0
    }
}
