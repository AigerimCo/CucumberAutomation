package beginningPractice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeYear {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        LocalDate createdOurDate = LocalDate.of(2022, 2, 11);

        LocalTime createdOurTime = LocalTime.of(10, 2, 59);
        LocalTime plus = createdOurTime.plusHours(4);
        LocalDate plusDate = createdOurDate.plusMonths(2);

        System.out.println(createdOurDate);
        System.out.println(createdOurTime);

        System.out.println(plus);
        System.out.println(plusDate);

        LocalDateTime localDateTime = LocalDateTime.of(2022, 2, 11,10, 2, 59);

        System.out.println(localDateTime);
    }
}
