package hometasks;

public class Cake {

    String name;
    String flavor;
    float weight;
    double price;
    int calories;

    public void bakes() {
        System.out.println(name + " costs " + price + " contains " +  flavor + " has " + weight + " lbs " + " freshly " + "baked");
    }
    public void decorates(){
        System.out.println(name + " costs " + price + " contains " + flavor + " has " + weight + " lbs " + " decorates " + " with berries ");
    }
    public void adds(){
        System.out.println(name + " costs " + price + " contains " + flavor + " has " + weight + " lbs " + " food coloring " + " added ");
    }
    {

    }

}

    class Bakery {
    public static void main(String[] args){

        Cake object1  = new Cake();
        Cake object2 = new Cake();
        Cake object3 = new Cake ();

        object1.name = "HoneyCake";
        object1.flavor = "Honey";
        object1.weight = 2.205f;
        object1.price = 39.99d;
        object1.calories = 450;

        object2.name = "TuxedoCake";
        object2.flavor = "Chocolate";
        object2.weight = 3.307f;
        object2.price = 59.99d;
        object2.calories = 600;

        object3.name = "TiramisuCake ";
        object3.flavor = "Coffee";
        object3.weight = 4.409f;
        object3.price = 49.99d;
        object3.calories = 550;

        object1.bakes();
        object1.decorates();
        object1.adds();

        object2.bakes();
        object2.decorates();
        object2.adds();

        object3.bakes();
        object3.decorates();
        object3.adds();
    }
}
