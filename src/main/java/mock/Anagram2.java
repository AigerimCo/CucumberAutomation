package mock;

import java.util.Arrays;
/*
2.	Write a Java program to check if the two strings are anagrams.
 */
public class Anagram2 {
    public static boolean isAnagram(String a, String b){
        a = a.toLowerCase().replaceAll(" ", "");
        b = b.toLowerCase().replaceAll(" ", "");


        char[] arrA = a.toCharArray();
        char[] arrB = b.toCharArray();



        Arrays.sort(arrA);
        Arrays.sort(arrB);


        return Arrays.equals(arrA, arrB);
    }
}
