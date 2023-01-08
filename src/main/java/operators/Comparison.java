package operators;

public class Comparison {
    public static void main (String [] args){
        /*
        Comparison operators are <, >, <=, >=, ==
         */

        boolean b = 5 > 2;
        System.out.println(b);

        b = 5 < 2;
        System.out.println(b);

        /*
        ==equals operators, compares 2 values if that are equal
        */

        b = 10 == 10;
        System.out.println("10 == 10: " + b);

        b = 10 == 5;
        System.out.println("10 == 5: " + b);

        /*
        >=, <=
         */

        b = 10 >= 5;
        System.out.println("10 >= 5:" + b);

        b = 100 >=-100;
        System.out.println("100 >=-100: " + b);

        b = 900 <= 90;
        System.out.println("900 <= 90: " + b);

        b= 900 >= 90;
        System.out.println("900 >= 90: " + b);

        //===========================

        System.out.println(10 > 1);
        int k = 50;
        int p = 1;

        System.out.println(k < 1);
        System.out.println(50 < 1);

//        ====================

        String str = "abc";
        String str2 = "123";

        System.out.println(str + str2);

        System.out.println(1 + 5);
        System.out.println(str + 1 + 5);//abc15

        String number = "12";
        String div = "6";

        System.out.println(number + div); //126

        System.out.println(1 + 2 + 1 + "some text"); //4some text
        System.out.println(str + 1 + 2 + 1);
        System.out.println(2 + 3 + 5 + "some data" + 3 + 5 + 6); //10some data356

        /*
        create 10 different ints, 10 shorts, 10 bytes, 10 booleans, 10 strings, 10 doubles, 10 longs
        give dif names, dif values
         */



        String str1 = "hello"; //15
        System.out.println(str +  " " + 3 * 5); //hello 15
        System.out.println(str +  " " + 3 + 5);//hello 35
        System.out.println(4 + 10 + " ");//14
        System.out.println(3 - 1 + 10 +" 23");//12 23
        System.out.println("hello " + 3 + 2 + 4 * 3);//hello 3212
        System.out.println(5 * 20 + 3 - 4 + "hi");// 99 hi
        System.out.println(4 * 5 + 3 + "bye bye" + 4 + 3 * 3); // 23 bye bye 49
        //                 20  -  1                          1
        System.out.println(20 - 5 % 2 + "modulus " + 100 + 10 % 3);// 19 modulus 1001
       //                                 0           12                 6 40
        System.out.println(100 + 4 - 10 * 3 % 2 + 25 / 2 + "hello " + 3 * 2 + 40); // 116 hello 640

/*
precedence - priority
1. * / %
2. + -
3. java reads from left to right, from top to bottom
 */

        System.out.println(4 != 3); // true
        System.out.println(4 == 4);// true
        System.out.println( 5 <= 5);//true
        System.out.println(5>=10);//true
        System.out.println(100>=40);//true
        System.out.println(100 >= 200);//false

        boolean b1 = true;
        boolean b2 = true;
        boolean b3 = false;
        System.out.println(b1 !=b2);//false
        System.out.println(b1=b2);//true
        System.out.println(b1=b3);//false
        System.out.println(b1 != b3);// false
        System.out.println(false != false); // false
    }

    }



