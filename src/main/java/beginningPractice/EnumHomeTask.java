package beginningPractice;

import org.w3c.dom.ls.LSOutput;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

import static beginningPractice.Fruits.PEACH;

public class EnumHomeTask {
    public static void main(String[] args) {
        System.out.println(PEACH.getInfo());
        System.out.println(Fruits.APPLE.getPrice());
        System.out.println(Fruits.KIWI.getPrice());
        System.out.println(Fruits.ORANGE.getInfo());

        System.out.println(Fruits.BANANA.ordinal());
        System.out.println(Fruits.DRAGONFRUIT.name());
        System.out.println(Arrays.toString(Fruits.values()));

        System.out.println("============SWITCH OPERATOR=================");


        String fruit = "FRUIT";
        switch (fruit) {
            case "PEACH":
                System.out.println("sweet");
                break;
            case "APPLE":
                System.out.println("sour");
                break;
            case "KIWI":
                System.out.println("not tasty");
                break;
            default:
                System.out.println("organic");


        }

    }
}

