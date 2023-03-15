package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SwapArraylist {
    /*
    create an arrayList with 15 car models.And store 15 of them
    1) add "Pagani" if the size of the arraylist is less than 25
    2)Add"Audi" if Audi doesn`t exists in your arrayList
    3)change the last element to "Mercedes"
    4. I actually wanted Pagani . i want to have that as first car
    a.Print the second and last model in that arrayList
    b.swap the first and last values in that array

     */
    public static void main(String[] args) {
        ArrayList<String> carModels = new ArrayList<>();
        carModels.add("BMW");
        carModels.add(0, "Mercedes");
        System.out.println(carModels);//[Mercedes, Audi]
        carModels.add("Volvo");
        carModels.add( "Camry");
        carModels.add( "Prius");
        System.out.println(carModels);

//1) add "Pagani" if the size of the arraylist is less than 25
        if(carModels.size() < 25){
            carModels.add("Pagani");
        }
// 2)Add"Audi" if Audi doesn`t exists in your arrayList
        System.out.println(carModels);//[Mercedes, Audi, Volvo, Camry, Prius, Pagani]
        if(!carModels.contains("Audi")){
            carModels.add("Audi");
        }
        System.out.println(carModels);//[Mercedes, BMW, Volvo, Camry, Prius, Pagani, Audi]

//4) I actually wanted Pagani . I want to have that as first car
   //     carModels.add(0,carModels.get(carModels.size()-1));
        String save = carModels.get(carModels.size() - 1);
        carModels.set(carModels.size()-1, " Mercedes");
        System.out.println(carModels);carModels.set(0,save);


 //3) change the last element to "Mercedes"
        carModels.set(carModels.size() - 1,"Mercedes");
        System.out.println(carModels);

        carModels.set(0,save);
        System.out.println(carModels);

// b.swap the first and last values in that array
     String saveTheCar = carModels.get(0);
     carModels.set(0,carModels.get(carModels.size()-1));
     carModels.set(carModels.size()-1, saveTheCar);

        System.out.println(carModels);


    }
}








