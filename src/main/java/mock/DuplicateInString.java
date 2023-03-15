package mock;

public class DuplicateInString {
    //7.	Write a Java program to find duplicate characters in String.
    public static void main(String[] args) {
        System.out.println(findDuplicate("doberman"));
    }

    public static String findDuplicate(String str) {

        String duplicates = "";
        for (int i = 0; i < str.length(); i++) {
            for(int j = i + 1; j < str.length();j++){
                if(str.charAt(i) == str.charAt(j)){
                    duplicates += str.charAt(i);
                }
            }

        }
        return duplicates;
    }
}

