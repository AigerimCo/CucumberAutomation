package constructors;

public class ConstructorsIntro {
    public ConstructorsIntro(){

        System.out.println("Hello! I am a constructor");
    }

    public ConstructorsIntro(String name){
        System.out.println("Hello " + name + "! This is another constructor with one argument");
    }

    public ConstructorsIntro(String name, int age){
        System.out.println("Hello " + name + " ! I am " + age);
    }


    public static void main(String[]args ){
      ConstructorsIntro object = new ConstructorsIntro();
      ConstructorsIntro object2 = new ConstructorsIntro();
      ConstructorsIntro object3 = new ConstructorsIntro("Codewise");
      ConstructorsIntro object4 = new ConstructorsIntro("Codewise", 1);

        String str = "hello";
        String str2 = new String("hello");


    }


}
