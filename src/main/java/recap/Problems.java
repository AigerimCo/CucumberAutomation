package recap;

public class Problems {
    public static void main(String[] args) {
        System.out.println(isPalindrome("mom"));
        System.out.println(isPalindrome("mama"));
        System.out.println(isPalindrome("civic"));

        countX("hello", "hellohihi");
    }

    //palindrome is a word, if you read this word from end to beginning it will be same word.
    /*
    mama ==> amam
    mom ==>mom
    dad ==> dad
    civic ==> civic
    madam==>madam
     */


    public static boolean isPalindrome(String str) {
        //create temp String, in that string store letters from str
        //but start from end, compare str with temp string

        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {

            reversed = reversed + str.charAt(i);
        }
        return reversed.equals(str);
    }

        /*
        given two strings: a and b, if a contains b = return true, if b contains a = false
         */

    public static boolean ifContains(String a, String b) {
        if (a.contains(b)) {
            return true;
        } else if (b.contains(a)) {
            return false;
        }
        return false;
    }

    /*
    given two strings: x and y, count number of times
    x is found in y, return this integer
    x = hello, y = hiHelloGoodHello
    return 2
    use for loop, loop through all letter, substring counter++
     */
    public static int countX(String x, String y) {
        int count = 0;
        for (int i = 0; i <= y.length() - x.length(); i++) {
            if (y.substring(i, i + x.length()).equals(x)) {
                count++;
            }
        }

        System.out.println(count);
        return count;
    }
}

  



