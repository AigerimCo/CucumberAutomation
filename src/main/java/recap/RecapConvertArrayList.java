package recap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecapConvertArrayList {
    public static void main(String[] args) {
        ArrayList<String> furniture = new ArrayList<>();
        furniture.add("chair");
        furniture.add("table");
        furniture.add("sofa");
        furniture.add("lamp");
        furniture.add("bed");
        /*
        convert ArrayListTest to Array
         */
        String[] arrayOfFurniture = new String[furniture.size()];
        furniture.toArray(arrayOfFurniture);
        System.out.println(Arrays.toString(arrayOfFurniture));

        /*
        convert Array to ArrayListTest
         */
        ArrayList<String> furniture2 = new ArrayList<>(Arrays.asList(arrayOfFurniture));
    /*
    create in array of odd numbers until 9
    convert to integer arraylist
    convert print all values using do while loop
    */


        int[] array = new int[]{1, 3, 5, 7, 9};
//ArrayListTest<Integer>numList = stream(array).boxed().collect(Collectors.toList)
        List<Integer> xeniyaList = new ArrayList<>(array.length);
        for (Integer i : array) {
            xeniyaList.add(i);
        }
        System.out.println("xeniyalist: " + xeniyaList);

        /*
        int i = 0;
        do {
            System.out.println("Aya " + numlist.get(i));
            i++;
        } while (i < numlist.size());
         */

        ///=================================

        Boolean[] boolArray = new Boolean[]{true, true, false, true, false};
        ArrayList<Boolean> boolList = new ArrayList<>(Arrays.asList(boolArray));

        for (int a = 0; a < boolList.size(); a++) {
            System.out.println(boolList.get(a));
        }
        Boolean [] b2Array = new Boolean[]{};
    //furniture.toArray(b2Array)
        int p = 0;
        while(p < b2Array.length){
            System.out.println(b2Array[p]);
            p++;
        }


    }

    }
