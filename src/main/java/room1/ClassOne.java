package room1;

public class ClassOne {

public static String str1 = "word";
private static String str2 = "private word";
static String str3 = "default word";
protected static String str4 = "protected word";



    public static void main(String[] args) {
        System.out.println(str1);
        System.out.println(ClassOne.str2);
        System.out.println(str3);
        System.out.println(str4);
    }


    public void instanceMethod(){
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

    }
}
