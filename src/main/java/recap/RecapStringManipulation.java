package recap;

public class RecapStringManipulation {
    public static void main(String[] args) {
        String str = "Hello World!";

        /*
      indexOf() this method is uses only by String, and it takes one char and returns us the index of the given char.
         */
        int a = str.indexOf('e');
        System.out.println(a);//1

        int b = str.indexOf('b');
        System.out.println(b);//8

        System.out.println(str.indexOf('u')); /////-1 because its not exist
        System.out.println(str.indexOf("World")); // 6

        String country = "Kazakhstan";
        System.out.println(country.indexOf('a')); //1
        System.out.println(country.indexOf('a', 5));//8

        String text = "Hello, hello everyone,hello again";
        System.out.println(text.indexOf("hello")); //7 (2nd hello starts from 7)
        System.out.println(country.indexOf("hello", 10));//3rd hello

        String name = "Aigerim";
        System.out.println(name.indexOf('a')); // -1 ==> cause there no letter a, there letter A
        System.out.println(name.indexOf('A')); //0
        System.out.println(name.indexOf('m'));

        //=================================

        /*
        charAt(),is a method which can be only used by String
        it takes one int - index, and it will return the letter on that index

        indexOf - returns you index of char
        charAt-returns you char of that index
         */


/*
when you give non-existing letter to indexOf, it will just give you -1.
it will not error occur,it will not stop your java

if you give non-existing index to charAt, it will throw error and stop your java
 */

  //      =======================isEmpty

        /*
        isEmpty(), method that can be used only by String, and it will check if your string is empty or not
        if empty ==>return true
        if not empty ==> return false
         */

        String str1 = "hello";
        String str2 = "";

        boolean bb = str2.isEmpty(); //true
        System.out.println(bb);

        System.out.println("hello everyone".isEmpty()); //false
        System.out.println(" ".isEmpty());//false

        /*
        replace(),can only be used y String
        it will replace your old string/char with new one
        it takes 2 chars, and replaces all matching chars with new char
        it takes one string, and replace ...
         */
        String abc = "cucumber";
        String newAbc = abc.replace('c', 'd');
        System.out.println(newAbc);

        String anotherAbc = abc.replace("cu", "bo"); // bobomber
        System.out.println(anotherAbc);

        String banner = "Hello! Nice to meet you!"; // e => 0
        System.out.println(banner.replace('e', 'o'));

        String banner1 = "Hello! Nice to meet you!"; // o => u
        System.out.println(banner.replace('o', 'u'));
    }
}
