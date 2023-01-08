package dataTypes;

public class Variables {

    public static void main (String [] args) {

        System.out.println("My name is Aigerim");

        // byte can store values from -128 to 127
        byte a = 12;
        System.out.println(a);


        byte b = 127;

        System.out.println("first value of b: " + b);

        b = 23;

        System.out.println(b);

        byte c = -128;

        // --------------SHORTS----------//
        // -32768 to 32767

        short youngAge = 18;
        System.out.println("my age is " + youngAge);
        youngAge = -32768;

        youngAge = 125;

        System.out.println("new age is " + youngAge);

        // ---------int--------
        // from -2,147,483,648 to 2,147,483,647

        int transactionID = 241345151;
        System.out.println("transaction ID is: " + transactionID);

        transactionID = 11111111;

        int bankAccount = 111222;

        System.out.println("New transaction ID" + transactionID);
        System.out.println("My bank account number: " + bankAccount);

        bankAccount = 123456;

        //-------float-------

        float degreeCelcius = 35222222222222222222222222222222222222.63333333333333333333333333333333333333333333f;

        double degreeFah = 101.8;

        //------boolean-------//

        boolean isLegal = true;

        System.out.println(isLegal);

        isLegal = false;
        isLegal = true;

        boolean isYoung;
        isYoung = false;

        System.out.println(isLegal);
        System.out.println(isYoung);

        isYoung = true;
        isLegal = false;

        System.out.println("What will be here?" + isYoung);


        //-------------char-----------

        char letter = 'a';
        char digit = '3';
        char specCharacter = '?';

        letter = 'A';

        System.out.println(letter + digit + specCharacter);
        System.out.println("Char values " + letter + digit + specCharacter);

//---------------------String - the most common data type ----------------

        String name = "Codewise 2022 Batch 1! @codewiseacademy";

        System.out.println(name);

        String firstName = "Aigerim";
        String lastName = "Corindan";

        System.out.println(firstName + " " + lastName);

        int age = 30;

        System.out.println("Hello my name is " + firstName + " " + lastName + ". I am " + age + "years old.");

        String cityFrom = "Destin";

        System.out.println("Hello my name is " + firstName + " " + lastName + ". I am from" + " " + "Destin");

        byte myByte = 12;
        int myInt = 23;
        double myDouble = 8989;

        String myName = "Aigerim";
        String myCity = "Destin";

        System.out.println("Hi" + " " + myName + " " + "Here is my byte" + myByte + " " + "and here is my integer" + myInt);
        System.out.println(12 + 23);

     byte dan = 15;
     System.out.println("first value of dan: " + dan);




    }

    public static class VariablesHomeWork {
        public static void main (String [] args) {

            byte idea = 70;
            System.out.println(idea);
            byte idea2 = -110;
            System.out.println(idea2);

            short size = 1200;
            System.out.println(size);
            size = -30566;
            System.out.println(size);

            int LG = 30500;
            int Toshiba = 10500;
            System.out.println(Toshiba);

            float x = 33.3f;
            System.out.println(x);

            double y = 33.3333333333333333;
            System.out.println(y);

            boolean isCheap = true;
            int Nike = 50;
            int Adidas = 70;
            isCheap = 70 > 50;
            System.out.println(isCheap);

            char number = '5';
            System.out.println(number);


            String myName = "Aigerim";
            String firstName = "Aigerim";
            String lastName = "Corindan";
            String fullName = firstName + " " + lastName;
            System.out.println(firstName + lastName);


            boolean isGood = true;
            int A = 65;
            int B = 55;
            isGood = 65 > 55;
            System.out.println(isGood);
            isGood = 65 < 55;
            System.out.println(isGood);

            byte b = 100;
            System.out.println("byte Value is " +b);

            short s = 123;
            System.out.println("short Value is " +s);

            int v = 123543;
            System.out.println("int Value is " +v);

            int calc = -9876345;
            System.out.println("int Value is " +calc);

            long amountVal = 1234567891;
            System.out.println("long Value is " +amountVal);

            float interestRate = 12.25f;
            System.out.println("float Value is " +interestRate);

            double sineVal = 12345.234d;
            System.out.println("double Value is " +sineVal);

            boolean flag = true;
            System.out.println("boolean Value is " +flag);

            boolean val = false;
            System.out.println("boolean Value is " +val);

            char ch1 = 88;
            System.out.println("char Value is " +ch1);

            char ch2 = 'Y';
            System.out.println("char Value is " +ch2);


        }

    }
}

