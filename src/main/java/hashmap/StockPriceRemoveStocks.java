package hashmap;

import java.util.HashMap;
////////////ERROR FIX IT
public class StockPriceRemoveStocks {
    public static void main(String[] args) {

        HashMap<String, Double> stocks = new HashMap<>();
        stocks.put("apple", 400.90);
        stocks.put("banana", 100.90);
        stocks.put("pineapple", 800.90);
        stocks.put("grapes", 200.90);
        stocks.put("veggies",150.9);
        stocks.put("strawberries",200.01);

        System.out.println(removeStocks(stocks,200));

    }
    public static HashMap<String, Double> removeStocks(HashMap<String, Double> stocks,double minPrice){
        HashMap<String, Double> newStocks = new HashMap<>();
        for(String key : stocks.keySet()){
            if(stocks.get(key)<=minPrice){
                stocks.remove(key);
            }
        }
        return newStocks;
    }
}
