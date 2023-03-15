package beginningPractice.oopp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainSafari {
    public static void main(String[] args) {
        Lion lion = new Lion("Safari", 5, false, "yellow", (byte) 4, true);
        System.out.println("location: " + lion.getLocation() + " age: " + lion.getAge() + " isMammal: " + lion.isMammal() + "color: " + lion.getColor() + "paws: " + lion.getPaws() + "isStrong: " + lion.getIsStrong());
        Elephant elephant = new Elephant("savanna", 8, true, 6800, (byte) 4, true);
        System.out.println("location: " + elephant.getLocation() + " age: " + elephant.getAge() + " isMammal: " + elephant.isMammal() + " weight: " + elephant.getWeight() + " legs: " + elephant.getLegs() + "isBig: " + elephant.getIsBig());
        SonOfLion simba = new SonOfLion("Africa", "africa", 1, false, "yellow", (byte) 4, false);
        System.out.println("age: " + simba.getAge() + " isMammal: " + simba.isMammal());

        Lion lion1 = new Lion("Jungle", 1, false, "yellow", (byte) 4, true);
        Lion lion2 = new Lion("Africa", 2, true, "brown", (byte) 4, true);
        Lion lion3 = new Lion("Kenya", 3, true, "yellow", (byte) 4, true);
        Lion lion4 = new Lion("Tanzania", 4, false, "brown", (byte) 4, true);
        Lion lion5 = new Lion("Madagascar", 6, true, "yellow", (byte) 4, true);

        Elephant elephant1 = new Elephant("savanna1", 1, true, 6600, (byte) 4, true);
        Elephant elephant2 = new Elephant("savanna2", 2, false, 6500, (byte) 4, false);
        Elephant elephant3 = new Elephant("savanna3", 3, true, 6700, (byte) 4, false);
        Elephant elephant4 = new Elephant("savanna4", 4, true, 6900, (byte) 4, true);
        Elephant elephant5 = new Elephant("savanna5", 5, false, 6800, (byte) 4, false);

        SonOfLion cub1 = new SonOfLion("Africa1", "africa1", 1, false, "yellow", (byte) 4, true);
        SonOfLion cub2 = new SonOfLion("Africa2", "africa2", 2, true, "yellow", (byte) 4, false);
        SonOfLion cub3 = new SonOfLion("Africa3", "africa3", 3, true, "yellow", (byte) 4, true);
        SonOfLion cub4 = new SonOfLion("Africa4", "africa4", 4, false, "yellow", (byte) 4, false);
        SonOfLion cub5 = new SonOfLion("Africa5", "africa5", 5, true, "yellow", (byte) 4, true);


        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cub1);
        animals.add(cub2);
        animals.add(cub3);
        animals.add(cub4);
        animals.add(cub5);
        animals.add(elephant1);
        animals.add(elephant2);
        animals.add(elephant3);
        animals.add(elephant4);
        animals.add(elephant5);
        animals.add(lion1);
        animals.add(lion2);
        animals.add(lion3);
        animals.add(lion4);
        animals.add(lion5);


        List<Animal> animalss = Arrays.asList(lion1, lion2, lion3, lion4, lion5, elephant1, elephant2, elephant3,
                elephant4, elephant5, cub1, cub2, cub3, cub4, cub5);

        List<Swimable> animalism = Arrays.asList(lion1, lion2, lion3, lion4, lion5, elephant1, elephant2, elephant3,
                elephant4, elephant5, cub1, cub2, cub3, cub4, cub5);




        eats(animals);
        eats(animalss);
    }


        public static void eats(ArrayList<Animal>animals) {
            for (Animal animal : animals) {
                System.out.println(animal);
            }
        }
        public static void eats(List<Animal>animals){
            for (Animal animal : animals) {
                System.out.println(animal);
            }

        }



        //        System.out.println("-----------Professional using----------");
//        ArrayList<Animal> lions  = new ArrayList<>();
//        lions.add(lion1);
//        lions.add(lion2);
//        lions.add(lion3);
//        lions.add(lion4);
//        lions.add(lion5);
//        System.out.println(lions.get(0));

//        List<Elephant> elephants = List.of(elephant1,elephant2,elephant3,elephant4,elephant5);
//
//        List<SonOfLion> cubs = List.of(cub1, cub2,cub3,cub4,cub5);
//
//
//
//        System.out.println(elephant);
//        System.out.println(simba);
//
//        System.out.println("----------------------------------------------");


//        List<Daughter> daughters1 = List.of(daughter1,daughter2,daughter3,daughter4,daughter5,daughter6,daughter7,daughter8,daughter9);
//        List<Daughter> daughters2 = Arrays.asList(daughter1,daughter2,daughter3,daughter4,daughter5,daughter6,daughter7,daughter8,daughter9);

//        lion.setColor("brown");
//        System.out.println(lion.getColor());
//
//        print(lion);
//        print(elephant);
//        trainedElephant(elephants);
//        trainedSonOfLion(cubs);
//
//    }
//    public static void print(Animal animal){
//        System.out.println(animal.getAge() + " " + animal.getLocation());
//    }
//public static void trainedElephant(List<Elephant>elephants) {
//    for (int i = 0; i < elephants.size(); i++) {
//        System.out.println(elephants.get(i));
//    }
//}
//    public static void trainedSonOfLion(List<SonOfLion>cubs){
//        for(int a = 0; a < cubs.size();a++){
//            System.out.println(cubs.get(a));
//        }


}

