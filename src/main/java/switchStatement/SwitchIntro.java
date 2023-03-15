package switchStatement;

import java.util.ArrayList;

public class SwitchIntro {

    /*
    we may have as many statements as we want
    but only one default statement
    default will execute in case if no match was found

     */
    public static void main(String[] args) {

        int number = 20;

        switch (number) {
            case 1:
                System.out.println("number is equal to ONE");
                break;
            case 5:
                System.out.println("number is equal to FIVE");
                break;
            case 10:
                System.out.println("number is big");
                break;
            default:
                System.out.println("couldn`t fint the number");
        }

        int month = 1;
        String monthString;

        switch (month) {
            case 1:
                monthString = "Jan";
                break;
            case 2:
                monthString = "Feb";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "June";
                break;
            case 7:
                monthString = "July";
                break;
            case 8:
                monthString = "Aug";
                break;
            case 9:
                monthString = "Sep";
                break;
            case 10:
                monthString = "Oct";
                break;
            case 11:
                monthString = "Nov";
                break;
            case 12:
                monthString = "Dec";
                break;
            default:
                monthString = null;
                System.out.println("No month matched your request, please provide from 1 to 12 ");
        }
        System.out.println(monthString);

        //write same program with If Else  statement

        int ifMonth = 2;
        String ifMonthStr;

        if (ifMonth == 1) {
            ifMonthStr = "January";
        } else if (ifMonth == 2) {
            ifMonthStr = "February";
        } else if (ifMonth == 3) {
            ifMonthStr = "March";
        } else if (ifMonth == 4) {
            ifMonthStr = "April";
        } else if (ifMonth == 5) {
            ifMonthStr = "May";
        } else if (ifMonth == 6) {
            ifMonthStr = "June";
        } else if (ifMonth == 7) {
            ifMonthStr = "July";
        } else if (ifMonth == 8) {
            ifMonthStr = "August";
        } else if (ifMonth == 9) {
            ifMonthStr = "September";
        } else if (ifMonth == 10) {
            ifMonthStr = "October";
        } else if (ifMonth == 11) {
            ifMonthStr = "November";
        } else if (ifMonth == 12) {
            ifMonthStr = "December";
        } else {
            ifMonthStr = null;
            System.out.println("No month matched your request, please provide from 1 to 12");
        }

        System.out.println(monthString);



        int day = 4;
        switch (day){
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
                System.out.println("Thursday");
                break;
        }

        int ifDay = 3;
        String ifDayString;

        if(ifDay == 1){
            ifDayString = "Monday";
        }else if (ifDay == 2){
            ifDayString="Tuesday";
        }else if (ifDay == 3){
            ifDayString="Wednesday";
        }else if (ifDay == 4){
            ifDayString="Thursday";
        }else if (ifDay == 5){
            ifDayString="Friday";
        }else if (ifDay == 6){
            ifDayString="Saturday";
        }else if (ifDay == 7){
            ifDayString="Sunday";
        }else{
            ifDayString = null;
        }


        ArrayList<String>colors=new ArrayList<>();

        int num = 3;

        switch(num){
            case 1: colors.add("red");
            case 2: colors.add("blue");
            case 3 : colors.add("orange");
            case 4 : colors.add("black");
            case 5: colors.add("white");
            case 6: colors.add("yellow");
            break;
            case 7: colors.add("green");
            case 8: colors.add("gray");
            default: colors.add("no color");
        }
        System.out.println("colors");// orange,black,white,yellow
    }


        }


