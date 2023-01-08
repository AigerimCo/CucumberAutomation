package recap;

public class VariablesRecap {
    public static void main(String[] args) {

        /*
        variables is a container for storing data
        primitive data type
        in Java, there are 8 primitive data types
         */
        byte anything = 22; // -128o 127
        byte anything2 = 127; //variable declaration
        //you cannot have 2 variables with same name

        anything = -128;
        System.out.println(anything);

        ////////short
        /*short is a variable type that stores numbers from -32,768 to 32,767

         */

        short number = 899;
        number = 32767;
        System.out.println(number);

        /*
        int - integer, is a variables that stores numbers from -2 bil to 2 bil
         */

        int iphone = 1000;
        int samsung = 2000;

        // = is assignment operator, it takes value from right side and puts it into left side
        iphone = samsung;
        iphone = 1500;

        System.out.println(iphone);

        /*
        long is a variable type that stores numbers very long numbers
         */
        long distance = 123241423654l;
        distance = iphone;

        /*
        float and double are variables that stores fractional numbers(drobnye) = 89.5
        double is bigger than float
        double can store up to 15 decimal
        while float can store up to 7 decimal
         */

        float priceOfBread = 2.99f;
        double priceOfAvocado = 1.99;

        priceOfAvocado = priceOfBread;
        System.out.println(priceOfAvocado);

        /*
        boolean os a variable that stores either true or false
/
         */
        boolean isTrue = false;
        int a = 1;
        int b = 3;
//        data         type name = value
        boolean isTrueName =
                isTrue = 1 < 3;
        isTrue = 10 > 2000;
        System.out.println(isTrue);

        /*
        char - is a variable that stores one character, any letter uppercase, lowercase, numbers,
         special characters and you need to put char in single quotes
         */

        char ch = 'r';
        ch = '2';
        ch = '?';
        ch = 'd';

        System.out.println(ch);

         /*
         String is a non-primitive data type
          it is  sequence of character (no limits), surrounded by double quotes;
          */

        String name = "provide any text here. Even 2324242";
        System.out.println(name);
        System.out.println(true);
        System.out.println('a');
        System.out.println(45.77);
        System.out.println("this is my string!!!");

        //variable declaration
        String myName = "Benazir";

        String firstName = "Bena";
        String lastName = "Baialieva";
        String fullName = firstName + " " + lastName;
        System.out.println(firstName + lastName);

        int age = 26;

        System.out.println("Hello! My name is " + fullName);
        System.out.println("I am " + age + "  + years old!");
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(6);
        System.out.println(7);
        System.out.println(8);
        System.out.println(9);
        System.out.println(10);
        System.out.println(11);
        System.out.println(12);
        System.out.println(13);
        System.out.println(14);
        System.out.println(15);
        System.out.println(16);
        System.out.println(17);
        System.out.println(18);
        System.out.println(19);
        System.out.println(20);
    }

}


