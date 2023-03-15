package beginningPractice;

public class Cat {

    String name;
    String breed;
    int age;
    String color;
    boolean hasTail;
    int weight;

    public Cat() {

    }

    public Cat(String name, int age, String color, String breed, boolean hasTail, int weight) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.hasTail = hasTail;
        this.weight = weight;
    }

    public Cat(String name, String color, String breed, boolean hasTail) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.hasTail = hasTail;
        this.weight = weight;
    }
}



