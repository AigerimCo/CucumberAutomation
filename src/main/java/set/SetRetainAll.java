package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetRetainAll {
    public static void main(String[] args) {

        /*
        collection1.retailAll(collection2)=>is used to remove all elements
        from collection1 that do not exist in collection2
         */

        List<String> cities1=new ArrayList<>();
        cities1.add("Monaco");
        cities1.add("Tashkent");
        cities1.add("Kuala Lumpur");

        List<String>cities2 = new ArrayList<>();
        cities2.add("Tashkent");
        cities2.add("Rome");
        cities2.add("Michigan");

        cities1.retainAll(cities2);//===> true
        System.out.println(cities1);//==> Tashkent
        System.out.println(cities2);//==> Tashkent,Rome,Michigan

        //==============================================
        Set<Integer> set1 = new HashSet<>();
        Set<Integer>set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        set2.add(4);
        set2.add(5);
        set2.add(1);
        set2.add(6);
    }
}
