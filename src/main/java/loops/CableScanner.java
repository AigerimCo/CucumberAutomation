package loops;

import java.util.Scanner;

public class CableScanner {
    public static void main(String[] args) {
        String secretKey = "Chicago2022";
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        while(check){
            check = false;
            System.out.println("Please enter your password");
            String enteredPassword=scanner.nextLine();
            if(enteredPassword.equals(secretKey)) {
                System.out.println("Successfully logged in");
                check = false;
            }else{
                System.out.println("Wrong password! Try again!");
            }
        }
    }
}
