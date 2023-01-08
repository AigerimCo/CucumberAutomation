package recap;

public class RecapWhileLoop {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        int k = 1;
        while (k <= 10) {
            System.out.println(k);
            k++;
        }
        int d = 0;
        while (d <= 5) {
            System.out.println(d);
            d++;
        }
        int m = 10;
        while (m >= 1) {
            System.out.println(m);
            m--;
        }
        int e = 100;
        while (e >= 0) {
            System.out.println(e);
            e -= 2;
        }
        int h = 100;
        while (h >= 0) {
            if (h % 3 == 0) {
                System.out.println(h);
            }
            h--;
        }
        int a = 0;
        while (a <= 1000) {
            if (a % 5 == 0) {
                System.out.println(a);
            }
            a++;
        }

        int i = 1;
        while (i <= 10) {
            System.out.println("Good morning everyone!");
            i++;
        }
        int s = 1;
        while (s <= 31) {
            System.out.println(s + " January 2023");
            s++;
        }

        /*
        print numbers from 100 to 0 using while loop
        print only numbers that can be divided by 3
        100 % 3 = 1
         */

        int p = 100;
        while (p >= 0) {
            if (p % 3 == 0) {
                System.out.println(p);//99,96,93,90,87,84....0
            }
            p--;
        }
        /*
        print numbers from 0 to 1000
        print numbers that can be divisible by 5
         */
        int g = 1;
        while(g <=1000){
            if(g % 5 == 0){
                System.out.println(g);
            }
            g++;
        }
    }
}