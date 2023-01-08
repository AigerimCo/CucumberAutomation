package stringManipulation;

public class CharAt {
    public static void main(String[] args) {

        /*CharAt() method that returns int
        it belongs to String class,  and can only be used by String
        It will return us the char of a index
         */


        String name = "Angelina";
        /*
        A = 0
        n = 1
        g = 2
        e = 3
        etc
         */

        char a = name.charAt(3); //return e
        System.out.println(a);


        // ==============length () returns number of characters in the string
        //returns int and be only used by  String
        //is the only method that starts from 1

        String text = "Hello everyone! Hope you are doing well. " +
                "I wish you all good luck and at least 120k salary";

        System.out.println("the number of letters; " + text.length());

        String message = "Hello everyone, Let's do Java String exercises";
        System.out.println("the number of letters; " + text.length());

        String country = " USA";
        System.out.println(country + " has " + country.length() + " letters");
        //USA has 4 letters(it has 1 space before USA)

        country = "Mexico";
        System.out.println(country + " has " + country.length() + " letters"); //Mexico has 6 letters

        country = "Kyrgyzstan";
        System.out.println(country + " has " + country.length() + " letters");// Kyrgyzstan has 10 letters
        System.out.println(country.charAt(0)); //K - because it starts counting 0 from first letter(charAt)

        System.out.println(country.charAt(9)); // n - because charAt starts from 0 and letter 9 will be n

        String school = "Harvard";
        String anotherSchool = "Stanford"; // 8 letters

        System.out.println(school.charAt(0)); //H

        System.out.println(anotherSchool + "'s last letter is: " + anotherSchool.charAt(anotherSchool.length() - 1));



                /*
                length () returns int = length of String = number of letters
                charAt (int a) takes int value, and returns char

                m = 0
                a = 1
                m = 2
                a = 3

                mama.length () = 4

                charAt (2) = m

                 */

        String cheers = "gdfugksfbkihfilehkewjgwekhekfbejk";
        System.out.println(cheers + "'s last letter is " + cheers.charAt(cheers.length() - 1));


String title = "Table";
char ch = title.charAt(0);
char end = title.charAt(title.length()-1);//this code is finding last letter which is e
        System.out.println();

    }
}