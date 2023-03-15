package arrays;

public class ArrayIntro {
    public static void main(String[] args){
        //                       0          1        2       3
        String[] animals = {"elephant", "giraffe", "wolf", "lion"};
        String animal1 = animals[0];
        String animal2 = animals[1];
        String animal3 = animals[2];
        String animal4 = animals[3]; // if more than 3, we see outOfBounderError

        System.out.println(animals[1]); // elephant
        System.out.println(animals[2]); // wolf
        System.out.println(animals[10-8+1]); // lion
        System.out.println(animals[animals.length -2]); //wolf

        //fibonacchiNumber= it's a sum of two previous numbers : 3,5,8 (3+5=8)
        int [] fibonacciNumbers = {1,1,2,3,5,8,13,21,34,55};

        int num1 = fibonacciNumbers [2]; //2
        int[] fibonacchiNumbers = new int[0];
        num1 = fibonacchiNumbers [5]; //8
        int num2 = fibonacchiNumbers [0];//1
       int num3 = fibonacciNumbers[fibonacchiNumbers.length - 5];
       System.out.println(num3);

        // =============================
        String [] cities = new String [5];
        System.out.println(cities[0]); // null because no values yet

        cities[0] = "Los Angeles";
        cities[1] = "Paris";
        cities[2] = "Rome";
        cities[3] = "Dubai";
        cities[4] = "Tokyo";

        System.out.println(cities[0]);

        for(int i = 0; i < cities.length; i++){
            System.out.println(cities[i]);

        }

       cities [3]  = "Kuala-Lumpur";//changed Dubai to Kuala Lumpur

        String [] countries; //declared array of strings
        countries = new String[] {"USA", "Argentina", "Italy", "Japan", "", null, "Ukraine"};//7 elements
        countries[6] = "Singapore";
        countries[5] = "Kazakhstan";



         double [] price = {1.99, 2.99, 3.99, 20.99, 99.99};
        long[] longArray = {1343, 36677, 235, 545, 646, 6366, 99};
        boolean[] booleanArr ={true, true, false, true, false};
         char charArr [] = {'w', 'h', 'y', 'c', 'o', 'l', 'd', '?'};
        char c = 65535;
        short [] shortArray = {44,33,22,55,77,88};

        int lengthOfNames = 9;
        String[]names = new String[lengthOfNames];

        byte lengthOfLastNames = 9;
        String [] lastNames = new String[lengthOfLastNames];

        double[] prices = new double[0];
        for (int i = 0; i < prices.length; i++){
            System.out.println(prices[4]);
        }
        double d = prices[1]; //2.99

        //================================

        String [] berries = new String [5];
                ////     or
        String [] fruits = new String []{"","","","",""};

        int[] nums = new int[5];
        int[] newNums = new int[]{0,1,2,3,4};

        int[]inArr = {1,2,3,4,5};

        int[]byteArr = {5,7,2,10};

        boolean[] booleanArr1 = {true, true,false};

        char [] charArr1 = {'a','?','4','C'};

    }
}

