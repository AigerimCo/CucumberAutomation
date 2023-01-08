package multidimensionalArray;

public class PracticePrinting2 {
    public static void main(String[] args) {
        String[] numbers = {"12", "45", "56", "234"};
        String[] words = {"sun", "earth", "jupiter", "moon"};

        String[][] twoDimenArr = {numbers, words};
        /*
        use for loop to print the values
        12,45, 56,234
        sun, earth, jupiter, moon

         */
        for (int i = 0; i < twoDimenArr.length; i++) {
            for (int k = 0; k < twoDimenArr[i].length; k++) {
                System.out.println(twoDimenArr[i][k] + " ");

            }
        }
        /*
        print only words, no numbers
        sun, earth, jupiter, moon
         */


        for (int k = 0; k < twoDimenArr[1].length; k++) {
            System.out.println(twoDimenArr[1][k] + " ");
        }

        System.out.println();
        for (int k = 0; k < twoDimenArr[0].length; k++) {
            System.out.println(twoDimenArr[0][k] + " ");

        }
        /*
        Arrays.toString(arrName)=>only works with one dim arrays
         */

        String[] toDoList = {"grocery shopping", "clean house", "study", "play with kids", "go out with friends"};

        /*
        FOR EACH LOOP works with collections
        for each loop works with primitive and non primitives data types
         */

        for (String task : toDoList) {
            System.out.println("inside for each loop: " + task);
        }
        int[] arr = {12, 2, 3, 4, 5, 5, 8};

        for (int a : arr) {
            System.out.println(a);
        }
        /*
        create one dimensional double array and print using for each loop
         */
        double[] prices = {20, 400, 3.9, 2, 9.4};

        for (double cost : prices) {
            System.out.println(cost);
        }
        //===================================
        /*
        create 4 string arrays
        and put them all inside one two dimensional array
        using loop,print all values
        inside for loop create for each loop
         */
        String[] girlNames = {"Haley", "Aurora", "Miley"};
        String[] boyNames = {"Bob", "Tom", "Rick"};
        String[] colors = {"black", "white", "red"};
        String[] seasons = {"summer", "winter", "spring"};

        String[][] twoDimArr = {girlNames, boyNames, colors, seasons};

        for (int i = 0; i < twoDimArr.length; i++) {
            for (String str : twoDimArr[i]) {
                System.out.println(str + " ");
            }
            System.out.println();
        }
        //=============================
        /*
        create 4 String one dim arrays
        create 2 string two dim arrays
        create 1 string three dim array
        print everything using for loop and for each loop
         */
        String[] madrid = {"modric", "ronaldo", "carlos"};
        String[] barcelona = {"messi", "pedro", "pique"};
        String[] psg = {"messi", "mbappe", "neymar"};
        String[] manut = {"sko", "kok", "pop"};

        String[][] total = {madrid, barcelona};
        String[][] total1 = {psg, manut};
        String[][][] total2 = {total, total1};
        for (int i = 0; i < total2.length; i++) {
            for (int k = 0; k < total2[i].length; k++) {
                for (String name : total2[i][k]) {
                    System.out.println(name + " , ");
                }
            }
        }

        String [][][][] fourDimArr = {total2,{total1,total}, {{madrid, psg},{barcelona,manut}}};
        System.out.println("Below is four dimensional array printed using for each loops");
        for(String [][][] threeDim : fourDimArr){
            for(String [][] twoDim: threeDim){
                for (String [] oneDim: twoDim ){
                    for(String name: oneDim){
                        System.out.println(name+ " - ");
                    }
                }

            }
        }
    }
}





