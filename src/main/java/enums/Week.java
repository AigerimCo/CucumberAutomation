package enums;

import java.util.Scanner;

public class Week {
    public static void main(String[] args) {
        /*
        using Scanner class,ask user to input day of the week check if the day is valid using WeekDays enums
        if valid, print valid day
        if its not, print invalid day
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day of the week");

        String str = scanner.nextLine();
        str = str.equalsIgnoreCase(WeekDays.MONDAY.name())||
                str.equalsIgnoreCase(WeekDays.TUESDAY.name()) ||
                str.equalsIgnoreCase(WeekDays.WEDNESDAY.name())||
                str.equalsIgnoreCase(WeekDays.THURSDAY.name())||
                str.equalsIgnoreCase(WeekDays.FRIDAY.name())||
                str.equalsIgnoreCase(WeekDays.SATURDAY.name())||
                str.equalsIgnoreCase(WeekDays.SUNDAY.name()) ?
                "Valid day" : "Invalid day";

        System.out.println(str);

    }
}
