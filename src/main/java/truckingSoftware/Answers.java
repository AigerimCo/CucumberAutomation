package truckingSoftware;

import java.util.Random;

public class Answers {

    public static void main(String[] args) {
     int number1; // variable declaration
     int number2;
     int number3;
     number1 = 45; // assignment
     number2 = 11;
     number3=22;

     add(number1, number2,number3);

    }

    // create add method to add two numbers and print result

    public static void add(int number1, int number2, int number3){
        int sum = number1 + number2 + number3;
        String city = "Chicago";
        welcome("Miami");
    }

    public static void welcome(String someCity){
        System.out.println("Welcome to" +someCity);

        double afterTax = calculateSalesTax(77);
        int fee = 10; // for personal fee for e ach sales
        double totalAmountToPay = afterTax + fee;
        double finalResult = discount20(totalAmountToPay);
        System.out.println("Your total amount to pay: " + finalResult +"$");


    }
//////////////////////////CREATE A METHOD THAT CALCULATES SALES TAX. METHOD TAKES DOUBLE AND CALCULATES WITH 6%
// AND RETURN THE TOTAL RESULT AFTER THE TAX.
    //////steps:
    //a. Method signature: return type double, calculateSalesTax, method parameters double
    //b. create a variable for total result
    //c. calculate the sales tax and store in double variable
    //d. Add original price and calculated sales tax and store in result
    //c. return result
    public static double calculateSalesTax(double price){
        double result;
        double salesTax = price * 0.06;
        result = price + salesTax;
        return result;

    }
/////// CREATE A METHOD DISCOUNT20. THIS METHOD SHOULD ACCEPT TOTAL PAYMENT AMOUNT
////  AND APPLY 20% DISCOUNT AND RETURN THE FINAL RESULT FOR PAYMENT.
    ///Pseudo code - steps;
    //a. Method signature: return type double, discount20, method parameters -> double type
    //b. declare result for final result
    //c. create variable for discount and calculate
    //d. subtract the discount from total price
    //c. return the final result;

    public static double discount20(double totalPrice){
        double result;
        double discount = totalPrice * 0.2;
        result = totalPrice - discount;
        return result;
    }

}



