package scannerClass;
import java.util.Scanner;
public class ScannerString {

    public static void main(String ... args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Please enter your first name: ");
        String firstName = sc.nextLine();
        System.out.println("Please enter your last name: ");
        String lastName = sc.nextLine();

        System.out.println("Please enter your age: ");
        byte age = sc.nextByte();

        System.out.println("\nHello " + firstName + " " + lastName + "!"
                +"\n You are so young! Just " + age + " years old!");

        /*
        1. write a program that will get 2 numbers and return multiplication
        2. write a program that will get 3 numbers and return addition of all 3
        3. write a program that gets:
        string product name
        double = price
        int = quantity

        You purchased 5 breads each costs 4$, the total will be 20$
         */


    }
}
