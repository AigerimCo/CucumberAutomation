package mock;
/*
2.	Write a Java program to check if the two strings are anagrams.
 */
import java.util.Arrays;

import java.util.Locale;
public class Anagram{

    public static void main(String[] args) {
        String cv = "aaabbc   11";
        String cb = "11   cbbaaa";

        String bb = "a gentleman", cc = "e legantman";

        System.out.println(isAnagram2(cc, bb));
    }
    public static boolean isAnagram(String word1, String word2){

        word1 = word1.replace(" ", "").toLowerCase();
        word2 = word2.replace(" ", "").toLowerCase();

        if (word1.length() == word2.length()) {

            char[] arr1 = word1.toCharArray();
            char[] arr2 = word2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if (Arrays.equals(arr1, arr2)) {
                return true;
            }
        }
        return false;
        }

public static boolean isAnagram2(String a, String b){
        a = a.toLowerCase().replace(" ", "");
        b = b.toLowerCase().replace(" ", "");

        char[] arrA = a.toCharArray(); // man -> ['m', 'a', 'n']
        char[] arrB = b.toCharArray();

        Arrays.sort(arrA);
        Arrays.sort(arrB);

        String resultA = "";
        String resultB = "";

        for(int i = 0; i < arrA.length; i++){
        resultA += arrA[i];
        }
        System.out.println(resultA);

        for(int i = 0; i < arrB.length; i++){
        resultB += arrB[i];
        }
        System.out.println(resultB);

        if(resultA.equals(resultB)){
        return true;

        }else{

        return false;
        }
        }

}

/*
public static boolean isAnagram(String a, String b){
    a = a.toLowerCase().replace(" ", "");
    b = b.toLowerCase().replace(" ", "");

    char[] arrA = a.toCharArray(); // man -> ['m', 'a', 'n']
    char[] arrB = b.toCharArray();

    Arrays.sort(arrA);
    Arrays.sort(arrB);

    String resultA = "";
    String resultB = "";

    for(int i = 0; i < arrA.length; i++){
        resultA += arrA[i];
    }
    System.out.println(resultA);

    for(int i = 0; i < arrB.length; i++){
        resultB += arrB[i];
    }
    System.out.println(resultB);

    if(resultA.equals(resultB)){
        return true;
    }else{
        return false;
    }
}
 */