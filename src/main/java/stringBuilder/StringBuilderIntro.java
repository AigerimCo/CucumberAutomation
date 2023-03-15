package stringBuilder;

import java.util.Arrays;

public class StringBuilderIntro {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(50);
        StringBuilder sb3 = new StringBuilder("hello");

        CharSequence charSequence = "codewise";
        StringBuilder sb4 = new StringBuilder(charSequence);

        // ======================================

        /*
        append will add any data type to existing stringbuilder
         */

        StringBuilder fullName = new StringBuilder();

        String firstName = "John";
        String lastName = "Doe";
        String middleName = "Shawn";

        fullName.append(firstName + " " + lastName);
        System.out.println(fullName);

        fullName.append(middleName);
        System.out.println(fullName);

        fullName.append(lastName).append(30);
        System.out.println(fullName);

        /*
        insert()
         */

        StringBuilder address = new StringBuilder("123 Abc street");
        address.insert(4, "North ");
        System.out.println(address);

        address.insert(address.length(), 12345);
        System.out.println(address);

        address.insert(address.length() - 5, " ");
        System.out.println(address);
        //123 North Abc street 12345
        //123 North Abc street 12345 Illinois
        //123 North Abc street 12345, Illinois
        //123 North Abc street, 12345, Illinois
        //123 North Abc street, 12345, Illinois, USA

        String state = " Illinois";
        address.insert(address.length(), state);
        address.insert(address.length() - state.length(), ", ");
        System.out.println(address);

        String country = "USA";

        address.append(country);
        System.out.println(address);

        address.insert(address.length() - country.length(), ", ");
        System.out.println(address);

        address.replace(0, 3, "456");
        System.out.println(address);

        address.replace(10, 13, "Xyz");
        System.out.println(address);

        String str = "hello codewise";
        str = str.replace("hello", "bye-bye");
        System.out.println(str);

        // delete North
        address.delete(4, 10);
        System.out.println(address);

        //South Xyz
        address.insert(4, "South ");
        System.out.println(address);

        address.reverse();
        System.out.println(address);

        String str2 = "Benazir";
        StringBuilder strRev = new StringBuilder(str2);
        System.out.println(strRev.reverse());

        System.out.println(address.length());
        address.reverse();
        System.out.println(address);

        /*
        using substring method:
        turn
        456 South Xyz street 12345,  Illinois, USA
        to
        456 South Xyz street
        to
        South Xyz street
         */

        address = new StringBuilder(address.substring(0, 20));
        System.out.println(address);

        address = new StringBuilder(address.substring(4));
        System.out.println(address);

//
        /*
        substring(int beginIndex)
        str = hello abc
        str.substring(3) ===> lo abc

        substring(int beginIndex, int endIndex)
        str = chicago is windy city
        str.substring(0, 5) ==>  chica
         */

        /*
        substring method can be used by StringBuilder, but it will return String
         */


        int index = address.indexOf("X");
        System.out.println(index);

        String string1 = "hooerello";
        StringBuilder stringBuilder1 = new StringBuilder("  hello everyone, happy  Wednesday  ");

        System.out.println(string1.indexOf("lo"));
        System.out.println(string1.indexOf("o", 3));

        System.out.println(stringBuilder1.indexOf("e", 10));

        System.out.println(stringBuilder1.lastIndexOf("happy"));

        System.out.println(stringBuilder1.length());

        stringBuilder1.trimToSize();

        System.out.println(stringBuilder1.length());

        StringBuilder name = new StringBuilder("London is             ");
        System.out.println(name.length());

        stringBuilder1.trimToSize();

        System.out.println(name.length());

        /*
        Problem:
        Create a program that takes in a sentence from the user
        and reverses the order of the words using StringBuilder.

        Example:
        Input: "Hello World!"
        Output: "World! Hello"
         */

        StringBuilder problem1 = new StringBuilder("Hello World!");
        problem1 = new StringBuilder(
                problem1.toString().split(" ")[1] + " " + problem1.toString().split(" ")[0]);
        System.out.println(problem1);

        String products = "apple, banana, strawberry, chicken, avocado";

        String[] array = products.split(", ");
        System.out.println(Arrays.toString(array));
        String[] array2 = products.split("a");
        System.out.println(Arrays.toString(array2));

        String toDo = "clean house=wash dishes=cook dinner=take out trash";
        String[] array3 = toDo.split("=");
        System.out.println(Arrays.toString(array3));

        StringBuilder prob2 = new StringBuilder("USA Mexico Canada");
        //Canada USA Mexico

        prob2 = new StringBuilder(prob2.toString().split(" ")[2] + " " + prob2.toString().split(" ")[0]
                + " " + prob2.toString().split(" ")[1]);
        System.out.println(prob2);


    /*
    write a program that takes ina sentence (string) and reverses the order of the words in the sentence.

    For example, if the input is
    "The quick brown fox jumps over the lazy dog", the output should be "dog lazy the over
    jumps fox brown quick The".

    create stringbuilder
    convert it to string
    split (" ")==> array of strings
    loop array from end to begin
    append elements to new stringbuilder
     */
        StringBuilder problem3 = new StringBuilder("The quick brown fox jumps over the lazy dog");
        String strB = problem3.toString();
        String[] arrB = strB.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = arrB.length - 1; i >= 0; i--) {
            result.append(arrB[i] + " ");
        }
        System.out.println(result);

        System.out.println(" empty ");

        String [] rev = problem3.toString().split(" ");
        StringBuilder revv = new StringBuilder("");
        for(int i = rev.length-1;i >=0;i--){
            revv.append(rev[i]+" ");
        }
        System.out.println(revv);

        System.gc();//calling garbage collector but it`s not guaranteed (static method)
       Runtime.getRuntime().gc(); // same thing- (instance method)
    }

}