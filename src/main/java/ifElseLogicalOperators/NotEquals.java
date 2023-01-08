package ifElseLogicalOperators;
import java.util.Locale;
import java.util.Scanner;


public class NotEquals {
    public static void main(String[] args) {
     /*
     ! = means not equals, and can be used by primitives
      and non-primitive data types)
      */
        Scanner scan = new Scanner(System.in);
        System.out.println("Code of the product");
int code = scan.nextInt();

        System.out.println("How many items do you want to buy: ");
int quantity = scan.nextInt();

if(code == 1) {
    System.out.println("Total: R$ + quantity * 4.00");

}else if(code ==  2) {
    System.out.println("Total: R$ + quantity * 4.50");
}else if (code == 3) {
}

int num1 = 10;
int num2 = 5;

        System.out.println(num1 != num2);//true
        System.out.println(num1 == num2);//false

        String name1 = "Johny";
        String name2 = "Johny";
        String name3 = new String("Johny");

        System.out.println(name1 ==name2); //true
        System.out.println(name1 == name3); //false
        System.out.println(name1 != name3);//true
        System.out.println(name1 != name2);//false


/*
.equals() to compare String values, can only be used by String
 */

        System.out.println(name1.equals(name2)); //true
        System.out.println(name1.equals(name3)); //true
        System.out.println(!name1.equals(name2)); //false

        System.out.println(num1 != num2);

        Calculator calculator1 = new Calculator();
        Calculator calculator2 = new Calculator();
        Calculator calculator3 = calculator1;

        System.out.println(calculator1.equals(calculator2)); //false
        System.out.println(calculator1.equals(calculator3)); //true
        System.out.println(calculator1 == calculator3); //true
        System.out.println(calculator1 == calculator2); //false

    }
}
