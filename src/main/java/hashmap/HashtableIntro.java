package hashmap;

import java.util.Hashtable;

public class HashtableIntro {
    public static void main(String[] args) {

        Hashtable<String, Integer> productPrices = new Hashtable<>();
        productPrices.put("apple", 3);
        productPrices.put("sugar", 5);
        productPrices.put("pepper", 1);
        productPrices.put("avocado", 2);
        productPrices.put("chicken", 6);
        productPrices.put("milk", 4);


        calculateTheSum(productPrices, 2);

    }
/*
if quantity = 2
multiple price by quantity
6+10+20....sum
 */
    public static int calculateTheSum(Hashtable<String, Integer> products, int quantity) {
        int sum = 0;
        for (String key : products.keySet()) {
            sum += products.get(key) * quantity;
        }
        System.out.println("The products to buy: " + products);
        System.out.println("The quantity of each product: " + quantity);
        System.out.println("The total price for the list of products is " + sum);

        return sum;

    }

    }


