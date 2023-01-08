package recap;

public class RecapConstructorOverloading {
    public RecapConstructorOverloading(String name){
        /*
        inside constructor, you can write any logic ,code
        but the goal, the mission of the constructor is
        to create a new object/ instance of the class
         */
        System.out.println("hello, this is constructor. My name is " + name);

    }
 //   public RecapConstructorOverloading(int age, String )

    public static void main(String[] args) {
        RecapConstructorOverloading recap = new RecapConstructorOverloading("Aisuluu");

    }
}
