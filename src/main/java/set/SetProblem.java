package set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetProblem {
    public static void main(String[] args) {
      String [] names = {"January","January","february","march"};
        System.out.println(convertArrayToSet(names));

      SetProblem setProblem = new SetProblem();
        ArrayList<Integer>num = new ArrayList<>();
        num.add(12);
        num.add(1);
        num.add(8);
        System.out.println(setProblem.convertArray2(num));

        Set<String>set = new HashSet<>();
        set.add("Alina");
        set.add("Nazima");
        set.add("Meerim");
        System.out.println(Arrays.toString(setProblem.convertSetToArray(set)));

        Set<Integer>set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        Set<Integer>set2 = new HashSet<>();
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        set2.add(8);

  //      set1.retainAll(num);
  //      System.out.println(set1);

        findSameElements(set1,set2);


    /*
    create public static method which accepts Array of Strings,
    and puts only unique elements into Set<String>
    and returns Set<String>.
     */

    }
    public static Set<String> convertArrayToSet(String[]array){
    Set<String> set = new HashSet<>();
        for(int i = 0; i < array.length;i++){
            set.add(array[i]);
        }return set;
    }

    /*
    create private instance method which accepts ArrayListTest of Integers
    and returns only unique numbers as Set<Integer>
     */
    private Set<Integer>convertArray2(ArrayList<Integer>number) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < number.size(); i++) {
            set.add(number.get(i));
        }
        return set;
    }
    /*
    create protected instance method which takes set of String
    converts Set to Array of Strings
    and return Array Of Strings
     */
    protected String[]convertSetToArray(Set<String>set){
        String []array = new String[set.size()];
        int i = 0;
        for(String q : set){
            array[i] = q;
            i++;
        }
        return array;
    }

    /*
    create a method which accepts 2 sets of Strings
    and output only those elements which exist in both sets
       Example:input
      set1 = [1,2,3,4,5]
    set2 = [4,5,6,7,8]
    output [4,5]
     */

    public static void findSameElements(Set<Integer>set1,Set<Integer>set2){
        set1.retainAll(set2);
        System.out.println(set1);
    }

}
