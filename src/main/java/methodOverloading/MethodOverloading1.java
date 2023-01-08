package methodOverloading;

public class MethodOverloading1 {
    public static void main(String[] args) {
        method1();
        method1("");
        method1(4);
        method1(3.5);
        method1(5, true);
        method1(5, 'c');
    }

    public static void method1(){
        System.out.println("inside method with no params");
    }

    public static void method1(int a){
        System.out.println("inside method with one int");
    }

    public static void method1(String b){
        System.out.println("inside method with one String");
    }

    public static void method1(double c){
        System.out.println("inside method with one double");
    }

    public static void method1(int x, char c){
        System.out.println("inside method with one int and one char");
    }

    public static void method1(int y, boolean character){
        System.out.println("inside method with one int and one boolean");
    }

//    ==================





}
