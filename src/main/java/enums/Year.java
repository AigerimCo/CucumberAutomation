package enums;

import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter seasons of the year");

        String str = scanner.next();

        System.out.println(str.equalsIgnoreCase(Seasons.SPRING.name()) ||
                str.equalsIgnoreCase(Seasons.SUMMER.name()) ||
                str.equalsIgnoreCase(Seasons.FALL.name()) ||
                str.equalsIgnoreCase(Seasons.WINTER.name()) ?
                "Valid season. Here are the months of this season : " : "Invalid season");

        switch(str.toUpperCase()){
            case "WINTER":
                System.out.println("December,January,February");
                break;
            case "SPRING":
                System.out.println("March, April,May");
                break;
            case "SUMMER":
                System.out.println("June,July,August");
                break;

            case "FALL":
                  System.out.println("September,October,November");
                  break;
            default:
                System.out.println("Please enter winter, spring,summer or fall");
        }
        /* OR

        switch (str.toUpperCase()){
            case "WINTER" :
                System.out.println(EnumPractice.Months.DECEMBER + " " + EnumPractice.Months.JANUARY + " " +EnumPractice.Months.FEBRUARY);
                break;
            case "SPRING" :
                System.out.println(EnumPractice.Months.MARCH + " " + EnumPractice.Months.APRIL + " " +EnumPractice.Months.MAY);
                break;
            case "SUMMER" :
                System.out.println(EnumPractice.Months.JUNE + " " + EnumPractice.Months.JULY + " " +EnumPractice.Months.AUGUST);
                break;
            case "FALL" :
            case "AUTUMN" :
                System.out.println(EnumPractice.Months.SEPTEMBER + " " + EnumPractice.Months.OCTOBER + " " +EnumPractice.Months.NOVEMBER);
                break;
            default :
                System.out.println("Please enter winter, spring, summer, fall or autumn");

         */
    }
}