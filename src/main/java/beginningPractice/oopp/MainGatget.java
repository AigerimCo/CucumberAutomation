package beginningPractice.oopp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainGatget {
    public static void main(String[] args) {

        Phone phone = new Phone(128, true, true, "smartphone", "calling", true);
        System.out.println("Memory: " + phone.getMemory() + ". Has internet: " + phone.getHasInternet() + ". HasCamera: " + phone.getHasCamera() + ". Type: " + phone.getType() + ". Purpose: " + phone.getPurpose() + ". TouchScreen: " + phone.getHasTouchScreen());
        Laptop laptop = new Laptop(16, false, true, "Acer", "Silver", 799.99);
        System.out.println("Memory: " + laptop.getMemory() + ". Has internet: " + laptop.getHasInternet() + ". HasCamera: " + laptop.getHasCamera() + ". Brand: " + laptop.getBrand() + ". Color: " + laptop.getColor() + ". Price: " + laptop.getPrice());
        Iphone iphone = new Iphone("USA", "IOS", 512, true, true, "smartphone", "calling", true);
        System.out.println("BirthPlace: " + iphone.getBirthPlace() + ". Operating system is: " + iphone.getSoftware() + ". Memory : " + iphone.getMemory() + ". Has internet: " + iphone.getHasInternet() + ". HasCamera: " + iphone.getHasCamera() + ". Type: " + iphone.getType() + ". Purpose: " + iphone.getPurpose() + ". TouchScreen " + iphone.getHasTouchScreen());
        Samsung samsung = new Samsung("Korea", "Android", 256, true, true, "smartphone", "calling", true);
        System.out.println("BirthPlace: " + samsung.getBirthPlace() + ". Operating system is: " + samsung.getSoftware() + ". Memory : " + samsung.getMemory() + ". Has internet: " + samsung.getHasInternet() + ". HasCamera: " + samsung.getHasCamera() + ". Type: " + samsung.getType() + ". Purpose: " + samsung.getPurpose() + ". TouchScreen " + samsung.getHasTouchScreen());

        Phone phone1 = new Phone(128, true, true, "smartphone1", "makingPictures", false);
        Phone phone2 = new Phone(256, false, true, "smartphone2", "texting", false);
        Phone phone3 = new Phone(512, false, false, "smartphone3", "chatting", true);
        Phone phone4 = new Phone(128, true, true, "smartphone4", "searchingInfo", false);
        Phone phone5 = new Phone(256, false, false, "smartphone5", "calling", true);

        Laptop laptop1 = new Laptop(16, false, true, "Acer", "Silver", 599.99);
        Laptop laptop2 = new Laptop(32, true, false, "Asus", "Black", 699.99);
        Laptop laptop3 = new Laptop(8, false, false, "Lenovo", "Red", 779.99);
        Laptop laptop4 = new Laptop(64, true, true, "Toshiba", "Blue", 899.99);
        Laptop laptop5 = new Laptop(16, false, false, "Dell", "Purple", 999.99);

        Iphone iphone1 = new Iphone("USA", "IOS1", 512, true, true, "smartphone1", "calling", true);
        Iphone iphone2 = new Iphone("Japan", "IOS2", 256, true, true, "smartphone2", "listeningMusic", true);
        Iphone iphone3 = new Iphone("China", "IOS3", 128, true, true, "smartphone3", "texting", true);
        Iphone iphone4 = new Iphone("Vietnam", "IOS4", 512, true, true, "smartphone4", "watchingVideos", true);
        Iphone iphone5 = new Iphone("Canada", "IOS5", 256, true, true, "smartphone5", "haveAnInstagram", true);

        Samsung samsung1 = new Samsung("Korea", "Android1", 256, true, true, "smartphone1", "Gaming", true);
        Samsung samsung2 = new Samsung("USA", "Android2", 512, true, true, "smartphone2", "Tiktoking", true);
        Samsung samsung3 = new Samsung("CHINA", "Android3", 128, true, true, "smartphone3", "Instgraming", true);
        Samsung samsung4 = new Samsung("Japan", "Android4", 512, true, true, "smartphone4", "Youtubing", true);
        Samsung samsung5 = new Samsung("Canada", "Android5", 256, true, true, "smartphone5", "Googling", true);


        ArrayList<Technology> device = new ArrayList<>();
        device.add(phone1);
        device.add(phone2);
        device.add(phone3);
        device.add(phone4);
        device.add(phone5);
        device.add(laptop1);
        device.add(laptop2);
        device.add(laptop3);
        device.add(laptop4);
        device.add(laptop5);
        device.add(iphone1);
        device.add(iphone2);
        device.add(iphone3);
        device.add(iphone4);
        device.add(iphone5);
        device.add(samsung1);
        device.add(samsung2);
        device.add(samsung3);
        device.add(samsung4);
        device.add(samsung5);

        List<Technology> devices = Arrays.asList(phone1, phone2, phone3, phone4, phone5,
                laptop1, laptop2, laptop3, laptop4, laptop5, iphone1, iphone2, iphone3, iphone4, iphone5,
                samsung1, samsung2, samsung3, samsung4, samsung5, samsung5);

        List<TakingPictures> anyDevices = Arrays.asList(phone1, phone2, phone3, phone4, phone5,
                laptop1, laptop2, laptop3, laptop4, laptop5, iphone1, iphone2, iphone3, iphone4, iphone5,
                samsung1, samsung2, samsung3, samsung4, samsung5, samsung5);



hasMemory(device);
hasFaceControl(devices);

    }

    public static void hasMemory(ArrayList<Technology>device){
        for(Technology technology : device){
            System.out.println(technology);
        }
    }

    public static void hasFaceControl(List<Technology>device){
        for (Technology technology : device){
            System.out.println(technology);
        }
    }


//        laptop.setColor("Black");
//        System.out.println(laptop.getColor());
//
//        phone.setMemory(256);
//        System.out.println(phone.getMemory());

//
//        ArrayList<Phone> phones = new ArrayList<>();
//        phones.add(phone1);
//        phones.add(phone2);
//        phones.add(phone3);
//        phones.add(phone4);
//        phones.add(phone5);
//        System.out.println(phones.get(0));
//
//
//        List<Laptop> laptops = List.of(laptop1, laptop2, laptop3, laptop4, laptop5);
//        System.out.println(laptops);
//
//        List<Iphone> iphones = List.of(iphone1, iphone2, iphone3, iphone4, iphone5);
//        System.out.println(iphones);
//
//        List<Samsung> samsungs = List.of(samsung1, samsung2, samsung3, samsung4, samsung5);
//        System.out.println(samsungs);
//
//
//        buyPhone(phones);
//        buyLaptop(laptops);
//        buyIphone(iphones);
//        buySamsung(samsungs);
//
//    }
//
//    public static void buyPhone(List<Phone> phones) {
//        for (int i = 0; i < phones.size(); i++) {
//            System.out.println(phones.get(i));
//        }
//    }
//
//    public static void buyLaptop(List<Laptop> laptops) {
//        for (int a = 0; a < laptops.size(); a++) {
//            System.out.println(laptops.get(a));
//        }
//    }
//        public static void buyIphone(List<Iphone>iphones){
//        for(int b = 0; b < iphones.size();b++){
//            System.out.println(iphones.get(b));
//
//        }
//    }
//    public static void buySamsung(List<Samsung>samsungs){
//        for(int c = 0; c < samsungs.size();c++){
//            System.out.println(samsungs.get(c));
//        }
//    }
//}
}