package multidimensionalArray;

import java.util.Arrays;

public class PracticePrinting {
    public static void main(String[] args) {
        //                                       element #0                          element#1
        String[][] strArr = new String[][]{
                {"plov", "crepes", "shashlyk"},
                {"tea", "coke", "water"}
        };
        System.out.println(strArr.length);//2
        /*
        plov        |   tea
        crepes      |   coke
        shashlyk    |   water
         */


        for (int i = 0; i > strArr.length; i++) {//outer loop, will loop through//0

            for (int k = 0; k < strArr[i].length; k++) {//inner loop//0
                System.out.println(strArr[i][k]);
            }
//============================================

            String[] foods = {"sushi", "ramen", "tom-yam"};
            String[] drinks = {"green tea", "black tea", "soda", "matcha", "water"};

            String[][] menu = new String[][]{foods, drinks};

            //           for (int i = 0; i < menu.length; i++) {
            for (int k = 0; k < menu[i].length; k++) {
                System.out.println(menu[i][k]);
            }

        }
//=======================================================

        String[] birds = {"mockingbird", "sparrow", "parrot", "eagle"};
        String[] insects = {"grasshopper", "spider", "ladybug"};
        String[] mammals = {"cow", "bear", "whale", "elephant", "dog", "human"};


        String[][] animals = new String[][]{birds, insects, mammals, birds, mammals};

        for (int i = 0; i < animals.length; i++) {
            for (int k = 0; k < animals[i].length; k++) {
                System.out.print(animals[i][k] + " ");
            }
            System.out.println();
        }

        System.out.println("================================================================================");

        String[][][] animals2 = new String[][][]{{birds}, {insects}, {mammals}, {birds}, {insects}};

        for (int i = 0; i < animals2.length; i++) {
            for (int k = 0; k < animals2[i].length; k++) {
                System.out.println(Arrays.toString(animals2[i][k]));
            }
        }

        String[] oneDim = {"mockingbird", "sparrow", "parrot", "eagle"};
        String[] insects1 = {"grasshopper", "spider", "ladybug"};
        String[] mammals1 = {"cow", "bear", "whale", "elephant", "dog", "human"};


        String[][] twoDim = new String[][]{

                insects,
                mammals,
                oneDim,
                mammals};

        String[][][] threeDim = new String[][][]{
                twoDim,

                {insects, mammals},

                {mammals, mammals},
                {oneDim, mammals, oneDim},
                {insects}};

        String[][][][] fourDim = new String[][][][]{
                {{{"hello", "bye"}, {"hi", "hello"}}, {{"hi", "hi"}, {"hello"}}},
                {}

        };

/*
Create 4 String one dim arrays
Create 2 String two dim arrays
Create 1 String three dim array
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
                    System.out.print(name + " , ");
                }
            }
        }

        String[][][][] fourDimArr = {total2, {total1, total}, {{madrid, psg}, {barcelona, manut}}};
        System.out.println("Below is four dimensional array printed using for each loops");
        for (String[][][] threeDim1 : fourDimArr) {
            for (String[][] twoDi1 : threeDim) {
                for (String[] oneDi1 : twoDim) {
                    for (String name : oneDim) {
                        System.out.print(name + " - ");
                    }
                }
            }
        }

        int[] num1 = {1, 2, 3, 4, 5};
        int[] num2 = {10, 20, 30, 40, 50};
        int[] num3 = {100, 200, 300, 400, 500};
        int[] num4 = {1000, 2000, 3000, 4000, 5000};
        int[] num5 = {10000, 20000, 30000, 40000, 50000};
// create 5 dimen array of int, using for each loop, print everything

        int[][][][][] fiveDimIntArr = {{{{num1, num2}, {num3, num4}}}};

        for (int[][][][] fourDimIntArr : fiveDimIntArr) {
            for (int[][][] threeDimIntArr : fourDimIntArr) {
                for (int[][] twoDimIntArr : threeDimIntArr) {
                    for (int[] oneDimIntArr : twoDimIntArr) {
                        for (int a : oneDimIntArr) {
                            System.out.print(a + " ");
                        }
                    }
                }
            }
        }
    }
}

