package mock;

import java.util.ArrayList;

public class MissingNumbersBena {
    /*
    3.	Given an array of non-duplicating numbers from 1 to n
    where one number is missing, write an efficient java program to find that missing number.
    1 2 4 5 6 7 8 - we need to find ==> 3
     */

    public static int findMissingNumber(int [] arr){
            int number = 0;
            for(int i = 0; i < arr.length;i++){
                if(arr[i] != i){
                    number = i;
                    break;
                }
            }
            return number;
        }

    public static void main(String[] args) {
        int[] arr = new int[]{0,1,2,4,5,6,7,8};
        System.out.println(findMissingNumber(arr));//3
    }

    }


