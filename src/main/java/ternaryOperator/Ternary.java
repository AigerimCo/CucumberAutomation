package ternaryOperator;

import java.util.Scanner;
/*
In Java, the ternary operator is a type of Java conditional operator.
 In this section, we will discuss the ternary operator in Java with proper examples.

 The meaning of ternary is composed of three parts.
 The ternary operator (? :) consists of three operands.
 It is used to evaluate Boolean expressions.
 The operator decides which value will be assigned to the variable.
 It is the only conditional operator that accepts three operands.
 It can be used instead of the if-else statement.
 It makes the code much more easy, readable, and shorter.
 */

public class Ternary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();

        System.out.println(day == 7? "do something" : "It`s else");

        if (day == 7) {
            System.out.println("do something");
        }else{
            System.out.println("It`s else");
        }
    }
}
