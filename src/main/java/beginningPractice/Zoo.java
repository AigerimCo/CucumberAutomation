package beginningPractice;

public class Zoo {
    public static void main(String[] args) {

        //      Monkey moonkey = new Monkey();

        Monkey A = new Monkey("Abu", "Vervet", 4, true);
        System.out.println(A.getName());
        A.setName("Bubu");
        System.out.println(A.getName());

        System.out.println(A.getAge());
        A.setPrice(2);
        System.out.println(A.getPrice());

        System.out.println(A.getIsFunny());
        A.setIsFunny(false);
        System.out.println(A.getIsFunny());


        Monkey B = new Monkey("Gorilla", 1.8d, 130);
        System.out.println(B.getHeight());
        B.setHeight(1.5d);
        System.out.println(B.getHeight());

        System.out.println(B.getWeight());
        B.setWeight(118);
        System.out.println(B.getWeight());

        Monkey C = new Monkey(true, "auburn", "Macaque");
        System.out.println(C.getColor());
        C.setColor("brown");
        System.out.println(C.getColor());

        System.out.println(C.getIsFriendly());
        C.setIsFriendly(false);
        System.out.println(C.getIsFriendly());

        Monkey D = new Monkey("Chimpanzee", 50000, true);
        System.out.println(D.getPrice());
        D.setPrice(45000);
        System.out.println(D.getPrice());

        System.out.println(D.getIsPrimate());
        D.setIsPrimate(false);
        System.out.println(D.getIsPrimate());

        Monkey E = new Monkey("grey", "Squirrel", "small");
        System.out.println(E.getSize());
        E.setSize("smallest");
        System.out.println(E.getSize());

        System.out.println(E.getBreed());
        E.setBreed("Baboon");
        System.out.println(E.getBreed());


        System.out.println((getAge(4)));
        System.out.println(returnNameAndBreed("Bubu", "Vervet"));
        getColor("red");
        checkBreed("Gorilla");
    }

    public static int getAge(int age) {
        return age - 1;
    }
    public static String returnNameAndBreed(String name, String breed) {
        return name + " " + breed;
    }

    public static void getColor(String color){
        System.out.println("it is beautiful " + color + " color");
    }

    public static void checkBreed(String breed){
        if(breed == "Gorilla"){
            System.out.println(breed + " set it free");
        }else{
            System.out.println(breed + " keep it in the Zoo");
        }
    }



}









//        System.out.println("This is " + A.name + " of " + A.breed + " breed, " + "and it`s " + A.isFunny + " they are funny" );
//        System.out.println(B.breed + " has a height of " + B.height + " meters" + " and weight of " + B.weight + " kg");
//        System.out.println("That is " + C.isFriendly + " that " + C.color + " " +  C.breed + " is friendly");
//        System.out.println(D.breed + " costs " + D.price + " $" + " and its " + D.isPrimate + " that they are primate" );
//        System.out.println("The " + E.color + " " + E.breed + " is " + E.size);

