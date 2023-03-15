package beginningPractice.oopp;

public class Animal {
    private String location;
    private int age;
    private boolean isMammal;

    public Animal() {
    }

    public Animal(String location, int age, boolean isMammal) {
        this.location = location;
        this.age = age;
        this.isMammal = isMammal;
    }

    public Animal(String location, boolean isMammal, int age){
        this.location = location;
        this.isMammal = isMammal;
        this.age = age;
    }
    public Animal(boolean isMammal, String location, int age){
        this.isMammal = isMammal;
        this.location = location;
        this.age = age;
    }
    public Animal(String location){
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "location='" + location + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}

//parent: technologies => child: phone, laptop
//child of child: from phone:Apple, Samsung