package arrays;

import java.util.Arrays;

public class CountEvenOdd {
    public static void main(String[] args) {
        /*
        Coding challenge array!
1. Write a program that counts how many even numbers and how many odd numbers in the array.
Create an array of integers and store number; 34, 3, 67,635,234,678,9,6,8,56,233,777
Then write a program that counts evens and odds and print in the end
"Even numbers:
"Odd numbers:"

2. Once you finish this code, continue second part
double that number if it is even and store it back to same index
triple the number if it is odd and store it back to same index
It the end print is using toString() method
         */

        int[] numArr = {34, 3, 67, 635, 234, 678, 9, 6, 8, 56, 233, 777};

        int countEven = 0;
        int countOdd = 0;

        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] % 2 == 0) {
                countEven++;
                numArr[i] = numArr[i] * 2;
            } else {
                countOdd++;
                numArr[i] = numArr[i] * 3;
            }
        }
        System.out.println(Arrays.toString(numArr));
        System.out.println("Even numbers: " + countEven);
        System.out.println("Odd numbers: " + countOdd);
    }
}
