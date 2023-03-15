package beginningPractice;

public class Shelter {
    public static void main(String[] args) {

        Dog doggy = new Dog();

    Dog dog1 = new Dog("German", "Balto", 2, true);
        System.out.println(dog1.getName());
        dog1.setName("Axle");
        System.out.println(dog1.getName());

        System.out.println(dog1.getIsTrained());
        dog1.setIsTrained(false);
        System.out.println(dog1.getIsTrained());

    Dog dog2 = new Dog("Snowy", "Maltese", "white", 1);
        System.out.println(dog2.getColor());
        dog2.setColor("cream");
        System.out.println(dog2.getColor());

        System.out.println(dog2.getBreed());
        dog2.setBreed("Husky");
        System.out.println(dog2.getBreed());

    Dog dog3 = new Dog("brown", "Bailey", false, 4);
        System.out.println(dog3.getIsAggressive());
        dog3.setIsAggressive(true);
        System.out.println(dog3.getIsAggressive());

    Dog dog4 = new Dog("black", "Arlo", 3, "Labrador");
        System.out.println(dog4.getAge());
        dog4.setAge(5);
        System.out.println(dog4.getAge());


// System.out.println("This is " + dog1.breed + " " + dog1.name + ", it is " + dog1.age + " years old " + ",and it`s " + dog1.isTrained + " that it`s Trained");
// System.out.println("This is " + dog2.name + ", it`s " + dog2.breed + ", it has a color of " + dog2.color + ", it`s " + dog2.age + " year old");
// System.out.println("This is " + dog3.color + " " + dog3.name + ",it`s " + dog3.isAggressive + " that it`s aggressive " + ", it`s " + dog3.age + " years old");
// System.out.println("This is " + dog4.color + " " +  dog4.name + ", it is " + dog4.age + " years old " + ", and it's a " + dog4.breed);

    }
}
