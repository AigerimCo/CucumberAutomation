package wrapperClass;

public class Green {
    public static void main(String[] args) {
        int age = 35;
        char letter = 'S';
        //Wrapper class
        //convert age and letter to Object type. Wrapper class
        //Autoboxing: converting from primitive to object
        Integer i = age;
        System.out.println(i);
        System.out.println(age);

        Character c = letter;
        //unbox both i and c into primitive data types. Create new ones
        //
        char s = c;
        int w = i;
        Boolean b = true;//boolean b=true;
        boolean v = b;

        //      Arrays.toString(aa);=>print all values in that array
        //utility method

        System.out.println(Integer.sum(6, 4));
        System.out.println(Integer.max(45, 23));
        System.out.println(Long.MAX_VALUE);

        char cc = '9';
        System.out.println(Character.isDigit(cc));//true

        char bb = 'l';
        System.out.println(Character.isDigit(bb));//false because its not a number and digit
        System.out.println("Password validation \n");
        validatePassword("James!0");
        getDigits("Hello 2023!");
    }

        /*
        "James2022"
        PSEUDO CODE
        1. declare a method signature
        2.loop for each character of the given string
        3.get each char and check if it is digit
        4.if it finds one digit at least,just break the loop
        5.return true if its finds
        6.return false if it does not find any digit
         */


    public static boolean validatePassword(String password) {

        boolean found = false;
        for (int i = 0; i < password.length(); i++) {
            char letter = password.charAt(i);
            if (Character.isDigit(letter)) {
                found = true;
                break;
            }
        }
        return found;
    }

    /*
    Write a method that picks only numbers from String and converts them to integers. The method
     should accept a string. Check for any digit in the given String. If you find any, keep eliminating
      and build separate strings for digits. In the end, convert it to integer data type and print it out.
    for ex:     Given a String:"Hello 2023!"
                Result: 2023 data type of int

               PSEUDO CODE
            1. declare a method with void and accept string
            2. create a variable for string with empty value for numbers
            3. loop and get each character
            4. check if character is digit
            5. if it is digit then add this to the created string on step 2
            6. finish the loop and convert the string to integer using Integer.parseInt method
            7. print it out
     */
    public static void getDigits(String word) {         // step#1
        String numbers = "";                //step #2
        for (int i = 0; i < word.length(); i++) {        //step #3
            char letter = word.charAt(i);
            if (Character.isDigit(letter)) {           //step#4
                //"2" + "0" = "2023"
                numbers += letter;                //step #5
            }
        }
        int result = Integer.parseInt(numbers);             //step#6
        System.out.println("Numbers: " + result);           //step #7
    }




}

