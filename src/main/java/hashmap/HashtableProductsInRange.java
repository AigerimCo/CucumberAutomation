
/*
package hashmap;

import java.util.Hashtable;

public class HashtableProductsInRange {
    public static void main(String[] args) {

        Hashtable<String, Integer> productPrices = new Hashtable<>();
        productPrices.put("apple", 3);
        productPrices.put("sugar", 5);
        productPrices.put("pepper", 1);
        productPrices.put("avocado", 2);
        productPrices.put("chicken", 6);
        productPrices.put("milk", 4);

        getProductsInRange(productPrices, 1,4);
        getProductsInRange(productPrices, 2,-45);
        getProductsInRange(productPrices, -56,45);
        getProductsInRange(productPrices, 45,34);
        getProductsInRange(productPrices, 33,100);

    }

    /*
    int beginRange = 2
    int endRange = 5
    return hashtable of products in the given range inclusively
     */

    /*
    create a method that return a hashtable with products in the given range
    and includes only those products that start with "a"

    hashtable  can have products out of the given range,if product name starts with "p".
     */
/*
    public static Hashtable<String, Integer> getProductsInRangeAndWithLet
    (Hashtable<String, Integer> products, int beginRange, int endRange) {



        public static Hashtable<String, Integer> getProductsInRange(Hashtable<String, Integer> products, int beginRange, int endRange) {
            if (beginRange >= 0 && endRange <= 100) {
                if (beginRange < endRange) {
                    Hashtable<String, Integer> newProduct = new Hashtable<>();

                    for (String key : products.keySet()) {
                        if (products.get(key) <= beginRange && products.get(key) >= endRange) {
                            newProduct.put(key, products.get(key));
                        }
                    }
                    System.out.println(newProduct);
                    return newProduct;
                } else {
                    System.out.println("Sorry, incorrect range was given. Give the true range");
                }
                return null;
            } else {
                System.out.println("Given range is not between 0 and 100");
            }
            return null;
        }
    }
  /*

 */