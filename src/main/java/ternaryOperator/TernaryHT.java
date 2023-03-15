package ternaryOperator;

import java.util.Scanner;

public class TernaryHT {
    public static void main(String[] args) {

        int day = 3;
        String ifDay;

        if (day == 1) {
            ifDay = "Monday";
        } else if (day == 2) {
            ifDay = "Tuesday";
        } else if (day == 3) {
            ifDay = "Wednesday";
        } else if (day == 4) {
            ifDay = "Thursday";
        } else if (day == 5) {
            ifDay = "Friday";
        } else if (day == 6) {
            ifDay = "Saturday";
        } else if (day == 7) {
            ifDay = "Sunday";
        } else {
            ifDay = null;
        }

        Scanner scanner = new Scanner(System.in);
        int Day = scanner.nextInt();

        System.out.println(Day == 7 ? "do something" : "It`s else");

        if (Day == 7) {
            System.out.println("do something");
        } else {
            System.out.println("It`s else");
        }
    }
}
