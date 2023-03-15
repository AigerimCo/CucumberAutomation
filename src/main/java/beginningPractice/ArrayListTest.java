package beginningPractice;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {

//        ArrayList<String> cars = new ArrayList<>();
//        cars.add("volvo");
//        cars.add("BMW");
//        cars.add("Mercedes");
//        cars.add("Tesla");
//        cars.add("Ford");
//
//        for (int i = 0; i < cars.size(); i++) {
//        System.out.println(cars.get(i));
//        }
//
//        String[] colors = {"white", "black", "red", "yellow", "white"};
//        for (int i = 0; i < colors.length; i++) {
//            System.out.println(colors[i]);
//        }

        ArrayList<Integer> nums = new ArrayList<>();
        for(int i = 0; i <= 100; i+=3){
            nums.add(i);
        }
        System.out.println(nums.size());



//        for(int i = 100; i >= 0; i--){
//            System.out.println(i);
//        }
        for(int a = 0; a < nums.size(); a++){
            System.out.println(nums.get(a));
        }

        System.out.println("====================================");

        String [] animals = new String[]{"bear","fox","deer","racoon","wolf"};

        ArrayList<String> animals1 = new ArrayList<>();
         for(int i = 0; i < animals.length;i++){
             System.out.println(animals[i]);
             animals1.add(animals[i]);

         }
        System.out.println(animals1);


 //create 2  arrayLists ==>   String ;  int
 //using for loops from beginning till end for both arrayLists
 // using for loops from end till beginning for both
 //using loops from beginning till middle
        //using loops from middle to end
        //using loops make reverse from beginning till middle
        //using loops make reverse from middle till end

    }
}

