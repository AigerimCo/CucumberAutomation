package oop.abstraction;

public class Parallelogram extends Shape{

    public int getArea(int length, int width) {
        return length * width;
    }


    public int getPerimeter(int length, int width) {
        return (length + width) * 2;
    }


    public void printAllSimilarShapes() {
        System.out.println("parallelogram");
    }



}
