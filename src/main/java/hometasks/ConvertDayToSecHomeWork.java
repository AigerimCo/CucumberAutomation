package hometasks;

import java.util.Scanner;

public class ConvertDayToSecHomeWork {
    public static long convertDayToSec(int numberOfDays) {
        return numberOfDays * 24 * 60 * 60;
    }

    public static void main(String[] args) {
        int numberOfDays = 7;
        long numberOfSeconds = convertDayToSec(numberOfDays);
        System.out.println(numberOfDays + " days = " + numberOfSeconds + " seconds");
    }
}








