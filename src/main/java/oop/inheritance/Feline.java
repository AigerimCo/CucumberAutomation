package oop.inheritance;
//import classesAndObjects.User;
public class Feline extends Animal {
    String specie;
    String habitat;
    int age;

    /*
    this.age for example-calling variable
    this() => call constructor from this class
    super() => call constructor from parent class
    this() & super() => cannot use same time, both want to be first
     */

    public Feline(int age) {//constructor
        super(true, "feline", age);
        System.out.println(this.age);
        System.out.println(super.age);

    }
    public Feline(String habitat) {////constructor
        super(true, "feline", 9);
        this.age = 9;
        this.habitat = habitat;
    }
    public Feline(){

    }
    public void meow () {

    }
    public void play () {
            System.out.println(specie + " is playing" + " and " + age + " years old");
            reproduce();
            meow();
            System.out.println(weight);
        }
     public static void main(String[] args) {
            Feline feline = new Feline("Leo");
            feline.eat();
            feline.sleep();

        }
    }


