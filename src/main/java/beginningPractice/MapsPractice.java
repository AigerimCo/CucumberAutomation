package beginningPractice;

import java.util.*;

public class MapsPractice {
    public static void main(String[] args) {
        HashMap<String, String> hash = new HashMap<>();
        HashMap<Integer, String> hash1 = new HashMap<>();
//        HashMap<Animal, Bird> hash1 = new HashMap<>();

        // Key() работает точно также как и все Set по отношению к уникальности
        // не гарантирует очередность
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("hello", 12);
        hashMap.put("hello", 1223);
        hashMap.put("hello World", 12345);
        hashMap.put("hello agsdg", 3456);
        hashMap.put("dfgsg World", 126546);
        hashMap.put("sgshd World", 12);
        System.out.println(hashMap);
        //method get(take only key) return the value
        int value = hashMap.get("hello World");
        System.out.println(value);

        //method keySet() выявляет список всех ключей которые есть в нашем мапе
        Set<String> keySet = hashMap.keySet();

        System.out.println("----------------------");
        //для того чтобы получить все раздельно мы используем forEach()
        for (String key: keySet){
            System.out.println(key);
        }
        System.out.println("----------------------");

        //method values() выявляет список всех value которые есть в нашем мапе
        Collection<Integer> values = hashMap.values();

        //для того чтобы получить все раздельно мы используем forEach()
        for (Integer val : values) {
            System.out.println(val);
        }

        System.out.println("-----------------------");

        //method entrySet() используется совместно с forEach, это дает нам возможность получать и кей и валуе
        for (Map.Entry<String, Integer> strAndNum : hashMap.entrySet()) {
            System.out.println(strAndNum.getKey() + " " + strAndNum.getValue());
        }

        System.out.println("----------------------");
        boolean response = hashMap.containsKey("hello");
        boolean response1 = hashMap.containsKey("hello how are you");
        System.out.println("hello -> " + response);
        System.out.println( "hello how are you -> " + response1);

        System.out.println("-------------------------");

        System.out.println(hashMap.get("hello"));
        //изменяет только value
        hashMap.replace("hello", 123456789);

        System.out.println(hashMap.get("hello"));
        System.out.println("-----------------------");

        // Удадяет по кей тот object
        hashMap.remove("hello");

        System.out.println("after remove \"hello\" -> " + hashMap);

        System.out.println("---------------------------");

        //method size дает нам размер
        System.out.println("hashMap.size() = " + hashMap.size());

        System.out.println("-------------------------------");

        //isEmpty -> проверяет есть ли какой либо элемент в нашем мапе
        System.out.println("hashMap.isEmpty() = " + hashMap.isEmpty());

        //очищает полностью наш мап
        hashMap.clear();

        System.out.println("hashMap.isEmpty() = " + hashMap.isEmpty());

        System.out.println("-------------------------------");

        //работает такде как и TreeSet есть автосортировкаи и в зависимости от key() оставляет только уникальные
        TreeMap<Integer, String> ssss = new TreeMap<>(Comparator.reverseOrder());
        ssss.put(123123,"fgdh");
        ssss.put(123123,"gds");
        ssss.put(1321,"jhkj");
        ssss.put(3,"s");
        ssss.put(4,"gfd");
        ssss.put(43,"hgj");
        ssss.put(54,"kjk");
        System.out.println(ssss);


        //так же как и в сетах есть default сорт
        TreeMap<Integer, String> ssss1 = new TreeMap<>();
        ssss1.put(2323,"fgdh");
        ssss1.put(2323,"gds");
        ssss1.put(1321,"jhkj");
        ssss1.put(3,"s");
        ssss1.put(4,"gfd");
        ssss1.put(43,"hgj");
        ssss1.put(54,"kjk");


        System.out.println("============================");
//saves order.
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("hello", 23);
        linkedHashMap.put("hellgfdgdso", 543);
        linkedHashMap.put("helhsgdhlo", 47);
        linkedHashMap.put("h", 2365464);
        linkedHashMap.put("hehsdgllo", 76);
        linkedHashMap.put("hfsgs", 6354);
        System.out.println(linkedHashMap);


        // Home Task ->  мы просмотрели все метода Map и использовали все методы только на примере HashMap
        // тоже самое сделать с TreeMap and LinkedHashMap

    }
}
