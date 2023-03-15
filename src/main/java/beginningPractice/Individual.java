package beginningPractice;

public class Individual {
    public static void main(String[] args) {
        Person first = new Person();
        Person second = new Person();


        first.name = "David";
        first.lastName = "Smith";
        first.age = 20;
        first.height = 180;
        first.isFriendly = true;

        second.name = "Alita";
        second.lastName = "Grey";
        second .age = 18;
        second.height = 171;
        second.isFriendly = false;



        System.out.println(first.getFullName());
        System.out.println(second.getFullName());

        System.out.println(first.getCharacteristics());
        System.out.println(second.getCharacteristics());




        }
    }

