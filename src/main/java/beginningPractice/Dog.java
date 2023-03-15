package beginningPractice;

public class Dog {
    private String name;
    private String breed;
    private String color;
    private int age;
    private boolean isTrained;
    private boolean isAggressive;

    public Dog(){
    }

    public Dog(String breed, String name,int age, boolean isTrained) {
        this.breed = breed;
        this.name = name;
        this.age = age;
        this.isTrained = isTrained;
    }

     public Dog(String name, String breed, String color, int age){
        this.name=name;
        this.breed = breed;
        this.color = color;
        this.age = age;

        }

    public Dog(String color, String name, boolean isAggressive,int age){
        this.color= color;
        this.name = name;
        this.isAggressive = isAggressive;
        this.age = age;
    }

    public Dog(String color,String name, int age, String breed) {
        this.color = color;
        this.name = name;
        this.age = age;
        this.breed = breed;

    }


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }
    public String getBreed(){
        return breed;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public boolean getIsTrained(){
        return isTrained;
    }

    public void setIsTrained(boolean isTrained){
        this.isTrained = isTrained;
    }
    public boolean getIsAggressive(){
        return isTrained;
    }

    public void setIsAggressive(boolean isAggressive){
        this.isAggressive = isAggressive;
    }

}

//create encapsulation by using getters/setters same as fish class.
//create Monkey class with 10 variables+encapsulation+5 constructors + 4 methods
