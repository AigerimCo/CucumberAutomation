package stringManipulation;

public class Replace {
    public static void main(String[] args) {
        /*
        replace(), takes 2 chars, and replaces the first one
        with second one, and returns new String
         */

        String city = "Alabama";
        System.out.println(city.replace('a', 'e')); //Alebeme - here it replace only lower cases

        System.out.println(city.toLowerCase().replace('a', 'e')); //elebeme
        System.out.println(city.toUpperCase().replace('a', 'e')); //ALABAMA
        System.out.println(city.toUpperCase().replace('L', 'e')); //AeABAMA

//        ==================

        String numbersAndChars = "Hello 2023! ***Happy N3w Y3ar****";
        System.out.println(numbersAndChars.replace('*', '!')); //Hello 2023! !!!Happy N3w Y3ar!!!!
        System.out.println(numbersAndChars); //Hello 2023! ***Happy N3w Y3ar****(cause we didn`t save it)

//        ========= we can also replace strings

        String cake = "honeycake";
        System.out.println(cake=cake.replace("honey", "chocolate "));//chocolate cake
        System.out.println(cake); // chocolate cake
        System.out.println(cake = cake.replace("chocolate", "honey")); //honeycake


    }
}


