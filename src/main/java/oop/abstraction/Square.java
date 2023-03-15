package oop.abstraction;

import java.util.HashMap;
import java.util.Map;

public class Square extends Shape{

    String name = "square";
    int numberOfCorners = 4;



    public int getArea(int length, int width) {
        return length * width;
    }


    public int getPerimeter(int length, int width) {
        return (length + width) * 2;
    }

    @Override
    public void printAllSimilarShapes() {
        Map map = new HashMap();
    }



}
