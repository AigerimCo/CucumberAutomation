package loops;

public class doWhileLoop {
    public static void main(String[] args) {

        String text = "Hello";
        boolean b = false;

        while (b) {
            System.out.println(text);
            b = false;
        }
        //==================
        do {
            System.out.println(text);
        } while (b);

        //=============

        int a = 5;

        do {
            System.out.println(a + " hello");
            a--;
        } while (a > 0);

/*USE ONLY DO WHILE and WHILE LOOP

write a program that prints
numbers from 100 to 1
print in the end a sum of all numbers

if number divisible by 5: number divisible by 5
if number divisible by 5 and its not even: weird number
if number is even: print number even
if number is not divisible by 5 and its odd: print odd number

100 divisible by 5

99
98 even
97
96 even
95 weird number

the sum of all numbers:5050

 */

        }
    }

/*
Scanner sc= new Scanner(System.in);
 */





