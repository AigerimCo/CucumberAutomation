package scannerClass;
import java.util.Scanner;
public class ScannerAssighment {
    public static void main(String[] args){

        Scanner secondTask = new Scanner (System.in);

        System.out.println ("Please enter first number: ");
        int h = secondTask.nextInt();

        System.out.println("Please enter second number; ");
        int j = secondTask.nextInt();

        System.out.println("Please enter third number: ");
        int l = secondTask.nextInt();

        int addition = h + j +l;

        System.out.println(h + " + " + j + " + " + l + " = " + addition);

        Scanner grocery = new Scanner (System.in);

    }
}
