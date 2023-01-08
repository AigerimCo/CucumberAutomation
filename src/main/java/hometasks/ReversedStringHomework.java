package hometasks;

import static problemSolving.ReverseString.reverse;

public class ReversedStringHomework {
    public static void main(String[] args) {

       /*
       Create below method, that will take String str, and returns reversed string.
       public static String reverseString(String str){
       codewise  ==> esiwedoc
       mama  ==> amam
       hello ==> olleh
        */

        reverse("codewise");
        reverse("mama");
        reverse("hello");
    }

    public static String reverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }
        System.out.println(reversed);
        return reversed;
    }


    public static String reverse1(String str) {
        String reversed = "";
        for (int a = str.length() - 1; a >= 0; a--){
            reversed = reversed + str.charAt(a);
        }
        System.out.println(reversed);
        return reversed;
    }
    public static String reverse2(String str){
        String reversed ="";
        for(int b = str.length()-1; b >= 0; b--){
            reversed=reversed + str.charAt(b);
        }
        System.out.println(reversed);
        return reversed;
    }
}



