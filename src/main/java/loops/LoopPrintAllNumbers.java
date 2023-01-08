package loops;

public class LoopPrintAllNumbers {
    public static void main(String[] args) {
        printAllNumbers(45);

        /*
        Create a method that accepts an integer. Print all numbers from zero up to this given number.
        Print out "Please enter the positive number" if the given number is negative
         number is positive if it is more than zero. Its negative if less than zero.

             PSEUDO CODE
        1. Method signature
        2.Check if number is negative or positive using if-else
        3.If number is negative print "invalid.Enter positive number"
        4. If number is positive print all numbers from zero up to this given number
         */
    }
        public static void printAllNumbers(int number) {
            if (number > 0) {
                //print numbers
                for (int i = 0; i <= number; i++) {
                    System.out.println(i);
                     }
            } else {
                //number is negative
                System.out.println("Invalid number. Please try again");
            }
        }

    }

