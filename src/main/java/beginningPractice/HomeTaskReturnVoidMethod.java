package beginningPractice;

import java.util.Scanner;

public class HomeTaskReturnVoidMethod {
    //1. надо создать метод который будет принимаeт в себя один стрин,
    // второй инт и вывести все по очереди
    //2. создать метод фейс контроль который будет принимать возраст имя и фаимилия,
    // если возраст равен или больше 18 ти то должно выйти сообщение имя фаимилия
    // проходите дальше а если нет то пошел вон!
    //3. нам надо написать метод который будет принимать интрежер эррей
    // и внутри выводить только те значения которые odd ()if else

    public static void main(String[] args) {

        printArray( "Alex" , 23 );
        controlFace("John", " Corner", 19, true);
        controlFace("Amanda", " Kim", 16, false);
        getOdd(new int [] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21});
    }


    public static void printArray(String name, int age){
      System.out.println("My name is : " + name);
        System.out.println("I am " + age + " old");
   }

    public static void controlFace(String name1, String name2, int age, boolean isPolicy) {

        if (age >= 18) {
            System.out.println(name1 + name2 + " Welcome to the club");
        } else {
            System.out.println(name1 + name2 + " Get out");
        }
    }

    public static void getOdd(int [] array) {

        for (int i = 0; i <= array.length ; i++) {
            if (i % 2 != 0) {
                System.out.println(i + "odd");
            } else {
                System.out.println(array[i]);
            }
        }
    }
}




/*
public static void getOdd(int array) {

        for (int i = 1 ; i <= array.length ; i++) {
            if (i % 2 != 0) {
                System.out.println(i + "odd");
            } else {
                System.out.println(i);

                getOld(9);
 */
