package dataTypes;

public class Cat {

    // instance variable
    //the information or data that belongs or that describes the object
    //of this class
    String name;
    int age;
    String breed;
    boolean isVaccinated;
    String owner;
    String gender;
    static String hospitalAddress;

    public Cat(String name){
        this.name=name;
        //because java prefers the local first
    }
    public void info(){
        System.out.println("\n Cat Information");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Breed: " + this.breed);
        System.out.println("Owner: " + this.owner);
        System.out.println("Vaccinated: " + this.isVaccinated);
        System.out.println("Gender: " + this.gender);
    }
}
