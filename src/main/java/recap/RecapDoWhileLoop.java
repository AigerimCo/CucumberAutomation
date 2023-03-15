package recap;

public class RecapDoWhileLoop {
    public static void main(String[] args) {
        /*
        print 1 to 28
        1 February 2023
        2 February 2023
        do while loop
         */
        int day = 1;
        do {
            System.out.println(day + " February 2023");
            day++;
        } while (day <= 28);


        /*
        print numbers from 1 to 100 using do while loop
         */
        int a = 1;
        do {
            System.out.println(a);
            a++;
        } while (a <= 100);

        /*
        print numbers divisible by 9 in range from 1 to 900
        using do while loop
         */

        int b = 1;
        do {
            if (b % 9 == 0) ;
            System.out.println(b);
            b++;
        } while (b <= 900);

    /*
    print numbers from 5 to 500, that can be divisible by 5 using do while loop
     */
/*


        int c = 5;
        do {
            if (5 % 5 == 0) ;
            c++;
            System.out.println(c);
        } while (c <= 500);

 */
    }

}
