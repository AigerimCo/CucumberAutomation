package switchStatement;

public class switchBreak {
    public static void main(String[] args) {
        //switch case
        int day = 5;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
        switch (day) {
            //multiple cases without break statements
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                //              dayType - "Weekday";
                break;
            case 6:
            case 7:
                //               dayType = "Weekend";
                break;

            default:
                //              dayType = "Invalid dayType";
        }
//        System.out.println(dayString + " is a " + dayType);
    }

}