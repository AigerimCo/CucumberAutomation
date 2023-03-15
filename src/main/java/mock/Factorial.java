package mock;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorialNumber(4));
        System.out.println("The factorial number using recursion is:  " + factorial2(4));
    }

        /*
        create a method,which take one int and returns its factorial number
        Factorial is the sum of all numbers smaller and equal to the number
        factorial(4)=> 4*3*2*1=24
        factorial(6)=>6*5*4*3*2*1=720

        if you done with loop,try with recursion
         */

    public static int factorialNumber(int number){
        int a = 1;
        for(int i=1; i <= number; i++){
            a *= i;
        }
        return a;
    }
    /*
    4
    4*3*2*1
     */
    public static int factorial2(int n){
        if(n <= 1){
             return 1;
        }else{
            //4*3*2*1
            return n * factorial2(n -1);

        }
    }
    }

