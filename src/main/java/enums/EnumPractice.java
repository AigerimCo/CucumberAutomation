package enums;

public class EnumPractice {

    enum Months{
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }


    public static void main(String[] args) {

        WeekDays day = WeekDays.MONDAY;
        System.out.println(day);

        System.out.println(WeekDays.FRIDAY);

        Months [] m = Months.values();

        for (Months month : m){
            System.out.println(month);
        }

    }

    public static void checkWeekDay(){
    }

}

enum Foods{
    LAGMAN,
    PLOV,
    SAMSA;

    public static void main(String[] args) {

    }

}
