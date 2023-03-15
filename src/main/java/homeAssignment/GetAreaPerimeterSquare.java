package homeAssignment;

import java.util.Scanner;

public class GetAreaPerimeterSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width of square: ");
        int width = scanner.nextInt();


        System.out.print("Do you want to get area Or perimeter of square Or both? ");
        String areaOrPerimeter = scanner.next();

        switch (areaOrPerimeter.toLowerCase()){
            case "area":
                int area = width * width;
                System.out.println("The area of the square is: " + area);
                break;
            case "perimeter":
                int perimeter = 4 * width;
                System.out.println("The perimeter of the square is: " + perimeter);
                break;
            case "both":
                area = width * width;
                perimeter = 4 * width;
                System.out.println("The perimeter of the square is " + perimeter + " and the area of the square is " + area);
                break;
            default:
                System.out.println("Invalid input. Please enter either 'area', 'perimeter', or 'both'.");
        }

    }
}


