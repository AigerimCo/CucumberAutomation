package hometasks;

    import java.util.Scanner;

    public class PrimeNumberHomeWork {
        /*
         Write a program that checks whether a number entered by the user is a prime number or not.
         Using loop, if-else condition, Scanner class.
         Prime number is a whole number greater than 1 that cannot be exactly
         divided by any whole number other than itself and 1 (e.g. 2, 3, 5, 7, 11).
         Use Scanner class that will ask for int from user and checks if the number is prime or not.
         */

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            boolean isPrime = true;

            for (int a = 2; a < number; a++) {
                if (number % a == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(number + " is a prime number");
            } else {
                System.out.println(number + " is not a prime number");
            }
        }
    }

