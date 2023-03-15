package mock;

public class ConvertStringToInt {
    public static void main(String[] args) {
        System.out.println(returnInt("123456"));
        System.out.println(returnInt("apple123456"));

    }
    /*
    Write a program which takes String and returns converted int
    If String cannot be converted to Int, return 0.

    try-catch block
     */
public static int returnInt(String str){
    try{
        return Integer.parseInt(str);
    }catch(Exception e){
        System.out.println("Please,enter the digits only. Invalid number!");
    }
    return 0;
}
}
