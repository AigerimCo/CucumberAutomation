package mock;

public class PositiveNegativeNumber {
    public static void main(String[] args) {
PositiveNegativeOrZero(5);

        /*
        program to find if number positive, negative or 0
         */
    }
    public static void PositiveNegativeOrZero(int number){
        if(number > 0){
            System.out.println("The number is positive: " + number);
        }else if (number < 0){
            System.out.println("The number is negative: " + number);
        }else{
            System.out.println("The number is zero");
        }

}
// OR Bena`s work
   /*
    public static void checkNumber(int number){
        if(number > 0){
            System.out.println("Positive");
        }else if(number < 0){
            System.out.println("Negative");
        }
        System.out.println("Zero");
    }
    */
}
