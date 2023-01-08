package operators;

public class ArithmeticOperators {
    public static void main(String[] args) {


        //Assignment operator =

        int x = 5;
        System.out.println("The value of x:" + x);

         // x - operand
        // operand
        // = operator

        //int stores numbers from -2 bil to 2 bil..
        int y = 20;
        int p = 10;


        y = 5; //5
        y = p; //10

        y = y; //10

        p = y; //10

        p=5; //5

        p = p +20; //25


        // int y = 25;
        //int p = 50;

        y = 10;
        y = 3;
        y = 9;
        y = p; // 50

        p = 10;
        p = 8;
        p = y; //50



        //---------------------


        String a = "abc";
        String b = "xyz";

        a = "Chicago";

        System.out.println(a);

        a=b;

        System.out.println(a);
        System.out.println(b);

        a = "Los Angeles";
        b = a;
         System.out.println(b + a);

         // -------------Arithmetic operator======

        short num = 10;
        short num2 = 20;

        int sum = num + num2; //30
        System.out.println(sum);

        System.out.println(sum + 5); // 35

        System.out.println(num + 100); // 110

        //subtraction -

        int q = 1;
        int r = 2;

        int s = r - q; //1
        System.out.println(s + 5); //6

        s = s + 2 - 1;
        System.out.println(s); //2

        // * multiplication

        long l = 10;
        long k = 5;

        System.out.println(l * k); //50
        System.out.println(l); // 10

        l = k * k;

        System.out.println(l); //25
        System.out.println(k); // 5
        System.out.println(l * k - 10); //115

        // division//

        byte myByte = 9;
        byte myByte2 = 3;

        System.out.println(myByte / myByte2); // 3
        myByte2 = (byte) (myByte / myByte2); //3

        // =========modulus %

        int j = 10;
        int m = 3;

        System.out.println(j % 3); //1
        System.out.println(j / m); //10 / 3 = 3

        double d = 10.0;
        double c = 3.0;

        System.out.println(d / c); /// 3.333

        System.out.println(25 % 3); // 1
        System.out.println(25 % 5); // 0
        System.out.println(100 % 20); // 0
        System.out.println(5 % 3); //2
        System.out.println(10 % 9); //1
        System.out.println(10 % 6); //4
        System.out.println(90 % 40); //10
        System.out.println(85 % 40); //5
        System.out.println(30 % 9); //3
        System.out.println(29 % 3);//2

        System.out.println(29.0 % 3.0);// 2.0

//==================PRACTICE=============== cmd + /

        int digit = 100;
        int anotherDigit = 20;

        System.out.println(digit % anotherDigit); //0
        System.out.println(digit % 40); //20
        System.out.println(digit % 35); //30
        // 100-35-35=30

        System.out.println(digit % 45);//10
        System.out.println(150 % 60); //30
        System.out.println(150 % 1000); //150
        System.out.println(150 % 50);//0
        System.out.println(140 % 60); //20
        System.out.println(130 % 60); //10
        System.out.println(110 % 60);//50
        System.out.println(119 % 60); //59
        System.out.println(119 % 120);//119


    }
}
