package ifElseLogicalOperators;

public class NestedIfElse {

     /*
     You are driving a little too fast, and a police officer stops you.
    Write code to compute the result, encoded as an int value:
    0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0.
     If speed is between 61 and 80 inclusive, the result is 1.
     If speed is 81 or more, the result is 2.
     Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
     */

    public static void speeding(int speed, boolean isBirthday) {
        if (!isBirthday) {

            if (speed > 60 && speed <= 80) {
                System.out.println("You get small ticket");
            } else if (speed > 80) {
                System.out.println("You get big ticket");
            }
        } else {
            System.out.println("No ticket");
        }
    }

    public static void main(String[] args) {

        speeding(90, true);
        speeding(81, false);
        speeding(60, false);
    }

    /*
    Given 3 ints, a b c, return true if it is possible to add two of the ints to get the third.
    twoAsOne(1, 2, 3) -> true
    twoAsOne (3, 1, 2) -> true
    twoAsOne (3, 2, 2) -> false
     */
    public static boolean twoAsOne(int a, int b, int c) {
        if (a + b == c || a + c == b || c + b == a) {
            return true;
        } else {
            return false;
        }
    }
    /*
    When squirrels get together for a party, they like to have cigars. A squirrel party is successful
     when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend,
     in which case there is no upper bound on the number of cigars.
     Return true if the party with the given values is successful, or false otherwise.

cigarParty(30, false) → false
cigarParty(50, false) → true
cigarParty(70, true) → true
     */

    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend) {
            if (cigars >= 40) {
                System.out.println("The party was successful on weekend");
                return true;
            } else {
                System.out.println("The party failed on weekend");
                return false;
            }
        } else {
            if (cigars >= 40 && cigars <= 60) {
                System.out.println("Party was successful on weekday");
                return true;
            } else {
                System.out.println("Party failed on weekday");
                return false;
            }
        }
    }


}






