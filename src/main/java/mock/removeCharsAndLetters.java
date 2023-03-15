package mock;

public class removeCharsAndLetters {
    /*
    which takes one String, removes all special characters and letters
    converts leftover int to int, and it returns it

    apple123 => 123
    134banana123=>13422
    world0123=>123

    if 0 is the first number,ignore it
     */
    public static void main(String[] args) {
        System.out.println(removeCharsAndLetters("434fg$#56"));
        System.out.println(removeCharsAndLetters("43%%&77"));
        System.out.println(removeCharsAndLetters("4*(*)@785"));
    }
    public static int removeCharsAndLetters(String number) {

        String temp = "";
        for (int i = 0; i < number.length(); i++) {
            if (Character.isDigit(number.charAt(i))) {
                temp += number.charAt(i);
            }
        }
        if (temp.length() == 0) {
            System.out.println("Invalid input. No digits found");
            return -1;
        }
        if (temp.charAt(0) == '0') {
            temp = temp.substring(1);
        }
        return Integer.parseInt(temp);

    }
}
