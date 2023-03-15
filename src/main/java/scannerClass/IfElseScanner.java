package scannerClass;

import java.util.Scanner;

public class IfElseScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();

        faceControl(val);
    }
    public static void faceControl(int age){

        if(age > 18){
            System.out.println("You can go!");
        }
        else if (age == 18){
            System.out.println("Happy birthday!");
        }else{
            System.out.println("Go away");
        }
    }
}
