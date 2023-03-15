package beginningPractice;

import java.util.ArrayList;

public class StringArrayList {
    public static void main(String[] args) {

        ArrayList<String> furniture = new ArrayList<>();
        furniture.add("couch");
        furniture.add("bed");
        furniture.add("TV stand");
        furniture.add("table");
        furniture.add("bookshelf");

        System.out.println(furniture);
        System.out.println("=============");
        System.out.println("1. FROM BEGINNING TILL END ");

        for (int i = 0; i < furniture.size(); i++) {
            System.out.println(furniture.get(i) + " ");
        }
        System.out.println("========================  2. FROM THE END TILL BEGINNING (REVERSE)=======");


        for (int a = furniture.size() - 1; a >= 0; a--) {
            System.out.println(furniture.get(a));
        }
        System.out.println("=================  3. FROM BEGINNING TILL MIDDLE==========");

        for (int b = 0; b <= furniture.size() / 2; b++) {
            System.out.println(furniture.get(b));
        }
        System.out.println("=====================  4. FROM MIDDLE TILL THE END==================");


        for (int c = furniture.size() / 2; c < furniture.size(); c++) {
            System.out.println(furniture.get(c));
        }
        System.out.println("====================  5.REVERSE FROM BEGINNING TILL MIDDLE===============");


        for (int d = furniture.size() / 2 - 1; d >= 0; d--) {
            System.out.println(furniture.get(d));
        }
        System.out.println("==================  6.REVERSE FROM MIDDLE TILL THE END=================");
        for (int e = furniture.size() - 1; e >= furniture.size() / 2; e--) {
            System.out.println(furniture.get(e));

        }

    }
}







/*
for (int i = 0; i < 5; i++) {
            String str = "Furniture " + (i + 1);
            furniture.add(str);
        }

        System.out.println(furniture);
 */