package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetIntro {
    public static void main(String[] args) {

           /*
        FIFO - first in, first out
        LIFO -last in, first out

         */
        Set<String> usernames = new HashSet<>();

        usernames.add("abc123");
        usernames.add("botirovna");
        usernames.add("baitikkv");
        usernames.add("aibolinho");
        usernames.add("orozonova");

        System.out.println(usernames);

        System.out.println(usernames.contains("bena"));//false
        System.out.println(usernames.contains("abc123"));//true
        System.out.println(usernames.contains("baitikkv".trim()));

        System.out.println((usernames.isEmpty()));//false

       // usernames.clear();

        System.out.println(usernames.size());

        usernames.remove("aibolinho");
        System.out.println(usernames);

        Object [] array = (String [])usernames.toArray();
        System.out.println(Arrays.toString(array));

     HashSet<String>usernames2 = new HashSet<>();
     usernames2.add("sweetmoon");
     usernames2.add("alina456");
     usernames2.add("aidaiAkalia");
     usernames2.add("baitikkv");
     usernames2.add("botirovna");

     usernames.addAll(usernames2);//added all elements from username2 to usernames
        System.out.println(usernames);
    }
}
