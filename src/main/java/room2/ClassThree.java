package room2;

import room1.ClassOne;

public class ClassThree extends ClassOne{

    public static void main(String[] args) {
        System.out.println(new ClassOne().str1);
        System.out.println(ClassOne.str1);

        System.out.println(str4);
    }
}
