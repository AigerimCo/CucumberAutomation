package oop.abstraction;

public abstract class Shape {

    String name;
    static String color;

    public abstract int getArea(int length,int width );

    public abstract int getPerimeter (int length, int width);

    public abstract void printAllSimilarShapes();


    }

