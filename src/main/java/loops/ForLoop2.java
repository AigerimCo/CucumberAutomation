package loops;

public class ForLoop2 {
    public static void main(String[] args) {
        /*
        create a loop that will print
        numbers from 0 to 30
        if a number can be divided by 3, add number -divisible
        0
        1
        2
        3=divisible
        4
        5
        6 - divisible
         */

        for(int i =0; i <+30; i++){
            if(i % 3 == 0) {
                System.out.println(i + " - divisible");
            }else{
                System.out.println(i);
            }
        }
    }
}
