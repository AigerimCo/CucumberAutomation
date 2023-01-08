package methodOverloading;

public class OverLoadedCalculator {
    /*
    create:
    3 addition methods: 2 int params, 3 int params, 2 doubles
    3 subtraction methods:2 int params, 3 int params, 2 doubles
    3 multiplication methods:2 int params, 3 int params, 2 doubles
    3 division methods :2 int params, 3 int params, 2 doubles

    return type is double for all 12 methods
     */
    public static double addition(int a, int b) {
        return a + b;
    }

    public static double addition(int a, int b, int c) {
        return a + b + c;
    }

    public static double addition(double a, double b) {
        return a + b;
    }

    public static double subtraction(int a, int b) {
        return a - b;
    }

    public static double subtraction(int a, int b, int c) {
        return a - b - c;
    }
    public static double subtraction(double a, double b) {
        return a - b;
    }

    public static double multiplication(int a, int b) {
        return a * b;
    }

    public static double multiplication(int a, int b, int c) {
        return a * b * c;
    }

    public static double multiplication (double a, double b) {
        return a * b;
    }
    public static double division(int a, int b) {
        return a / b;
    }

    public static double division(int a, int b, int c) {
        return a / b / c;
    }

    public static double division(double a, double b) {
        return a / b;
    }
    public static void main(String[]args){
    System.out.println(addition(5, 10.5));
    System.out.println(addition(4, (int)6.8, 8));
    System.out.println(division(20.0, 5.9f));
    System.out.println(division(6, 10, 5));

}
}