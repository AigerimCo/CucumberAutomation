package random;
/*
Pseudo code for task 2
1. Create class and main method
2. Run a loop between 0 to 99
3. Print every single number on each iteration
4. If the number hits 10,20,30,... just skip
 */
public class SkipNumbers {
    public static void main(String[] args) {
        for(int i = 0; i <=99;i++){
            if(i % 10 == 0) { //  or  ==>      if(i != 0 && i % 10 ==0){
                continue;
            }
            System.out.println(i);
            }
        System.out.println();
        charAppears("I want a vacation!", 'a');
        }
        /*
Write a method that accepts a string(word) and character(letter).
Your method should find how many times that given char appears in the given String.
For examples:
Given word: "Hello, World" and given char is 'o'.
Print "Result: 2"

Pass "esen", 'e'
Result: 2

Solution:
1. Go by letter one by one
2. Check each one if they are equal or not
3. If they are equal then keep counting
4. after loop is done, just print the counter
         */
    public static void charAppears(String str, char c) {
        int counter = 0;
        for(int i = 0; i < str.length(); i++){
            char temp = str.charAt(i);

            if(temp == c){
                counter++;
            }
        }
        System.out.println("Result: " + counter);
    }
    }

