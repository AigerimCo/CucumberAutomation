package beginningPractice;

public class Aquarium {
    public static void main(String[] args) {
        Fish qwerty = new Fish();

        Fish One = new Fish("yellow","ClownFish", 49.99d);
        System.out.println(One.getName());
        One.setName("Nemo");
        System.out.println(One.getName());
        One.setName("Dory");
        System.out.println(One.getName());
        System.out.println(One.getColor());
        One.setColor("red");
        System.out.println(One.getColor());
        System.out.println(One.getName());
        Fish Two = new Fish(true, "shark", 1500);
        Two.setIsPredatory(false);
        System.out.println(Two.getIsPredatory());
        Fish Three = new Fish(false, "dolphin");
        System.out.println(Three.getPrice());
        Three.setPrice(200d);
        System.out.println(Three.getPrice());
        Fish Four = new Fish("green", "Mahi Mahi", 15, 600d);
        System.out.println(Four.getPrice());
        Four.setPrice(150d);
        System.out.println(Four.getPrice());


//        System.out.println("The " + One.color + " " + One.name + " costs " + One.price + " $");
//        System.out.println("It is a fact that is " + Two.isPredatory + " that " + Two.name + " is Predatory fish" + ", and it has a weight of " + Two.weight + " kg");
//        System.out.println("It`s " + Three.isPredatory + " that a " + Three.name + " is predatory fish");
//        System.out.println("A " + Four.color + " " + Four.name + " weights " + Four.weight + " kg " + "and it cost pricey");
    }
}
