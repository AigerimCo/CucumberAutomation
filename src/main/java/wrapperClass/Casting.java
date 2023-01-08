package wrapperClass;

public class Casting {
    public static void main(String[] args) {
        /*
        implicit casting is done by java compiler
        and it converts one data type to another
         */
        byte a = 20;

        int b = a;
        short c = a;
        long d = a;
        float e = a;
        double f = a;

        /*
        explicit casting is used to convert one data
        to another manually by putting in front of
        the given data type
         */
        int intNum = 30;
        byte byteNum = (byte)intNum;//
        System.out.println(byteNum);

        short shortNum1 = (byte)intNum;
        short shortNum = (short)intNum;
        short shortNum2 = byteNum;

        /*
 explicit casting: put l/L in the end of long, f/F in the end of float
         */
        long longNum = 1234;
        intNum = (int)longNum;
        byteNum = (byte)longNum;//explicit - when we are changing
        System.out.println("byteNum: " + byteNum);

        double doubleNum = longNum;//explicit
        doubleNum = intNum;//implicit casting - it can fit because
        // double is bigger int.
        doubleNum = 1433.535f; // impicit casting
        float floatNum = (float)doubleNum;

        shortNum = (short)32769;
        System.out.println(shortNum);

        floatNum = 13413.4343f;//explicit casting
        floatNum = 13413.4343f;//explicit casting
        floatNum= 23.2F; // explicit
    }
}
