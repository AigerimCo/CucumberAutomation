package hashmap;

import java.util.HashMap;

public class StockPriceAverage {
    public static void main(String[] args) {

        HashMap<String, Double> stocks = new HashMap<>();
        stocks.put("apple", 400.90);
        stocks.put("banana", 100.90);
        stocks.put("pineapple", 800.90);
        stocks.put("grapes", 200.90);

        findTheAveragePrice(stocks);
    }

    public static double findTheAveragePrice(HashMap<String, Double> stocks) {
        double average = 0;
        double sum = 0;
        for (String x : stocks.keySet()) {
            sum += stocks.get(x);
        }
        average = sum / stocks.size();
        System.out.println(average);

        return average;
    }
}