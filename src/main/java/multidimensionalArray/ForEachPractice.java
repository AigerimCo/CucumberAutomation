package multidimensionalArray;

public class ForEachPractice {
    public static void main(String[] args) {
        String [] planets = {"Earth","Mars","Jupiter","Venera","Uranus"};
        String [] continents = {"North America","South America","Asia","Europe", "Africa"};
        String [] country = {"Switzerland","Namibia", "Germany","Japan","Angola"};
        String [] cities = {"Zurich", "Win-hook","Berlin","Tokyo","Luanda"};
        //**create 4 dimen array of string,using for each loop,print everything

        long [] population = {2500000, 5000000, 88000000, 130000000,4000000};
        long [] numbers = {111111,2222,33333,444,555555,66666};
        //**create 2 dimen array of longs,using for each loop,print everything

        int[] num1 = {1,2,3,4,5};
        int [] num2 = {10,20,30,40,50};
        int[] num3 = {100,200,300,400,500};
        int [] num4 = {1000,2000,3000,4000,5000};
        int [] num5 = {10000, 20000,30000,40000,50000};
        //**create 5 dimen array of int,using for each loop, print everything

        int[][][][][] fiveDimIntArr = {{{{num1,num2}, {num3,num4}}}};

        for (int [][][][] fourDimIntArr: fiveDimIntArr){
            for (int[][][] threeDimIntArr:fourDimIntArr){
                for(int[][] twoDimIntArr:threeDimIntArr){
                    for(int[] oneDimIntArr: twoDimIntArr){
                        for(int a: oneDimIntArr){
                            System.out.println(a + " ");
                        }
                    }
                }
            }
        }
    }
}
