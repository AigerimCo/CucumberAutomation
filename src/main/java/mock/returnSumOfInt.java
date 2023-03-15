package mock;

public class returnSumOfInt {

    /*

  return sum of Int,
   which takes one String, removes all special characters and letters
   converts leftover int to int, and it returns it

   apple123 => 123 =>6(1+2+3)
   134banana123=>13422 => return 12 (1+3+4+2+2)
   world0123=>123 =>return 6 (1+2+3=6)

   if 0 is the first number,ignore it
    */
    public static void main(String[] args) {
        System.out.println(returnSumOfInts("123ggh78")); //(1+2+3+7+8)
        System.out.println(returnSumOfInts("4566hh7"));//(4+5+6+6+7)
        System.out.println(returnSumOfInts("094566hh7"));//(0+9+4+5+6+6+7)
        System.out.println(returnSumOfInts("-84hh"));
    }

    public static int returnSumOfInts(String number) {

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
       int sum = 0;
        //354656
        for(int i = 0; i < temp.length(); i++){
            sum += Integer.parseInt(temp.charAt(i) + "");
        }
        return sum;
    }
}
