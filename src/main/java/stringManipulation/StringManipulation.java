package stringManipulation;

///import classesAndObjects.Animal;

///import java.util.list;
public class StringManipulation {
    public static void main (String [] args) {

        String name1 = "John";
        String name2 = "Johnson";

        boolean isEqual = name1 == name2;
        System.out.println(isEqual); //false

        String city1 = "Chicago";
        String city2 = "Miami";
        isEqual = city1 == city2;
        System.out.println ("Chicago == Miami: + isEqual"); //false

        String newCity = new String ("Chicago");
        isEqual = city1 == newCity;
        System.out.println("Chicago == new Chicago; + isEqual"); //false - because on line 20 there is a keyword new.

             //==========================

        String cake1 = "honeycake";
        String cake2 = "cheesecake";
        String cake3 = "HoneyCake";
        String cake4 = "cheesecake";
        String cake5 = new String ("cheesecake");

        boolean isSameCake = cake1 == cake2;
        System.out.println("honeycake is same as cheesecake" + isSameCake); // false

        isSameCake = cake1 == cake3;
        System.out.println("honeycake is same as HoneyCake" + isSameCake);//false-lowercase and uppercase are not same

        isSameCake = cake2 ==cake4;
        System.out.println("cheesecake is same as cheesecake; " + isSameCake);//true

        isSameCake = cake4 ==cake5;
        System.out.println("cheesecake is same as cheesecake; " + isSameCake);//false- cake 5 - has a new keyword

        // ============================equals () method from String class
        // it only compares values
        //it can be used by String only
        //it is a method returns boolean: true or false


        isSameCake = cake4.equals (cake5);
        System.out.println(isSameCake);

        System.out.println("USA".equals(new String("USA"))); //true-equals compare only values: USA & USA
        System.out.println(" hello Codewise".equals("hello Codewise"));//false -  before first word there is a space

        String animal = "elephant";
        System.out.println(animal.equals("animal"));//false - different words

        String animal2 = "lion";
        System.out.println(animal2.equals("Lion"));//false - there are  uppercase and lowercase Lion & lion

        String animal3 = new String ("Lion");
        System.out.println(animal2.equals("animal3"));//false

        System.out.println(animal3.equals("Lion")); // true - Lion = Lion

        System.out.println(animal2 == "lion"); // true - lion is not a new object

        String animal4 = new String ("lion");
        System.out.println(animal2 == "animal4"); //false - lion has a new keyword

        //What is a difference between .equals and ==

        int a = 3;
        int b = 2;
        int c = 3;
         boolean isEq = a == b; //false
         isEq = a == c; //true



    }

}
