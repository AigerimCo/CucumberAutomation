package dataTypes;

public class Cup {
    public static void main(String[] args) {

      Cat.hospitalAddress = "123 main str";

        Cat tom = new Cat("Tom");
        tom.info();
        tom.isVaccinated = true;
        tom.breed = "Hawaiin";
        tom.gender = "Boy";
        tom.info();
        Cat cat1 = new Cat("Katy");
        cat1.gender = "girl";
        cat1.age = 4;
        cat1.owner = "Jane Adams";
        tom.info();
        tom.owner = "John";

        System.out.println(tom.hospitalAddress);
        System.out.println(cat1.hospitalAddress);
        tom.hospitalAddress = "55 wall st";
        tom.age = 1;
      System.out.println(cat1.age);
        System.out.println(cat1.hospitalAddress);
    }
}