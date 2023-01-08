package ifElseLogicalOperators;

public class ifElseCondition {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;

        if (a > b) {
            System.out.println(a + "is more than " + b);
        } else {
            System.out.println(a + "is not more than " + b);

        }

        if (a == b) {
            System.out.println("a is equal to b");
        } else {

            System.out.println("a is not equal to b");
        }
        //======================
/*
if, else if condition
if(true) --> code executed
else if() --> code will be ignored
else{} --> code will be ignored
 */

        short sh1 = 32;
        short sh2 = -32;

        if (sh1 > sh2) {
            System.out.println("sh1 is more than " + b);
        } else if (sh1 == sh2) {
            System.out.println("sh1 is equal to sh2");
        } else {
            System.out.println("sh1 is less than sh2");
        }

        String welcomeSign = "Welcome to California!";
        String stateName = "California";
        boolean bb = welcomeSign.contains(stateName); // true

        if (bb) {
            System.out.println(welcomeSign + " contains " + stateName);
        } else if (!welcomeSign.contains(stateName)) {
        }
        System.out.println("welcome sign does not containstatename");
    }
}














