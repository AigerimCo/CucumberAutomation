package mock;
/*
1.	Write a Java Program to print Fibonacci Series using Recursion.
 */
public class FibonacciNumbers {
    //create method that will print fibonacci numbers
    public static void main(String[] args) {
        printFibonacciNumbers(50);
        System.out.println();
        printFibonacciNumbers(100);

    }


    public static void printFibonacciNumbers(int max) {
        //0 1 1 2

        int a = 0;
        int b = 1;
        int c = a + b;
        System.out.println(a + " " + b + " " + c + " ");


        while (c < max) {
            a = b;
            b = c;
            c = a + b;

            if (c < max) {
                System.out.print(c + " ");

            }
        }
    }
}






//    public static int fib(int n) {
//        if (n <= 1) {
//            return n;
//        }
//
//        return fib(n - 1) + fib(n - 2);
//    }
//
//
//
//        public static void main (String[]args){
//            int max = 10;
//
//            for (int i = 0; i < max; i++) {
//                System.out.print(fib(i) + " "); //0 1 1
//            }
//        }
//
//
///*
//recursion is about calling method inside itself to create loop
// */
//
///*
//sum(4) => sum(3) => sum(2) => sum(1)
// */
//        public static int sum ( int k){
//
//            if (k > 0) {
//                return k + sum(k - 1);
//            }
//
//            return 0;
//        }
//    }