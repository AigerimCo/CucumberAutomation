package homeAssignment;

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

