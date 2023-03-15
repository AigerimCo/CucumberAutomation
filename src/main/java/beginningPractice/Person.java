package beginningPractice;

public class Person {
    String name;
    String lastName;
    int age;
    int height;
    boolean isFriendly;
    public Person(){

    }
    public Person(int age, String name, String lastName, boolean isFriendly){
     this.age = age;
     this.name = name;
     this.lastName = lastName;
     this.isFriendly = isFriendly;
    }

   public String getFullName(){
       return "the person`s name is  "  + this.name + " " + this.lastName;
   }

   public String getCharacteristics(){
       return name + " is " + age + " years old " + "has " + height + "cm of height";
   }


}
