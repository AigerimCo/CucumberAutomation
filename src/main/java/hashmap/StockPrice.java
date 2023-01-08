package hashmap;

import java.util.HashMap;

public class StockPrice {
    public static void main(String[] args) {
    /*
    apple,400.90
    tesla,1200.32
    meta,300.43
    bofa,5.5
    slack,123.54
    mcDonalds,98.12

    return the highest stock price
     */

        HashMap<String, Double> stock = new HashMap<>();
        stock.put("apple", 400.90);
        stock.put("tesla", 1200.32);
        stock.put("meta", 300.43);
        stock.put("bofa", 5.5);
        stock.put("slack", 123.54);
        stock.put("mcDonald`s", 98.12);

findTheHighestPrice(stock);
    }

    public static double findTheHighestPrice(HashMap<String, Double> stocks) {
        double highest = 0;
        for (String key : stocks.keySet()) {
            if (stocks.get(key) > highest) {
                highest = stocks.get(key);
            }
        }
        System.out.println(highest);
        return 0.0; // or return highest;
    }


        }


