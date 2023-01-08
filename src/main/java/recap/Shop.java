package recap;

public class Shop {
    public static void main(String[] args) {

        Cat object1 = new Cat();
        Cat object2 = new Cat();

      object1.breed = "persian";
      object1.color = "white";
      object1.age = 1;
      object1.price = 499.99;

      object2.breed = "british";
      object2.color = "gray";
      object2.age = 2;
      object2.price = 999.99;

      object1.eats();
      object1.sleep();

        object2.eats();
        object2.sleep();

        object1.eats();
        object1.sleep();
        object1.tellPrice();

        object2.sleep();
        object2.tellPrice();

    }


}
