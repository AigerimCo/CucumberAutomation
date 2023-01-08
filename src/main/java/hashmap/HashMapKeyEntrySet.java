package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapKeyEntrySet {
    public static void main(String[] args) {
        HashMap<Integer, String> numbers = new HashMap<>();
        numbers.put(10, "ten");
        numbers.put(20, "twenty");
        numbers.put(30, "thirty");
        numbers.put(40, "forty");

        //print only keys
        for (Integer key : numbers.keySet()) {
            System.out.println(key);
        }
//===========================================
        //print only values
        for (Integer key : numbers.keySet()) {
            System.out.println(numbers.get(key));
        }
      /*
      10-ten
      20-twenty
      30-thirty
       */

        for (Integer key : numbers.keySet()) {
            System.out.println(key + " - " + numbers.get(key));
        }
        /*
        ENTRYSET () returns a set of key values
        (key - value) = (entry)
         */
        for (Map.Entry<Integer,String > entry: numbers.entrySet());
//        System.out.println(entry + ",");

    }
}

