package beginningPractice;

public class Test {
    public static void main(String[] args) {
        Cat bishkek = new Cat();
        bishkek.name = "Garold";
        bishkek.breed = "Scotland";
        bishkek.hasTail = true;
        bishkek.age = 1;
//        bishkek.weight = 12;
        bishkek.color = "white";

        System.out.println(bishkek.name + " " + bishkek.age + " " + bishkek.color);

        Cat osh = new Cat("Tom", 2, "blue", " German", true, 123);
        osh.name = "TEEEST";
        Cat cat = new Cat("Hello",2, "green", " KG", true, 55);

   //     Cat cat1 = new Cat();

        System.out.println(osh.name + " " + osh.age + " " + osh.color);


    }
}
