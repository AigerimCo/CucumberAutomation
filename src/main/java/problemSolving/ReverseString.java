package problemSolving;

public class ReverseString {
    public static void main(String[] args) {


    /*
    create a method, that takes one String
    and returns reversed String
    hello ==> olleh
     */

        reverse("Hello everyone!");
    }


    public static String reverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }
        System.out.println(reversed);
        return reversed;
    }
}


