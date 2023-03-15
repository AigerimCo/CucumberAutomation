package problemSolving;

import java.util.HashMap;
import java.util.Map;

public class FindLetterOccurence {


        public static HashMap<String, Integer> letterOccurrence(String word){
            return null;
        }


        public static void main(String[] args) {
            FindLetterOccurence findLetterOccurence = new FindLetterOccurence();
            findLetterOccurence.add(2,5);

            System.out.println(findLetterOccurence.instanceVariable);
            System.out.println(staticVariable);

            multiplication(2, 4);

        }

        int instanceVariable = 10;
        static int staticVariable = 20;


        /*
        create a method which takes 2 ints, and return the sum of 2 ints
        */
        int add(int a, int b){
            return a + b;
        }


        /*
        create a method which takes 2 int, and return the multiplication
        */
        static int multiplication(int a1, int b1){
            return a1 * b1;
        }


        /*
        create a method, that takes two strings
        and returns concatenated string
        */
        String concatenate(String a2, String b2){
            return a2 + b2;
        }

        /*
        create a method, that takes 3 strings,
        and return them as array of strings
        */
        String [] str(String a, String b, String c){
            String [] arr = new String[]{a,b,c};
            return arr;
        }





        void instanceMethod(){
            String s = concatenate("str", "str");
            int a = add(2,3);
            staticMethod();
        }


        static void staticMethod(){
            FindLetterOccurence f = new FindLetterOccurence();
            f.concatenate("str", "str");
            f.add(2,3);
        }

/*

1. when variable/method has the keyword STATIC in their declaration, it
means that it belongs to the class

2. if variable/method doesn't have keyword static, it means it is instance member
it belongs to object

3. you can call instance variables/methods directly without creating object
inside instance method

4. you CANNOT call instance variables/methods directly without creating object
inside STATIC method

5. you can call both static and instance methods directly without creating object
inside STATIC method

*/



        public static Map<Character, Integer> findLetterOccurance(String word){
            Map<Character, Integer> map = new HashMap<>();

            for (int i = 0; i < word.length(); i++){
                int counter = 0;

                for(int j = 0; j < word.length(); j++){
                    if (word.charAt(i) == word.charAt(j)){
                        counter++;
                    }
                }

                map.put(word.charAt(i), counter);
            }
            System.out.println(map);
            return map;
        }



        public static Map<Character, Integer> findLetterOccuranceInArr(Character [] array){
            Map<Character, Integer> map = new HashMap<>();

            for (int i = 0; i < array.length; i++){
                int counter = 0;
                for (int j = 0; j < array.length; j++){
                    if (array[i] == array[j]){
                        counter++;
                    }
                }
                map.put(array[i], counter);
            }

            System.out.println(map);
            return map;

        }

    }

