package room1;

public class ClassTwo extends ClassOne{



    public static void main(String[] args) {
        System.out.println(new ClassOne().str1);
        System.out.println(ClassOne.str1);
        System.out.println(str1);
 //     System.out.println(str2);//cannot its private
        System.out.println(str3);
        System.out.println(str4);


    }
}
