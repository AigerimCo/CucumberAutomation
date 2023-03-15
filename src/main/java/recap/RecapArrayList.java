package recap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RecapArrayList {
    public static void main(String[] args) {
        //array of Strings. Arrays can store both primitives and objects
        String[] arrayOfBerries = new String[3];
        arrayOfBerries[0] = "blackberry";
        arrayOfBerries[1] = "blueberry";
        arrayOfBerries[2] = "mulberry";
        System.out.println(Arrays.toString(arrayOfBerries));
        System.out.println(arrayOfBerries.length);

        //arrayList can only store objects,it`s resizable
        ArrayList<String> listOfBerries = new ArrayList<>();
        listOfBerries.add("cherry");//0
        listOfBerries.add("strawberry");//1
        listOfBerries.add("raspberry");//2
        System.out.println(listOfBerries);//[cherry, strawberry, raspberry]
        System.out.println(listOfBerries.size());//returns the number of elements inside array
        listOfBerries.remove(1);//remove element by index number
        System.out.println(listOfBerries.size() + " " + listOfBerries);
        listOfBerries.remove("cherry");
        System.out.println(listOfBerries);//remove element by value

        listOfBerries.add("golden cherry");
        listOfBerries.add("Californian blueberries");

        //     0           1           2                 3
        //[raspberry, watermelon, golden cherry, Californian blueberries]
        listOfBerries.add(1, "watermelon");
        System.out.println(listOfBerries);

        boolean hasStrawberry = listOfBerries.contains("strawberry");//true if element is there, and false if not
        System.out.println(hasStrawberry);//false => it starts from lower case

        System.out.println(listOfBerries.contains("golden cherry"));//true
        System.out.println(listOfBerries.contains("blueberries"));//false
        System.out.println(listOfBerries.contains("Californian blueberries ".trim()));//true (trim is removing space)

        System.out.println(listOfBerries);
        System.out.println(listOfBerries.get(1));//take index number and return element from that index
        System.out.println(listOfBerries.size() - 1);//Californian blueberries
        System.out.println(listOfBerries.get(10 + 5 - 12));//3= Californian blueberries

        listOfBerries.set(0, "sweet raspberry");//updates the element at given index
        System.out.println(listOfBerries);

        listOfBerries.clear();//it removes all elements from the list
        System.out.println(listOfBerries.size());

        boolean IsEmpty = listOfBerries.isEmpty();//returns true if list is empty,and false if not
        //     System.out.println(isEmpty); //true



        listOfBerries.add("cherry");//0
        listOfBerries.add("strawberry");//1
        listOfBerries.add("raspberry");//2
        listOfBerries.set(4, "potato");
        System.out.println(listOfBerries);


        ArrayList<String>toDoList = new ArrayList<>(listOfBerries);
        System.out.println(toDoList);
        Object obj = listOfBerries.clone();//it turned arrayList to object
        System.out.println(obj.toString());//we turned object to String

        for(int i = 0; i < listOfBerries.size();i++){
        System.out.println("berry #" + i + " " + listOfBerries.get(i));

            ArrayList<Boolean>boolList = new ArrayList<Boolean>();
            boolList.add(true);
            boolList.add(false);
            boolList.add(true);
            boolList.add(false);
            boolList.add(true);
            boolList.add(true);

            int a = 0;
            String str = " ";
            do {
                str += boolList.get(a) + ", ";
                a = a + 1;
            }while(a < boolList.size());
            System.out.println(str);

            str = str.substring(0, str.length() - 2);
            System.out.println(str);


            //1 to 10
            ArrayList<Integer> numbers = new ArrayList<>();

            int b = 1;

            while (b <= 10) {
                numbers.add(b);
                b++;
            }
            System.out.println(numbers);

            /*
            String money = "$ = 1,2,3,4,5,6,7,8,9,10 = $;
             */
            for (int num : numbers){


//create string arraylist with todolist
        ArrayList<String> homePlan = new ArrayList<>();
        toDoList.add("general cleaning");
        toDoList.add("cooking");
        toDoList.add("studying");
        toDoList.add("eating");
        toDoList.add("watching TV");
        System.out.println(toDoList.size());

  //  create double arraylist with prices
        ArrayList<Double> prices = new ArrayList<>();
        prices.add(125.99);
        prices.add(129.99);
        prices.add(135.99);
        prices.add(560.99);
        prices.add(258.99);
        prices.add(620.99);
        System.out.println(prices.size());

 //convert array to arrayList
        Double [] abc = {22.0,44.50,66.66,77.7,88.0,99.5};
        System.out.println(Arrays.toString(abc));
        System.out.println("The size of double is: " + abc.length);

        ArrayList<Double> abcd = new ArrayList<>(Arrays.asList(abc));
        System.out.println(abcd);
        System.out.println();


 //  create integer arraylist with houseNumbers
        ArrayList<Integer> houseNumbers = new ArrayList<>();
        houseNumbers.add(111);
        houseNumbers.add(123);
        houseNumbers.add(456);
        houseNumbers.add(752);
        houseNumbers.add(555);
        System.out.println(houseNumbers.size());

//create a boolean arraylist with true false values
      ArrayList<Boolean>ifFoodDelicious = new ArrayList<>();
      ifFoodDelicious.add(true);
      ifFoodDelicious.add(false);
/*
                use for each loop to print integer arrayList
                use while loop to print double arrayList
                use do while loop to print boolean arrayList
         */
        }


}
    }
}
