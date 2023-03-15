package mock;

import org.w3c.dom.ls.LSOutput;

public class ReverseString {


    //  6.	Write a Java program to reverse String

   public static void main(String[] args) {
        System.out.println(reverse("Hello"));
    }

    public static String reverse(String str) {

        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        System.out.println(reverse);
        return reverse;
    }

}

