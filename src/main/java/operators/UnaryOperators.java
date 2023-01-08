package operators;

public class UnaryOperators {
    public static void main(String[] args) {

        // Unary operators
        // ++, +
        // --, -=
        //*=, /=

        int a = 5;
        int b = 10;

        System.out.println(a + b); //15
        System.out.println(++a); //6 (++ means 1) 1+5=6

        b= ++b; //11

        b = --a; // 6 -1
        System.out.println(b); //5,4
        System.out.println(a);//5

        a = --a; //5=4

        b = --a; //4=3
        System.out.println(a);
        System.out.println(b);

        //=====================

        // a=3

        a += 2; //3 + 2
        //means a= a + 2 = 5

        System.out.println(a);

        b+= 10; //3+10=13
        System.out.println(b);

        int x = 50;
        int y = 2;

        x /=y; //25  (means x = x /y)
        System.out.println(x);

        y *= x;
        y = y * x;
        System.out.println(y);

        //===============

        // ++x - prefix,
        //x++ - postfix

        x = 5;
        y = ++x;
        //x = x + 1;
        //y = x;

        System.out.println("y: " + y);
        System.out.println("x: " + x);

        x = 5;
        y = x++;
        //y = 5;
        //x = 5 + 1;
        System.out.println("new y: " + y); //5
        System.out.println("new x: " + x); //6

//////////////=============


    }
}
