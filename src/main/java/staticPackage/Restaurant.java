package staticPackage;

public class Restaurant {
    public static void main(String[] args) {
        Cook cook1 = new Cook("Ramsey Gordon");
        Cook cook2 = new Cook ("Salt Bae");
        Cook cook3 = new Cook("Burak");

        cook1.washHand();
        cook2.prepareSalad();

        cook1.takeOrder("rib eye steak");
        System.out.println(cook2.order);//rib eye steak

        Cook.takeOrder("pasta");
        cook2.takeOrder("fettucini");

        System.out.println(cook1.order);
    }

    /*
    create 2 class
    create 3 instant variables
    3 static variables
    2 instant methods
    2 static methods

    call from different class
     */
}
