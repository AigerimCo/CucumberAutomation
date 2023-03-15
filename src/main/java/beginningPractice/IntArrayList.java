package beginningPractice;

import java.util.ArrayList;

public class IntArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(110);
        numbers.add(220);
        numbers.add(330);
        numbers.add(440);
        numbers.add(550);

        System.out.println(numbers);
        System.out.println("=============");
        System.out.println("1. FROM BEGINNING TILL END ");

        for (int i = 0; i < numbers.size(); i++) {
            if (i == 0){
                System.out.print("[");
            }

            System.out.print(numbers.get(i) + ", ");
            if (numbers.size() - 1  == i){
                System.out.print("]");
            }
        }
        System.out.println();
        System.out.println("========================  2. FROM THE END TILL BEGINNING (REVERSE)=======");

        for (int a = numbers.size() - 1; a >= 0; a--) {
            System.out.println(numbers.get(a));
        }
        System.out.println("=================  3. FROM BEGINNING TILL MIDDLE==========");

        for (int b = 0; b <= numbers.size() / 2; b++) {
            System.out.println(numbers.get(b));
        }
        System.out.println("=====================  4. FROM MIDDLE TILL THE END==================");


        for (int c = numbers.size() / 2; c < numbers.size(); c++) {
            System.out.println(numbers.get(c));
        }
        System.out.println("====================  5.REVERSE FROM BEGINNING TILL MIDDLE===============");


        for (int d = numbers.size() / 2 - 1; d >= 0; d--) {
            System.out.println(numbers.get(d));
        }
        System.out.println("==================  6.REVERSE FROM MIDDLE TILL THE END=================");
        for (int e = numbers.size() - 1; e >= numbers.size() / 2; e--) {
            System.out.println(numbers.get(e));

        }
    }


}
