package oop.abstraction;

import java.util.HashMap;

public abstract class TriangleTypes extends Shape{

    public abstract void printAngle();


    public void printInfo(){
        System.out.println("printing from triangle types");
    }

    public static void printStaticInfo(){
        System.out.println("this is static method");

        HashMap<String, String> map = new HashMap<>();

    }


    static String shape = "triangle";
    int numberOfAngles = 3;






}
