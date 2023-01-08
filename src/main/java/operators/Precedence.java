package operators;

public class Precedence {
    public static void main (String [] args){

        int x = 2 + 3 * 2; //8
        int w = 2 * 3 + 2; //8

        // 2    1    3   4
        x = 5 + 10 / 2 + 20 - 5; //25

        w = 3 * 2 * 10 - 7 + 10 / 3; //56
        System.out.println(w);

        int v = 2 + 3 * 5;//17
        int y = (2 + 3) * 5; //25

        System.out.println(v);
        System.out.println(y);


        //==============

        v = 5 + 4 * 2; //13
        y = (5 + 4) * 2; ///18

        //===========
        y = 10 + 14 / 7; //12
        v = (10 + 14) / 7; //3
        System.out.println(y);
        System.out.println(v);


        //=======================

        int a = 5;
        int b = 3;
        int c = 8;

        int g = a + b * (a = c);
        g = 5 + 3 * 8; //29

        int z = 40;
        int n = 10;
        int m = 2;

        int f = z - n + m % 3 +5 * 2 - (n = m);//40
        f = 40 - 10 + 2 + 10 - 2; //40
        System.out.println(f);

        //===================

        int o = 9;
        int k = 4;
        int h = 10;
        int l = 3;

        int sum = o % l * k - (h = 2) +32; //30
        // sum = 0 * 4 - 2 + 32= 30

        System.out.println(sum);

        int i = -10;
        int e = 20;
        System.out.println(i + e);

    }
}
