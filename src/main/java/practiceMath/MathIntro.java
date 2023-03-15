package practiceMath;

import org.w3c.dom.ls.LSOutput;

public class MathIntro {
    public static void main(String[] args) {
        System.out.println(calculateCircleArea(5));// 78.53981633974483
        System.out.println(calculateSquareRoot(16));//4.0

        int a = 10;
        int b = 20;
        System.out.println(Math.max(a,b));
        System.out.println((Math.min(a,b)));

        System.out.println(Integer.MAX_VALUE);

        double d = 12.3456;
//        d = Math.round(d);
        System.out.println(Math.round(d));//13
        System.out.println(Math.floor(d));//12.0
        System.out.println(Math.ceil(d));//13
    }

    /*
          create a program that calculates the area of a circle given the radius.
           The formula for the area of a circle is PI^2
           */
    private static double calculateCircleArea(double radius) {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }
/*
create a program that calculates the square root of a given number using the Math.sqrt()method.
 */
    public static double calculateSquareRoot(double number) {
        double area2 = Math.sqrt(number);
        return area2;
    }
}





