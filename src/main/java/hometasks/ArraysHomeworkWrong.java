package hometasks;

public class ArraysHomeworkWrong {
    public static void main(String[] args) {

    /*
    3. create 5 arrays for each data type, with different sizes,
    names and values. try to use different declaration methods,
    and using for-loop print all values of one of the arrays of each type.
    3.1 int, 3.3 double 3.5 string,
     */
//============================================================

/*
3.1. create 5 arrays of int with different sizes, names and values.
Print all elements of one array.
 */

     int [] ideas = new int[]{1, 2, 3, 4, 5};

        for (int i = 0; i < ideas.length; i++) {
            System.out.println(ideas[i]);
        }

/*
3.3. create 5 arrays of double with different sizes,
names  and values. Print all elements of one array.
 */
        double [] temperature = new double[]{35.0, 36, 17.7, 38.5, 39};
        for (int x = 0; x < temperature.length; x++)
            System.out.println(temperature[x]);

  /*
  3.2.  create 5 arrays of short with different sizes, names  and values.
        all elements of one array.
   */
       /*
        short [] numbers = {11,22,33,44,55};
        System.out.println(numbers[0]);

        for (int b = 0; b < numbers.length; b++) {
            System.out.println(numbers[11]);
        }
        */

    /*
    3.5. create 5 arrays of String with different sizes,
     names  and values. Print all elements of one array.
     */

            String[] berries = new String[5];
            berries[0]  = "raspberry";
            berries[1]  = "strawberry";
            berries[2]  = "blueberry";
            berries[3]  = "blackberry";
            berries[4]  =  "cranberry";

            for (int a = 0; a < berries.length; a++) {
                System.out.println(berries[a]);
            }}
    }
