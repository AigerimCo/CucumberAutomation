package hometasks;

public class StringManipulationHomeWork {
    public static void main(String[] args) {


      String message = "Hello everyone, Let's do Java String exercises";
        int index = 10;

//====== 1. write a program that will create a following output:  ==== y
//======    The character at position 10 is y
        String str1 = "Hello everyone, Let's do Java String exercises";
        char y = str1.charAt(10);
        System.out.println(y);


//===   2. print out the length of the String message ====  the number of letters; 46
        String str2 = "Hello everyone, Let's do Java String exercises";
        System.out.println("the number of letters; " + str2.length());


//=== 3.print out the String message all in uppercase:
 //     HELLO EVERYONE, LET'S DO JAVA STRING EXERCISES
        String str3 = "Hello everyone, Let's do Java String exercises";
        str3 = str3. toUpperCase();
        System.out.println(str3);


 //===  4. print out the String message all in lowercase
  //    hello everyone, let's do java string exercises
        String str4 = "Hello everyone, Let's do Java String exercises";
        str4 = str4. toLowerCase();
        System.out.println(str4);


//===5. print only letter #5  (space)
        String str5 = "Hello everyone, Let's do Java String exercises";
        System.out.println(str5.charAt(5));


 //===6. print only last letter ====== s
        String str6 = "Hello everyone, Let's do Java String exercises";
        System.out.println(str6.charAt(45));


//===7. print first letter in lowercase = h
        String str7 = "Hello everyone, Let's do Java String exercises";
        System.out.println((str7.charAt(0) + "").toLowerCase());


//===8. print last letter in uppercase = S
        String str8 = "Hello everyone, Let's do Java String exercises";
        System.out.println((str8.charAt(45) + "").toUpperCase());;

    }
}

