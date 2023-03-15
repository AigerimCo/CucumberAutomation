package hometasks;

import java.util.ArrayList;

public class ArrayListLoops {

    public static void main(String[] args) {

//   1. Create an ArrayListTest of 10 fruits

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("pear");
        fruits.add("lemon");
        fruits.add("kiwi");
        fruits.add("orange");
        fruits.add("mango");
        fruits.add("pineapple");
        fruits.add("peach");
        fruits.add("honeydew");

        int i = 1;
        for (String fruit : fruits) {
            System.out.println(i + " fruit - " + fruit);
            i++;
        }

//2. Create <String> of 10 vegetables, print all vegetables using do while loop.

        ArrayList<String> vegetables = new ArrayList<>();
        vegetables.add("potatoes");
        vegetables.add("tomatoes");
        vegetables.add("asparagus");
        vegetables.add("onion");
        vegetables.add("cucumbers");
        vegetables.add("corn");
        vegetables.add("carrot");
        vegetables.add("pepper");
        vegetables.add("cauliflower");
        vegetables.add("broccoli");

        int a = 0;
        do {
            System.out.println(vegetables.get(a));
            a++;
        } while (a < vegetables.size());


// 3. Create ArrayListTest<String>of 10 cities, print  all cities using while loop.

  ArrayList<String> cities = new ArrayList<>();
        cities.add("New York");
        cities.add("London");
        cities.add("Dubai");
        cities.add("Miami");
        cities.add("Bishkek");
        cities.add("Tokyo");
        cities.add("Paris");
        cities.add("Seoul");
        cities.add("Chicago");
        cities.add("Destin");

    int b = 0;
        while (b < cities.size()) {
            System.out.println(cities.get(b));
            b++;
        }

//4. Create ArrayListTest<String> of 10 foods, print all foods using for loop

        ArrayList<String> foods = new ArrayList<>();

        foods.add("manty");
        foods.add("oromo");
        foods.add("lagman");
        foods.add("kuurdak");
        foods.add("plov");
        foods.add("crepes");
        foods.add("kotlety");
        foods.add("varenniki");
        foods.add("beshbarmak");
        foods.add("pelmeni");

        for (int c = 0; c < foods.size(); c++) {
            System.out.println(foods.get(c));
        }
    }
}
