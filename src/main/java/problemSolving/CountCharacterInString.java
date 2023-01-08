package problemSolving;

public class CountCharacterInString {
    /*
    create a method that takes one String, and one char
    it return us the  number of times when char occurs in the String
    mama, a => 2
    colorado, 0 => 3
    codewise, w => 1
    ohio, a => 0
     */
    public static void main(String[] args) {
        countCharInString("mama", 'a');
        countCharInString("colorado", 'o');
        countCharInString("code", 'b');


    }


    public static int countCharInString(String str, char letter) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) {
                count++;
            }
        }
        System.out.println(count);
        return count;

    }


}


