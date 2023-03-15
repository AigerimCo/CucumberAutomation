package mock;

public class FindLargestNumber {
    public static void main(String[] args) {
        System.out.println(findLargest(20, 67, 56));
        System.out.println(findLargest(-1000, 0, 12));
        System.out.println(findLargest(54, 67, 54));
        System.out.println(findLargest(10, 11, 45));
    }

        /*
        Write a Java program to find the largest of three numbers. use IF-ELSE
        condition only
         */

        public static int findLargest(int a, int b, int c){
            if (a > b && a > c) {
                return a;
            }
            else if (b > a && b > c){
                return b;
            }
            return c;
        }
    /*
write a method which takes 3 ints and returns the smallest one
*/
    public static int findSmallest(int a, int b, int c){
        if (a <b && a < c ){
            return a;
        }
        else if (b < a && b < c) {
            return b;
        }
        return c;
    }

    /*
    write a method, which takes one int
    and prints positive, negative, zero
     */
    public static void checkNumber(int number){
        if (number > 0){
            System.out.println("Positive");
        } else if (number < 0){
            System.out.println("Negative");
        }else {
            System.out.println("Zero");
        }
    }

}

