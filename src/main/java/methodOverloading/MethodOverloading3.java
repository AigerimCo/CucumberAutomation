package methodOverloading;

public class MethodOverloading3 {
    public static void main(String[] args) {
        isPalindrome("civic");
        isPalindrome("chicago");
        String[]array={"civic","level","lol","madam"};
        String[]array2={"civid","level","lol","madam"};
        System.out.println();
        System.out.println(isPalindrome(array2));
        System.out.println(isPalindrome(array));

    }

    /*
    create a method, which will find if the word is palindrome
    which will take one String, and if this word is palindrome, return true
    return false
    civic ==> civic
    mom ==> mom
     */

    public static boolean isPalindrome(String str){
        String reversed="";
        for(int i=str.length()-1; i>=0; i--){
            reversed+=str.charAt(i);
        }
        //System.out.println(reversed.equals(str));
        return reversed.equals(str);

    }
    public static boolean isPalindrome(String str1, String str2){
        return str1.equals(str2);
    }
    public static boolean isPalindrome(String[]arr){
        for(int i=0; i< arr.length; i++){
            if(!isPalindrome(arr[i])){
                return false;
            }
        }
        return true;
    }

}
