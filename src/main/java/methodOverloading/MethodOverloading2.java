package methodOverloading;

public class MethodOverloading2 {
    public static void main(String[] args) {

    }

    public static int sum(int a, int b){
        return a + b;
    }

    /*
    create method, which takes 2 doubles and return their
    sum as int
     */
    public static int sum(double a, double b){

        return (int)(a + b);
    }

    /*
    create method, which takes 2 floats and return their
    sum as int
     */
    public static int sum(float a, float c){
        return (int)(a+c);
    }

    /*
    create method, which takes 3 ints and return their
    sum as int
     */
    public static int sum(int a, int b, int c){
        return a + b + c;
    }

    /*
  create a method which takes one array of Strings, two ints,
  one boolean
  and returns string
     */

    public static String stringMethod(String [] arr, int a, int b, boolean c){
        return "";
    }

    /*
    create String stringMethod, which accepts one int, one double, two Strings, one array of ints
    return "";
     */
    public static String stringMethod(int a, double d, String name, String lastName, int [] arr){
        return name;
    }

    /*
      create String stringMethod, which accepts 10 Strings, and returns the first string
     */
    public static String stringMethod(String a, String b, String c, String d, String e,
                                      String f, String g, String h, String i, String j){
        return a;
    }

}
