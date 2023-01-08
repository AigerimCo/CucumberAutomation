package hashmap;

import java.util.HashMap;

public class HashMapIntro {
    public static void main(String[] args) {

        HashMap<String, String> antonyms = new HashMap<>();
        antonyms.put("cold", "hot");
        antonyms.put("long", "short");
        antonyms.put("hard", "soft");
        antonyms.put(null, "no data");
        antonyms.put("table", null);
        antonyms.put("screen", null);

        System.out.println(antonyms);
        System.out.println(antonyms.get("longi"));//null because its not exist
        System.out.println(antonyms.get("hard"));
        System.out.println(antonyms.get("cold"));
        System.out.println(antonyms.get("null"));//null,because no null string key
        System.out.println(antonyms.get(null));

        System.out.println(antonyms.size());
        /*
        Hashmap is unordered collection. Elements do not have indexes/ positions inside the hashmap.

        if you provide nonexistent key in get () method, hashmap returns null
         */

        /*
        Create HashMap, productPrice <String,Double>
        add 5 elements
        print all elements in one Line
        print 2 elements
        print size
         */


    /*
    HashMap<String, Double> productPrice = new HashMap<>();
      productPrice.put("Bread”,2.99);
      productPrice.put("Milk”,4.99);
      productPrice.put("Eggs”,3.49);
      productPrice.put("Potato”,1.58);
      productPrice.put("Carrots”,0.49);
      productPrice.put("Avocado”,4.99);

      System.out.println(productPrice);
      System.out.println(productPrice.get("Bread”));
      System.out.println(productPrice.get("Milk”));
      System.out.println(productPrice.size());

     */
        /*
        You can copy another hashMap by putting it in
        parentheses while hashmap declaration
         */
     //   HashMap<String,String>fullName = new HashMap<>(antonyms);

        /*
        HashMap, <String, Byte> numbers

        numbers.get("ONE)=>1
        numbers.get("TWO)=>2
        until 5
         */

        /*
        HashMap, <Integer, Integer> decimals
        decimals.get(1)=>100
        decimals.get(2)=>200
        10 => 1000
         */
        HashMap<Integer,Integer>decimals = new HashMap<>();
        decimals.put(1,100);
        decimals.put(2,200);
        decimals.put(3,300);
        decimals.put(4,400);
        decimals.put(5,500);
        decimals.put(6,600);
        decimals.put(7,700);
        decimals.put(8,800);
        decimals.put(9,900);
        decimals.put(10,1000);

        boolean contains = decimals.containsKey(2);//true
        System.out.println(contains);

        System.out.println(decimals.containsKey(500));//false
        System.out.println("10000-9000: " + decimals.containsValue(10000-9000));
        System.out.println((decimals.containsKey(null)));//false
        System.out.println(decimals.containsKey(decimals.get(1) - 99));//true
        System.out.println(decimals.containsKey(decimals.get(9)));

        System.out.println("decimals: " + decimals);
        System.out.println("decimals size: " + decimals.size());

        decimals.remove(2);
        decimals.remove(15);//non-existing key, nothing will happen

        System.out.println("printing 2: " + decimals.get(2));
        decimals.put(11,1100);

        System.out.println("decimals size: " + decimals.size());

        System.out.println("removing all values");
        decimals.clear();//remove all values
       System.out.println("decimals size: " + decimals.size());


/*
entry and value are same things
 */
        HashMap<Double,Integer>nums = new HashMap<>();
        nums.put(1.99,9);
        nums.put(1.99,1);
        nums.put(2.99,2);
        nums.put(2435.9,2);
        nums.put(129.3,2);

        System.out.println("nums: " + nums);

        HashMap<Integer,String> orders = new HashMap<>();
        orders.put(4, "four");
        orders.put(10, "ten");
        orders.put(1343, "sdbvs");
        orders.put(5744452, "rfef");
        orders.put(0, "abc");

        System.out.println("orders: " + orders);
    }
}
