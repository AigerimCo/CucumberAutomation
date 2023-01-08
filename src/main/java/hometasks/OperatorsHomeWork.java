package hometasks;

public class OperatorsHomeWork {
    public static void main(String[] args) {

        // 1.write a program that will print the sum of two variables.

        int a = 100;
        int b = 200;
        int sum = a + b;
        System.out.println(sum);

        // 2.write a program that will print the sum of three variables.

        int q = 5;
        int w = 9;
        int e = 10;
        int sum1 = q + w + e;
        System.out.println(sum1);

        // 3. using operators and variables, write a program that will print following lines of code:

     int aa = 1;
     int bb = 2;
     System.out.println(aa + bb);

     int cc = 3;
     int dd = 1;
     System.out.println(cc - dd);

     int d = 2;
     int c = 2;
     System.out.println(d * c);

     int g = 4;
     int f = 2;
     System.out.println(g / f);

     int h = 2;
     int i = 8;
     System.out.println(h + i);

      int j = 10;
      int k = 7;
      System.out.println(j % k);

      // 4.Length and width of a rectangle are 9 and 15 respectively.
        // Write a program to calculate the area and perimeter of the rectangle. Print results as following:

        int length = 9;
        int width = 15;
        int theAreaOfRectangle = length * width;
        System.out.println(theAreaOfRectangle);

        int length1 = 9;
        int width1 = 15;
        int thePerimeterOfRectangle = (length1 + width1) * 2;
        System.out.println(thePerimeterOfRectangle);

        //5. write a program to add 8 to the number 2345 and then divide it by 3.
        // Now, the modulus the total sum with 5 and then multiply the result value by 5. print the final result

        int m = 8 + 2345 / 3 % 5 * 5;
        System.out.println(m);  // 13

        //6. Now, solve the above question using assignment operators (eg.+=, -=, *=)
        int u = 2345;
        u /= 3;
        u %= 5;
        u *= 5;
        u += 8;
        System.out.println(u);

        //7. Write a program to check if the numbers 23 and 45 are equal.
        boolean equal;
        equal = 23 == 45;
        System.out.println("23 == 45 " + equal); // false

        //8. Write a program to check if the two numbers -10 and 10 are equal
        boolean areEqual;
        areEqual = -10 == 10;
      System.out.println("-10 == 10 " + areEqual); //false

    }
}

