package mock;

import java.util.Arrays;

public class ArrayProblems {

    /*
  Array is a collection of similar types of data
    fixed size,
    it can store both objects and primitives
     */
    /*
    create a void method which takes int [] arr,and
    prints the largest and the smallest numbers

    int [] arr = 1,2,5,6,19,10,

    array.sort: int [] array = {4,3,2,1,0,9}===>{0,1,2,3,4,9}

    Largest:43
    Smallest:1

    1.sort array
    print last element of array as Largest
    print first element of array as Smallest
   */
    public static void main(String[] args) {
        int [] array1 = {4,3,6,1,0,9};
        int [] array2 = {1231423,56789,12566,4123};
        int [] array3 = {-6,-2,-5,-45};

        getLargestAndSmallest1(array1);
        getLargestAndSmallest1(array2);
        getLargestAndSmallest1(array3);

        getLargestAndSmallest2(array1);
        getLargestAndSmallest2(array2);
        getLargestAndSmallest2(array3);

        getLargestAndSmallest3(array1);
        getLargestAndSmallest3(array2);
        getLargestAndSmallest3(array3);

    }

    public static void  getLargestAndSmallest1(int [] array) {
    Arrays.sort(array);//BY SORTING METHOD
        System.out.println("Largest: "  + array[array.length-1]);
        System.out.println("Smallest: " + array [0]);
    }
    public static void getLargestAndSmallest2(int [] array) {
        //VIA WRAPPER CLASS WITHOUT SORTING METHOD through FOR EACH LOOP
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i : array) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        System.out.println("Max value from array is: " + max);
        System.out.println(("Min value from array is : " + min));

    }
    public static void getLargestAndSmallest3(int [] array) {
        //by creating integer through for loop
        int smallest = array[0];
        int largest = array [0];

        for(int i = 0; i < array.length; i++){
            if(array[i] > largest)
                largest = array[i];

            else if(array[i] < smallest)
                smallest = array[i];
        }
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
    }
    }
