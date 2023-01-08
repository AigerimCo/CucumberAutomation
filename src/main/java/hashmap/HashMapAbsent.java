package hashmap;

import java.util.HashMap;

public class HashMapAbsent {
    public static void main(String[] args) {
        HashMap<String, String> catOwners= new HashMap<>();
        catOwners.put("Tom","Mira");
        catOwners.put("Garfield", "Aisuluu");
        catOwners.put("Akzholtoi","Saikal");
        catOwners.put("Myimyi", "Myrzakhan");


        System.out.println("The size: " + catOwners.size());
        System.out.println("Cat Owner" + catOwners);

        catOwners.putIfAbsent("Arti","Alina");
        System.out.println("The size: " + catOwners.size());
        System.out.println("Cat Owner" + catOwners);

        catOwners.putIfAbsent("Ginger","Alina");
        System.out.println("The size: " + catOwners.size());
        System.out.println("Cat Owner" + catOwners);

        /*
        print only cats:
        cat #1:
        cat #2:
         */
        int i=1;
        for(String cats:catOwners.keySet()){
            System.out.println("cat # " + i + " " + cats);
          i++;
        }
     /*
     cat #1: Tom, owner #1: Mira
     cat #2: Arti, owner #2: Alina
     */
        int j = 1;
        for (String cat: catOwners.keySet()){
            System.out.println("Cat # " + j + " " + cat + ", Owner # " + j + " " + catOwners.get(cat));
            j++;
        }

        for (String catOwnerName: catOwners.values()){
            System.out.println( "cat owner name: " + catOwnerName);
        }
        catOwners.replace("Arti", "Ilgiz");
        System.out.println(catOwners);

      /*
        Object copy = null;
        copy = catOwners.clone();
        System.out.println(copy);
        //{Arti=Ilgiz, Tom=Mira, Ginger=Alina, Garfield=Aisuluu, Akzholtoi=Saikal, Myimyi=Myrzakhan}
       */

    }

}
