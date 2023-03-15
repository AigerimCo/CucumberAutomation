package beginningPractice;

import java.util.Scanner;

public class Ternary11 {
    public static void main(String[] args) {

        String day = "sunny";
        System.out.println(day.equals("sunny") ? "go to walk" : "stay home");


        if (day.equals("sunny")) {
            System.out.println("go to walk");
        } else {
            System.out.println("stay home");
        }
    }
}
