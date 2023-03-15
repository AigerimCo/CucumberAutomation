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
     int [] ideas = new int[]{1, 2, 3, 4, 5,};

        for (int i = ideas.length-1; i >= 0;i--) {
            System.out.println(ideas[i]);
        }



        int [] numberOfIdeas = new int[5];
        numberOfIdeas[0]  = 111;
        numberOfIdeas[1]  = 222;
        numberOfIdeas [2]  = 333;
        numberOfIdeas [3]  = 444;
        numberOfIdeas [4]  = 555;
        System.out.println(numberOfIdeas[0]);
        for(int a = 0; a < ideas.length; a++ ){
            System.out.println(numberOfIdeas[a]);
        }



        /*
        int [] arrayOfIdeas = {1,11,22,33,44,55,66};
        System.out.println(arrayOfIdeas[5]);


        int NumOfIdeas [] = {6,7,8,9,10,11};

 */

/*
3.3. create 5 arrays of double with different sizes,
names  and values. Print all elements of one array.
 */
        double [] temperature = new double[]{35.0, 36.2, 17.7, 38.5, 39.6};
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

        System.out.println(berries[0]);
            for (int a = 0; a < berries.length; a++) {
                System.out.println(berries[a]);
            }
    }
    }
