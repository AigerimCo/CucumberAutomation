package oop.inheritance;

public class Animal {

    boolean isMammal;
    String type;
    int age;

    static int weight;

    public Animal(boolean isMammal, String type, int age) {

        this.isMammal = isMammal;
        this.type = type;
        this.age = age;

    }
    /*
           children animal class
           elephants, insects, snakes

           children feline class;
           cat,tiger,lion

           canine: dog/wolf
            */
     public Animal(){
         System.out.println("this is default constructor that doesn`t accept any parameters");

     }

    public void eat() {


    }

    public void reproduce() {


    }

    public void sleep() {
        System.out.println(new Feline(9));

    }
}
