package stringManipulation;

public class Contains {
        public static void main (String [] args) {

    /*
    contains () method comes from String class, and can only be used by String
    it checks if one string contains another string
     */

            String slogan = "Chicago is a windy city";
            String city = "Chicago;";

            boolean doesItContain = slogan.contains("city");
            System.out.println(doesItContain); // true

            doesItContain = slogan.contains("windy");
            System.out.println(doesItContain); //true

            doesItContain = slogan.contains("win");
            System.out.println(doesItContain);//true   it contains win in a word windy

            doesItContain = slogan.contains("s a");
            System.out.println(doesItContain);//true

            doesItContain = slogan.contains("y");
            System.out.println(doesItContain);//true - it contains w

            doesItContain = slogan.contains("Chicago city windy a is");
            System.out.println(doesItContain); //false


           String company = "GOOGLe";
           String website = "google";

           boolean b = company.contains(website);
            System.out.println("boolean b: " +b);//false - difference of upper and lower letters

            b = company.contains(website.toUpperCase());
            System.out.println(b); // false -  GOOGLe == GOOGLE

            b = company.toLowerCase().contains(website);
            System.out.println(b); //true - website == website




        }
}
