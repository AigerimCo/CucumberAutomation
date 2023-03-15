package recap;

import java.util.HashMap;
public class RecapHashMap {
    public static void main(String[] args) {
/*
HashMap is unordered collection of data
in key=value format
*/
        HashMap<String, String> animals = new HashMap<>();
        animals.put("lion", "Africa");
        animals.put("bear", "Canada");
        animals.put("polar bear", "Antarctica");
        animals.put("salmon", "Norway");

// animals.get("salmon") ==> "Norway"
// animals.get("bear") ==> Canada

        System.out.println(animals);

/*
remove(), will remove one pair of data
will return true if item is removed, false if not
*/
        animals.remove("bear");
        System.out.println(animals);

        boolean b = animals.remove("salmo", "Norway");
        System.out.println(b);

/*
get(key), it will return value
*/
        System.out.println(animals.get("polar bear"));

/*
put(key, value), it will create new key=value pair in HashMap
if the same key already exists in the map. it will update the value to new one
*/

        animals.put("lion", "Nigeria");
        System.out.println(animals);

/*
hashMap can only have unique keys,
if you out existing key, it will just update to new value

hashMap can have duplicate values
*/

        animals.put("hippo", "Nigeria");
        animals.put("giraffe", "Nigeria");
        animals.put("giraffe", "USA");
        animals.put("giraffe", "Canada");
        animals.put("giraffe", "Niger"); //this will remain in hashmap

        System.out.println(animals);


/*
size() returns the number of key=value pairs
*/
        System.out.println(animals.size());

/*
clear(), removes all keys and values from hashmap
*/
// animals.clear();
        System.out.println("animals: " + animals); //=====> animals: {}

/*
replace(key, newValue)
replaces the value of the given key to new value
*/
        animals.replace("salmon", "Alaska");
        System.out.println(animals);
        animals.replace("salmon new fish", "Alaska", "USA"); //will not replace, since there is no salmon new fish
        System.out.println(animals);

/*
containsKey(key) returns true if key exists,
and false if key is not there;
*/
        boolean isKey = animals.containsKey("hippo"); //true
        System.out.println(isKey);

        isKey = animals.containsKey("whale");
        System.out.println(isKey); //false

        System.out.println(animals.containsKey("Alaska")); //false, Alaska is the value, not key

/*
containsValue(value), returns true if value is there,
else false
*/
        boolean isValue = animals.containsValue(" ");
        System.out.println(isValue); //false

        isValue = animals.containsValue("Nigeria");
        System.out.println(isValue); //true

        System.out.println(animals.containsValue("lion")); //false, lion is key

/*
isEmpty(), returns true if map is empty,
else false
*/
        System.out.println(animals.isEmpty()); //false
        animals.clear(); //remove all keys and values
        System.out.println(animals.isEmpty()); //true

/*
HashMap can store null
null - is a default value of any object
HashMap can store only one null key, (because key must be unique)
and multiple null values
*/

        animals.put(null, "Japan");
        animals.put("koala", null);
        animals.put("ant", null);
        animals.put(null, null);
        System.out.println(animals);
        animals.put("sheep", "Australia");
        animals.put("panda", "China");

/*
to access values/keys of hashmap,
use for each loop

keySet(), returns a collection of keys
values(), returns a collection of values
*/
//printing keys
        for (String key : animals.keySet()){
            System.out.println("key: " + key);
        }

        for(String str : animals.keySet()){
            System.out.println(animals.get(str));
        }


        for (String str : animals.values()){
            System.out.println("value: " + str);
        }

/*
clone() clones the hashmap keys and values, and returns them as Object
*/
        HashMap<String, String> animals2 = (HashMap<String, String>) animals.clone();
        System.out.println(animals2);


    }
}
