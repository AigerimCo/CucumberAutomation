package stringManipulation;

public class LowerUpperCase {

    //====================== toLowerCase (), toUP  erCase()
    // These areString methods, that convert text to all lower case, or all upper case

    public static void main (String [] args) {
        String shop1 = "Amazon";
        String shop2 = "amazon";

        boolean isSame;


        isSame = shop1. equals(shop2);
        System.out.println("Amazon is same as amazon; " + isSame); // false


        shop1 = shop1.toLowerCase(); // Amazon ---> amazon
        isSame = shop1.equals(shop2);
        System.out.println("amazon is same as amazon; + isSame"); //true


        String car1 = "MERCEDES";
        String car2 = "Rolls Royce";
        String car3 = "MercedeS";
        String car4 = "rolls royce";

        isSame = car1.equals(car3.toUpperCase());// true - MERCEDES.equals(MERCEDES)

        System.out.println("car1: "+ car1);
        System.out.println("car2: "+ car2);
        System.out.println("car3: "+ car3);
        System.out.println("car4: "+ car4);

        car3 = car3. toUpperCase();
        System.out.println(car3); //MERCEDES

        System.out.println(car3 + " " + car1); // MERCEDES MERCEDES

        car1 = car1.toLowerCase();
        car3 = car3.toLowerCase();

        System.out.println(car3 + " " + car1); // mercedes mercedes

        System.out.println("RoLLs RoyCE".equals(car4));  // false- RoLLs RoyCE .equals rolls royce
        System.out.println("RoLLs RoyCE".toLowerCase().equals(car4)); //true -because we converted to lower case

        System.out.println("ChiCaGo".equals("chIcAgO")); //false
        System.out.println("ChiCaGo".toUpperCase().equals("chIcAgO".toUpperCase())); // true


       /// =================equalIgnoreCase()

        System.out.println("ChiCaGo".equals("chIcAgO")); //false
        System.out.println("ChiCaGo". equalsIgnoreCase ("chIcAgO")); // true

        String person1 = "Brad Pitt";
        String person2 = "Brad pitt";

        boolean isPitt = person2.equals(person1);
        System.out.println("isPitt: " + isPitt); // false

        isPitt = person2.equalsIgnoreCase(person1);
        System.out.println("isPitt: " + isPitt); //true

        isPitt = person2.equals(person1.toUpperCase());
        System.out.println("isPitt: " + isPitt); // false

        isPitt = person2.toLowerCase().equals(person1.toUpperCase());
        System.out.println("isPitt: " + isPitt); // false

        isPitt = person2. toLowerCase(). equalsIgnoreCase(person1.toUpperCase());
        System.out.println("isPitt: " + isPitt); //true

    }
}
