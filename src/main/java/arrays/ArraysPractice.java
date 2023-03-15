package arrays;

public class
ArraysPractice {
    public static void main(String[] args) {
        /*
        create array of Strings - groceryList, with length of 5
        assign values to each element
        using for loop, print all elements
         */

        int numberOfGroceries = 5;
        String[] groceriesList = new String[numberOfGroceries];
        groceriesList[0] = "avocado";
        groceriesList[1] = "toothpaste";
        groceriesList[2] = "toothbrush";
        groceriesList[3] = "windex";
        groceriesList[4] = "pants";

        for (int i = 0; i < groceriesList.length; i++) {
            System.out.println(i + ")" + groceriesList[i]);
            System.out.println(i + 1 + ")" + groceriesList[i]);// giving numbers to items
        }
        /*
        create array of chars
        c o d i n g i s g r e a t
        print codingisgreat
         */
        char[] array = new char[]{'c', 'o', 'd', 'i', 'n', 'g', ' ', 'i', 's', ' ', 'g', 'r', 'e', 'a', 't'};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();

        /*
        create array of strings colors, add 7 colors
        print all colors, if color = yellow, or green do not print
         */
        String[] colors = new String[]{"blue", "yellow", "orange", "green", "white", "black", "red"};

        for (int i = 0; i < colors.length; i++) {
            if (colors[i].equals("yellow") || colors[i].equals("green")) {
                continue;
            }
            System.out.println(colors[i]);
        }
        /*
        break ==> will jump out of loop, don`t come back
        continue==> will skip this iteration
         */

        /*
        create array of ints, {1,2,3,4,5,6,7,8,9,10}
        print all numbers
        if number 3, or equal = 8  do not print
         */
        int [] numbers = new int[]{1, 2, 3, 4, 5, 6, 7,8,9,10};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 3 || numbers[i] == 8) {
                continue;
            }
            System.out.println(numbers[i]);
        }

        /*
        create array of doubles, and assign 10 values
        print all values, except for values from index 5 to 8
        in one line, colon separated 1.99, 2.9, 3.99
         */
       double [] doubles = new double[]{1.99, 2.99, 3.49, 4.5, 5, 6.9, 7.0, 8.1, 9.4, 10.99};

        for (int i = 0; i < doubles.length; i++) {
            if (i >= 5 && i <= 8) {
                continue;
            }
            System.out.println(doubles[i] + ", ");
        }

    }
}
