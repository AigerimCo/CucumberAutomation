package dateTime;

import java.util.Date;

public class DateIntro {
    public static void main(String[] args) {
        /*
        Date class exists in java.util and java.sql packages
        below practice Date from java.util package

        System time => Time of your computer
         */

        Date date = new Date();
        System.out.println(date);

        Date myDoB = new Date(822411361L * 1000);
        System.out.println(myDoB);
        boolean isAfter = date.after(myDoB);
        boolean isBefore = date.before(myDoB);

        Date iM30 = new Date(1769182561L * 1000);


        System.out.println(isAfter);
        System.out.println(isBefore);

        System.out.println(date.after(iM30)); //false
        System.out.println(date.before(iM30)); //true

    }
}