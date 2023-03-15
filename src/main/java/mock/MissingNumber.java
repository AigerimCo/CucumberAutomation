package mock;

public class MissingNumber {
    /*
    3.	Given an array of non-duplicating numbers from 1 to n where one number is missing,
    write an efficient java program to find that missing number.
    int[] arr1 = new int[]{1,2,3,5,6,7}
    int[]arr2 = new int[]{23,24,25,27,28}
     */

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,6,7,8};
        System.out.println(findMisNumber(arr));

        int[]arr1 = new int[]{23,24,25,27,28};
        System.out.println(findMisNumber(arr1));

    }

    public static int findMisNumber(int[] arr){
        int number = 0;
        for(int i = 0; i < arr.length;i++){
            if(arr[i] != i + 1){
                number = i + 1;
                break;
            }
        }
        return number;
    }



    public static int findMisNumber2(int[] arr ){
        int firstElement = arr[0];//23
        int number = 0;
        for(int i = 0; i < arr.length; i++) {
            if (firstElement != arr[i]) {
                number = firstElement;
                break;
            }
            firstElement++;
        }
                return number;
            }

        }

