package dateTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ParseDateTime {
    public static void main(String[] args)throws ParseException {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Before formatting: " + dateTime); //Before formatting: 2023-01-27T10:47:33.851913200
        // T- delimiter is a put between date and time

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String formattedDate = formatter.format(dateTime);

        System.out.println("After formatting " + formattedDate);

        //27-01-2023 10:52
        //01/27/2023 10:52

        formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");
        formattedDate = formatter.format(dateTime);
        System.out.println("New format: " + formattedDate);

        //2023-01-27 10:52 am
        formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm a");
        formattedDate = formatter.format(dateTime);
        System.out.println("Another new format: " + formattedDate);//Another new format: 2023/01/27 11:00 AM

        //Fri,27 Jan 2023 10:52 AM
        // E -day of week
        //MM -name of the month

        formatter = DateTimeFormatter.ofPattern("E dd MM yyyy hh:mm a");//Another new format 3: Fri 27 01 2023 11:05 AM
        formattedDate = formatter.format(dateTime);
        System.out.println("Another new format 3: " + formattedDate);

        /*
        String date = 27 Jan 2023
        String weekDay = Fri
        String time = 11:07 AM
         */
        formatter = DateTimeFormatter.ofPattern("E dd MM yyyy hh:mm a");//new format: Fri 27 01 2023 11:11 AM
        formattedDate = formatter.format(dateTime);
        System.out.println("new format: " + formattedDate);

//another way to set up date and time

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        String date = sdf.format(new Date());
        System.out.println(date);

        //Fri, 27 Jan 2023 10:52 AM

        SimpleDateFormat sdf1 = new SimpleDateFormat("E, dd MMM yyyy hh:mm a");

        String date1 = sdf1.format(new Date());
        System.out.println(date1);//Fri, 27 Jan 2023 11:17 AM

 //      String date1 = sdf1.format(new Date());

        //CONVERTING String back to Date
        Date anotherDate = sdf1.parse(date1);
        System.out.println(anotherDate);
    }
}
