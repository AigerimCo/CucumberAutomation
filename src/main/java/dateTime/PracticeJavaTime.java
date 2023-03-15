package dateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class PracticeJavaTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        Date date2 = new Date();
        System.out.println(date2);

        System.out.println(date.getEra());
        System.out.println(date.getChronology());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfWeek());

        System.out.println((date.atTime(LocalTime.now())));
        System.out.println(date.atStartOfDay());
        System.out.println(date.datesUntil(LocalDate.of(2026, 1, 23)).count());
//        System.out.println(daysToNY());
        System.out.println(daysToNY(01,27));

        LocalTime time = LocalTime.now();
        System.out.println(time);

    }

    /*
    create a method that tell us how many days left until new year
    1 January 2023
     */
    public static int daysToNewYear() {
        LocalDate date = LocalDate.now();
        return(int)date.datesUntil(LocalDate.of(2023, 01,27)).count();


    }

/*
create a method that tell us how many days left until new year from given date you may hardcore 1 Jan 2024
 */

    public static int daysToNY(int month, int day){
        LocalDate date = LocalDate.of(2023,month,day);
        return(int)date.datesUntil(LocalDate.of(2023,12,31)).count();

    }
}
