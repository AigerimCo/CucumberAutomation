package hometasks;

import java.util.ArrayList;

public class IsEmptyArrayHomeTask {
    //Create IsEmptyArray java class, add following code and upload the file.
    public static void main(String[] args) {
        /*
1. create arrayList of Strings, add 5 values
   check whether arrayList is empty and assign value into boolean variable
   remove all values from arrayList
   check whether arrayList is empty and assign value into boolean variable
         */

        ArrayList<String> shape = new ArrayList<>();
        shape.add("circle");
        shape.add("triangle");
        shape.add("square");
        shape.add("diamond");
        shape.add("heart");

        boolean isEmpty = shape.isEmpty();
        System.out.println(shape.isEmpty());//false

        shape.clear();

        isEmpty = shape.isEmpty();
        System.out.println(shape.isEmpty());//true

    /*
    2. create array of Strings, add 5 values
    check whether array is empty and assign value into boolean variable
    remove all values from array
    check whether array is empty and assign value into boolean variable
     */
        String[] lesson = new String[5];
        lesson[0] = "mathematics";
        lesson[1] = "history";
        lesson[2] = "chemistry";
        lesson[3] = "biology";
        lesson[4] = "physics";

        boolean isArrayEmpty = true;
        for (int i = 0; i < lesson.length; i++) {
            if(lesson[i] != null){
            isArrayEmpty = false;
            System.out.println(isArrayEmpty);//false
            break;
        }
    }
    lesson = new String[0];
        if(lesson.length == 0){
            isArrayEmpty = true;
        }

        System.out.println(isArrayEmpty);//true
        System.out.println(lesson.length);

    }
}