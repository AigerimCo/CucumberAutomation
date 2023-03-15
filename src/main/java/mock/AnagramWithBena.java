package mock;

public class AnagramWithBena {

    public static void main(String[] args) {
        anagram("hello", "oll he");
        //hello
        //ollhe
        System.out.println(anagram("hello", "oll he"));

    }
    private static boolean anagram(String word1, String word2){

        word1 = word1.toLowerCase().replace(" ","");
        word2 = word2.toLowerCase().replace(" ","");
        if(word1.length() != word2.length()){
            System.out.println("Not anagram");
            return false;
        }
        //return;=> terminates method execution no matter where you are

        for(int i = 0; i < word1.length();i++){
            char eachLetter = word1.charAt(i);
            int firstWordLetter = findOccurrence(word1,eachLetter);
            int secondWordLetter = findOccurrence(word2,eachLetter);

            if(firstWordLetter != secondWordLetter){
                System.out.println("not anagram");
            }
        }
        return false;
    }
    //create a method that finds the amount of letters in the given String and returns

    public static int findOccurrence(String word, char c){
        int occurrence = 0;
        for(int i = 0; i < word.length(); i++){

        }
        return occurrence;
    }
}
