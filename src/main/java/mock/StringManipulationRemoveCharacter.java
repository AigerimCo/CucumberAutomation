package mock;

public class StringManipulationRemoveCharacter {
    public static void main(String[] args) {
        removeCharFromString('$',"app$le");
        removeCharFromString('!',"app$le");

        System.out.println(removeCharsAndLetters("434ghj@#56"));
        System.out.println(removeCharsAndLetters("0434ghj@#56"));
        System.out.println(removeCharsAndLetters("gfh@@"));

        System.out.println(returnSumOfInts("123ggh78"));
        System.out.println(returnSumOfInts("4566hh7"));
        System.out.println(returnSumOfInts("094566hh7"));
        System.out.println(returnSumOfInts("-84hh"));
    }
    /*
    write a method, which accepts one String, one char
    removes that char(s) from String
    returns String without chars
     */

    public static String removeCharFromString(char ch, String str) {
        System.out.println(str.replace("" + ch,""));
        return str.replace("" + ch,"");
    }

    /*
    which takes one String, removes all special characters and letters
    converts leftover int to int, and it returns it

    apple123 => 123
    134banana22 => 13422
    world0123 => 123

    if 0 is the first number, ignore it

    0434ghj@#56
    temp = "043456"


     */

    public static int removeCharsAndLetters(String number){
        String temp = "";

        for (int i = 0; i < number.length(); i++) {
            if (Character.isDigit(number.charAt(i))) {
                temp += number.charAt(i);
            }
        }

        if(temp.length() == 0){
            System.out.println("Invalid input. No digits found");
            return -1;
        }
        if (temp.charAt(0) == '0') {
            temp = temp.substring(1);
        }

        return Integer.parseInt(temp);
    }


    /*
    which takes one String, removes all special characters and letters
    converts leftover int to int, and returns the sum of all ints

    apple123 => 123 ==> return 6
    134banana?<22 => 1 + 3422 => return 12
    world0123 => 123 => return 6
     */

    public static int returnSumOfInts(String number){
        String temp = "";

        for (int i = 0; i < number.length(); i++) {
            if (Character.isDigit(number.charAt(i))) {
                temp += number.charAt(i);
            }
        }

        if(temp.length() == 0){
            System.out.println("Invalid input. No digits found");
            return -1;
        }

        int sum = 0;

        for (int i = 0; i < temp.length(); i++){
            sum += Integer.parseInt(temp.charAt(i) + "");

        }

        return sum;

    }

}
