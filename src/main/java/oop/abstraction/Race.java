package oop.abstraction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Race {
    public static void main(String[] args) {
        Mercedes mercedes = new Mercedes();
        Car mercedes2 = new Mercedes();

        Tesla tesla = new Tesla();
        Car tesla2 = new Tesla();
        ElectricCar tesla3 = new Tesla();

        tesla.putOnSeatBelt();
        tesla2.putOnSeatBelt();
        mercedes2.putOnSeatBelt();

        Object tesla4 = new Tesla();
        Object mercedes3 = new Mercedes();
        Object integ = 3;
        Object str = new String("ssvds");

        Map<String, String> map = new HashMap<>();
        HashMap<String, String> map2 = new HashMap<>();

        List<String> al = new ArrayList<>();
        ArrayList<String> al2 = new ArrayList<>();

    }
}
