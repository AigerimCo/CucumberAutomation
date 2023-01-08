package operators;

public class ifElseRecap {

    /*You are driving a little too fast, and a police officer stops you.
    Write code to compute the result, encoded as an int value:
    0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0.
     If speed is between 61 and 80 inclusive, the result is 1.
     If speed is 81 or more, the result is 2.
     Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
     */

    public static void caughtSpeeding(int speed, boolean isBirthday) {
        //if-else, && ||
        int result = 0;

        if (speed <= 60) {
            result = 0;
            System.out.println("no ticket");
        } else if (speed > 60 && speed <= 80 && !isBirthday) {
            result = 1;
            System.out.println("you get small ticket");
        } else if (speed > 60 && speed <= 80 && isBirthday) {
            ;
            System.out.println("since it's birthday, no ticket");
        } else if (speed > 80 && !isBirthday) {
            System.out.println("you get big ticket");
        } else if (speed > 80 && isBirthday) {
            System.out.println("You are lucky, no big ticket since its your birthday");
        }
    }


    public static void main(String[] args) {
        caughtSpeeding(59, true);
        caughtSpeeding(70, false);
        caughtSpeeding(90, true);
        caughtSpeeding(81, true);

        System.out.println(love6(1, 4));
        System.out.println(love6(3, 3));
        System.out.println(love6(6, 0));


    }

    /*
    The number 6 is a truly great number. Given two int values, a and b, return true
     if either one is 6. Or if their sum is 6.
     love6(6,4) -> true
     love6(4,5) -> false
     love6(1,5) -> true

     */

    public static boolean love6(int a, int b){
    if(a == 6 || b ==6 || a + b == 6){
        return true;
    }else{
        return false;
    }

}
}

