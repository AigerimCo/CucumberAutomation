package recap;

public class RecapSubstring {
    public static void main(String[] args) {

        /*
        substring (int beginIndex) can be used only by String
        it will take one int, and cut your string starting from that index until the end
        and return that new String
         */

  //                   0123455678910111213
        String text = "Welcome to Chicago!";
        String city = text.substring(11); //===>Chicago
        System.out.println(city);

        /*
        substring(int beginIndex, int endIndex),can be used only by string
        it takes 2 ints: the beginning index and ending index
         */
        String fullName = "Johny Johnson Depp";
        String firstName = fullName.substring(0,5);
        System.out.println(firstName);






String welcomeSign = "Hello everyone, welcome to United States";

 /*
 String country = "United States"
 String welcome = "welcome"
 String who = "everyone"
 String comma = ","
 String hello = "Hello"
 String welcome2 = "welcome to United States"
 String firstPart = "Hello everyone"

  */


 String country = welcomeSign.substring(27);
        System.out.println(country);

        String welcome = welcomeSign.substring(16,23);
        System.out.println(welcome);

        int beginIndex = welcomeSign.indexOf("everyone"); //6+8=
        int endIndex = beginIndex + "everyone".length();

        String who = welcomeSign.substring(welcomeSign.indexOf(beginIndex, endIndex));
        System.out.println(who);

        String comma = welcomeSign.substring(14,15);
        System.out.println(comma);

        comma = welcomeSign.substring(welcomeSign.indexOf(","));
        System.out.println(comma);

        String animals = "dog, cat, monkey";

        /*
        String dog = "dog",
        substring

        String cat = substring(indexOf, length)
         */

        String dog = animals.substring(0,3);
        System.out.println(dog);

        String cat = animals.substring(animals.indexOf("cat") + "cat".length());
        System.out.println(cat);

        String monkey = animals.substring(animals.indexOf("monkey"));
        System.out.println(monkey);




        String rules = "IndexOf method returns us index of the given char";

        /*
        String method = "method" ==> substring(index of, length)
        int lengthOfRules = the number of character the rules String has
        String returns = "returns"
        String of = "Of of"
        String char = "char"
        String indexOfWord = "IndexOf"
         */

        String method = rules.substring(rules.indexOf("method"),rules.indexOf ("method") + "method".length());

        int lengthOfRules = rules.length();
        System.out.println(lengthOfRules);

        String returns = rules.substring(rules.indexOf("returns"), rules.indexOf("returns") + "returns".length());
        System.out.println(returns);

        String of = rules.substring(5,7) + " " + rules.substring(rules.indexOf("of"), rules.indexOf("of") + 2);
        System.out.println(of);

        String charC = rules.substring(rules.length()-4);
        System.out.println(charC);


    }
}
