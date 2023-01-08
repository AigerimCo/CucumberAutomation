package stringManipulation;

public class Trim {
    public static void main(String[] args) {
        String shop = " Amazon";
        System.out.println(shop); // _Amazon -has space before word
        System.out.println(shop.trim()); // Amazon-trim removed space

        String anotherShop = "      Whole Foods    ";
        System.out.println("anotherShop's length; " + anotherShop.length()); //21 chars starting from 1 with space
        System.out.println(shop.trim());//11 counted only letters without spaces


        System.out.println(anotherShop);
        anotherShop = anotherShop.trim();
        System.out.println("anotherShop's length: " + anotherShop.length());

        String shop3 = "   M   arianos     shop   "; // M   arianos     shop
        System.out.println(shop3.trim()); // M   arianos     shop ==> it removes spaces beginning and end,but not in between
        System.out.println(shop3.trim().replace(" ", ""));//Marianosshop

        //M  arianos   shop

        shop3 = shop3.trim();
        shop3 = shop3.replace(shop3.charAt(1)+"", "");
        System.out.println(shop3); // didnt finish

    }

}
