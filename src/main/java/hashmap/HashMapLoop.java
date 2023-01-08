package hashmap;

import java.util.Arrays;
import java.util.HashMap;

public class HashMapLoop {
    public static void main(String[] args) {
        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("Rahul", 30);
        ages.put("Patel", 48);
        ages.put("Chitra", 32);
        ages.put("Deepak", 12);
        ages.put("Suresh", 50);
        ages.put("Chandramouli", 45);
        ages.put("Padmanbhan", 65);

        /*
        print ages - print values
         */

        /*
        keySet(), returns the set of keys
         */

        for (String name : ages.keySet()) {
            System.out.println(ages.get(name));

        }
        /*
        print names = print keys
         */

        for (String name : ages.keySet()) {
            System.out.println(name);

        }

        //=================================

        String userName1 = null;
        int age1 = 0;

        for (String name : ages.keySet()) {
            if (name.equals("Rahul")) {
                userName1 = name;
                age1 = ages.get(name);
            }
        }
        System.out.println("Name: " + userName1 + "   Age: " + age1);


/*
create array of names
 */

        String[] names = new String[ages.keySet().size()];
        int i = 0;
        for (String name : ages.keySet()) {
            names[i] = name;
            i++;
        }

        System.out.println(Arrays.toString(names));
    /*
    create and print array of ages
     */

        int[] arrayOfAges = new int[ages.size()];

        int k = 0;
        for (String name : ages.keySet()) {
            arrayOfAges[k] = ages.get(name);
            k++;
        }
        System.out.println(Arrays.toString(arrayOfAges));

        System.out.println("Just printing the hashmap itself: " + ages);
        System.out.println("Printing the entrySet of the map: " + ages.entrySet());

        /*
        KeySet() returns a collection of keys, while
        entrySet() returns a collection of keys and values
         */

        HashMap<String, String> fruitsAndVegetables = new HashMap<>();
        fruitsAndVegetables.put("apple", "fruit");
        fruitsAndVegetables.put("carrot", "vegetable");
        fruitsAndVegetables.put("pear", "fruit");
        fruitsAndVegetables.put("cabbage", "vegetable");

        /*
        print fruits:
         apple
         pear
         */
        for (String key : fruitsAndVegetables.keySet()) {
            if (fruitsAndVegetables.get(key).equals("fruit")) {
                System.out.println(key);

            }
           /*
            print :
           vegetable: cabbage
            */
        }
        for(String key:fruitsAndVegetables.keySet()){
            if(fruitsAndVegetables.get(key).equals("vegetable")){
                System.out.println("vegetable: " + key);

            }
        }
        HashMap<String, String> words = new HashMap<>();
        words.put("window","house");
        words.put("brick","house");
        words.put("rain","nature");
        words.put("water","swimming");
        words.put("association","organization");
        words.put("software","system");

        /*
        1.Print the values with length <=5
        length() <=5: house
        2. print the values with length >=7
        length() >=7: swimming
        3.print keys that start with letter a, or b, or c
        starts with a or b or c: word
        4. print keys that end with letter 2, or o
        ends with e or o: word
         */
        for(String key : words.keySet()){
            if(words.get(key).length() <= 5) {
                System.out.println("length <= 5: " + words.get(key));
/*
length <= 5: house
length <= 5: house
 */
            }
        }
        for(String key : words.keySet()){
            if(words.get(key).length() >= 7){
                System.out.println("length >= 7: " + words.get(key));
 /*
 length >= 7: organization
length >= 7: swimming
*/
            }
        }
        for(String key: words.keySet()){
            if(key.startsWith("a") || key.startsWith("b") || key.startsWith("c")){
                System.out.println("key starts with a,b or c: " + key);
                /*
key starts with a,b or c: association
key starts with a,b or c: brick
                 */
            }
        }
        for(String key: words.keySet()){
            if(key.endsWith("e") || key.endsWith ("o")){
                System.out.println("ends with e or o: " +key);
                //ends with e or o: software
            }
        }

    }
}