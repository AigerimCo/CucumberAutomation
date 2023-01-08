package arrayList;

import java.util.ArrayList;

public class RecapArrayList {
    public static void main(String[] args) {

        ArrayList<Double> salary = new ArrayList<>();//==> create means declare
        salary.add((double) 2300);
        salary.add((3300.00));
        salary.add((5500.00));
        salary.add((800.20));
        salary.add((double) 10000);
        salary.add((4500.50));
        salary.add((22000.00));

        /*
        write a program below to find and print largest salary
        write a program to find a smallest salary and print it
     */

        Double largest = 0.0;
        Double smallest = salary.get(0);

        for (int i = 0; i < salary.size(); i++) {
            if (salary.get(i) > largest) {
                largest = salary.get(i);
            }
        }

        for (int i = 0; i < salary.size(); i++) {
            if (salary.get(i) < smallest) {
                smallest = salary.get(i);
            }
        }
        System.out.println(largest);//22000.0
        System.out.println(smallest);//800.2

        //--------------------------------------------------
        ArrayList<Short> orderID = new ArrayList<>();
        orderID.add((short) 323);
        orderID.add(Short.valueOf("543"));
        orderID.add(Short.valueOf((short)909));
        orderID.add((short)121);
        orderID.add((short)343);
        orderID.add((short)234);

        /*
        find the average of all order IDs and print it
         */
        short sum = 0;
        int average;
        for (int b = 0; b < orderID.size();b++){
            sum += orderID.get(b);

        }
        average = sum/orderID.size();
        System.out.println(average); //412

    }
}


