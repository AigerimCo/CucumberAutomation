package problemSolving;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeOne {

    public static void main(String[] args) {
       ////#1.
        Scanner in = new Scanner(System.in);
        System.out.println("First number: ");
        double a = in.nextDouble();
        System.out.println("Second number: ");
        double b = in.nextDouble();
        System.out.println("Third number: ");
        double c = in.nextDouble();
        System.out.println("The average value is " + average(a, b, c) + "\n");

        //#2.
 //       System.out.println (Largest(2,50));
    }
    /*
 1.  create public static void method which takes 3 ints, and prints their average as double
  (2+4+8)/3
   */

    public static double average(double a, double b, double c) {

    return(a +b + c)/3;
}
   /*
  2.  create private instance method which takes 2 ints, and returns the largest int
4, 1  => 4
    */
private int largest(int a, int b){
    if(a > b) {
        return a;
    }
        return b;
    }
//private int smallest(int a,int b) {
//    if (a < b) {
//        return a;
//    }
//    return b;

    //ternary solution
    private int smallest(int a,int b){
        return (a < b ? a : b);
    }

    /*
    create default static method which takes array of ints
and prints all elements
and does not return anything
 */
    static void printArray(int [] array) {

        for (int i = 0; i <= array.length; i++) {
            System.out.println(array[i]);
        }
    }
     /*
     create public instance method which takes String array
and prints all values using for each loop
and does not return anything
      */

        public void printStr(String[]array){
            for (String anyName : array) {
                System.out.println(anyName);
            }
        }
    }










    /*
    public instance method1 which takes 2 ints, and returns 1 string
    private instance method2 which takes one string, and doesnt return anything
    protected static method3 which takes no arguments, but returns string
    default static method which takes one string, returns double
     */
    /*
    public String method1(int a,int b){
        return "";
    }

}
     */
