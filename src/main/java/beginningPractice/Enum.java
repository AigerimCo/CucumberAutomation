package beginningPractice;

import java.util.Arrays;

public class Enum {
    public static void main(String[] args) {

        System.out.println(OrderStatus.Taken.getText());
        System.out.println(OrderStatus.Delivered.getText());
        System.out.println(OrderStatus.ReadyToShip.getText());

        System.out.println(Movie.COMEDY.getNum());
        System.out.println(Movie.THRILLER.getNum());
        System.out.println(Movie.ACTION.getName());

        System.out.println(Movie.ACTION.ordinal());
        System.out.println(Movie.CARTOONS.name());
        System.out.println(Arrays.toString(Movie.values()));

    }

    /* ////SWITCH STATEMENT
    OrderStatus myVar = OrderStatus.ReadyToShip;

if (myVar.equals(OrderStatus.Delivered)) {

    System.out.println("Medium level");

} else if (myVar.equals(OrderStatus.Taken)) {

    System.out.println("Low level");
} else if (myVar.equals(OrderStatus.ReadyToShip)) {

    System.out.println("High level");
} else {

    System.out.println("default response from if else");
}

switch (myVar) {
    case Taken:
        System.out.println("Low level");
        break;
    case Delivered:
        System.out.println("Medium level");
        break;
    case ReadyToShip:
        System.out.println("High level");
        break;
    default:
        System.out.println("Default response");
}
     */
}
