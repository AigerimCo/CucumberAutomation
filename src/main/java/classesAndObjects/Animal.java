package classesAndObjects;

public class Animal {

    String type;
    String color;
    String size;
    String name;
    byte age;
    boolean isMammal;

    public void eats() {
        System.out.println(color + " " + size + "" + type + "is eating");

    }

    public void sleeps() {
        System.out.println(color + " " + size + "" + type + "is sleeping");

    }

    public void plays() {
        System.out.println(color + " " + size + "" + type + "is playing");

    }

    // means return
    public boolean isMammal() {

        return true;

    }

    /*RETURN TYPES
    void
    int
    short
    byte
    boolean
    String
    double
    float
     */

    public String getName(){
        String name = "Bambi";
        return name;
    }

    public int getAge(){
        return age;

    }
}
