package recap;

public class Cat {


    String breed; //persian, abyssinian,laperm
    String color;
    byte age;
    double price;


    //eats
    //white persian cat

    public void eats(){
        // white persian cat is eating
        System.out.println(color + " " + breed +  " cat is eating");
    }

    public void sleep(){
        System.out.println(color + " " + breed + " cat which is " + age + " years old sleeping");
    }

    public void tellPrice(){
        System.out.println(color + " " + breed  + " costs " + price + " dollars");
    }


}
