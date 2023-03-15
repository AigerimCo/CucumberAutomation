package ternaryOperator;

import java.util.Scanner;
public class TernaryOperatorIntro {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        int c = 0;

        c = a < b ? a : b;//20
        c = a == b ? 1 : 2; //2

        if (a < b) {
            c = a;
        } else {
            c = b;
        }


        int x = 100;
        int y = -100;
        int z;

        if (x > y) {
            z = y;
        } else {
            z = x;
        }
        z = x > y ? y : x;


        if (200 + 300 > 1000 - 600) {
            z = 100;
        } else {
            z = 0;

            z = 200 + 300 > 1000 - 600 ? 100 : 0;


            String str1 = "hello";
            String str2;

            if (str1.length() > 1) {
                str2 = str1;
            } else {
                str2 = null;
            }
            str2 = str1.length() > 1 ? str1 : null;


            int num = 8;
            String msg = "";
            if (num > 10) {
                msg = "Number is greater that 10";
            } else {
                msg = "Number is less than or equal to 10";
            }

            msg = num > 10 ? "Number is greater than 10" : "Number is less than or equal to 10";
        }

//lambda-check description

        /*
        write a program that takes in a number and uses a ternary operator to determine if the number is even or odd.
        If the number is even, assign "even" to String, if the number is odd,assign "odd" to String. Then print it.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int j = scan.nextInt();
        String is = "";
        is = j % 2 == 0 ? "even" : "odd";
        System.out.println(j + " is " + is);

    }

    public static void printOddOrEven(int number) {
        String s1 = "";
        s1 = (number % 2 == 0) ? "even" : "odd";
    }

    public static void printIfEvenOdd(int a) {
        String even;
        System.out.println(a % 2 == 0 ? "even" : "odd");
    }


    //str length > 10,return true, return false
    public static boolean isLongWordBoolean(String str) {
        return str.length() > 10 ? true : false;

    }

    //if isLongWordBoolean(is true, return "Long", else return "Short".)
    public static String isLongWord(String str) {
        return isLongWordBoolean(str) ? "Long" : "Short";

    }


/*
write a program that takes in a character and uses a ternary operator to determine
if the character is a vowel or a consonant . if the character is a vowel,program should print "vowel", if character
is consonant,the program should print "consonant".
 */

   public static String vowelOrConsonant(char  character) {
       return character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' ?
               "vowel" : "consonant";
   }

   /*
   write a program that takes in grade and uses a ternary operator to determine if the grade is passing or falling.
   If the grade is greater than or equal to 50, the program should print "Passing",
   if the grade is less than 50, the program should print "Failing"
    */
   public static String grades(int integer){
       return integer > 50 ? "Passing" : "Failing";
   }

   /*
   write a program that takes in a number and uses a ternary operator to determine if the number is positive
  ,negative or zero.If the number is greater than 0, the program should print "positive",
  if the  number is less than 0,the  program should print "zero"
    */
public static void positiveOrNegative (int x){
       String state = "Zero";
       if(x != 0) state = x > 0 ? "positive" : "negative";
    System.out.println(state);

}
        }

