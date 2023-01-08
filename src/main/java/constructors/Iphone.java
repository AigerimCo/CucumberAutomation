package constructors;

public class Iphone {

    public Iphone() {
        System.out.println("inside constructor");
        this.color = "space gray";
        this.memory = 128;
        this.price = 999.99;
        this.isUnlocked = false;
    }

    public Iphone(int memoryFromParam) {
        System.out.println("this iphone has: " + memoryFromParam + " Gb memory.");
        this.memory = memoryFromParam;
    }

    public Iphone(String color) {
        System.out.println("This iphone is " + color);
        this.color = color;
    }

    String color;
    int memory;
    double price;
    boolean isUnlocked;


    public static void main(String[] args) {

        Iphone iphone14ProMax = new Iphone();
        iphone14ProMax.color = "rose gold";

        Iphone iphoneSE = new Iphone(256);
        iphoneSE.color = "gold";
        iphoneSE.price = 549.99;
        iphoneSE.isUnlocked = true;

        System.out.println(iphone14ProMax.memory); //128
        System.out.println(iphoneSE.memory); //256
        System.out.println(iphoneSE.price); //549.99
        System.out.println(iphone14ProMax.isUnlocked); //false

        System.out.println(iphone14ProMax.color); //rose gold

        iphone14ProMax = new Iphone();
        System.out.println(iphone14ProMax.color); //space gray
        System.out.println(iphone14ProMax.memory = 512); //512
        System.out.println(iphone14ProMax.memory); //512

        Iphone mobile = new Iphone();
        System.out.println(mobile.price); // 999.99
        mobile.isUnlocked = true;
        System.out.println(mobile.isUnlocked); //true
        System.out.println(new Iphone(88383));
        //this iphone has 88383 Gb memory
        //objectID

        mobile.playMusic();
        iphoneSE.playMusic();
        iphone14ProMax.playMusic();
        new Iphone().playMusic();


    }

    public void playMusic(){
        System.out.println("Iphone is playing music");
    }


}
