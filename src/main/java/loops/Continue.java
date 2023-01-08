package loops;

public class Continue {
    public static void main(String[] args) {
        /*
        print numbers from 1 to 10
        if number == 5, do not print
         */
        for (int i = 1; i <= 10; i++){

            if(i >= 3 & i <= 6){
                continue;
            }
            System.out.println(i);
        }
    }
}
