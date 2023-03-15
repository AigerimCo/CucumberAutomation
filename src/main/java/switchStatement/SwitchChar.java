package switchStatement;

import java.util.ArrayList;

public class SwitchChar {
    public static void main(String[] args) {
/*
    /*
write a program
to check Vowel(glasnye) or Consonant (soglasnye): if the character is A,E,I,O,Y,U,it is vowel otherwise consonant.
It is not case-sensitive.
 */
   /*
    String character = "O";

        switch(character){

        case"A":
            System.out.println("Vowel");
            break;
        case"E":
            System.out.println("Vowel");
            break;
        case"I":
            System.out.println("Vowel");
            break;
        case"O":
            System.out.println("Vowel");
            break;
        case"U":
            System.out.println("Vowel");
            break;
        case"Y":
            System.out.println("Vowel");
            break;
        default:
            System.out.println("Consonant");
    }
}
 */
        char chars = 'h';
        switch(chars){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(chars + " is vowel");
                break;
            default:
                System.out.println(chars + " is consonant");

        }

        char letter = 'i';

        /* another option of program

switch (ch) {
    case 'a':
    case 'e':
    case 'i':
    case 'o':
    case 'u':

        System.out.println(ch + " is vowel");
        break;
    default:
        System.out.println(ch + " is consonant");
}
         */

        switch (letter) {

            case 'a':
                System.out.println("vowel");break;
            case 'e':
                System.out.println("vowel");break;
            case 'i':
                System.out.println("vowel");break;
            case 'o':
                System.out.println("vowel");break;
            case 'u':
                System.out.println("vowel");
            default:
                System.out.println("consonant");break;

        }

        String city = "Chicago";
        switch(city){

            case "Washington":
                for(int i = 0; i < "Washington".length();i++){
                    System.out.println("Washington".charAt(i));
                }
                if("hello".equals("hi")){
                    System.out.println("do this");
                }
                break;
            case"Seattle":
                for (int i = "Seattle".length()-1;i>=0;i--){
                    System.out.println("Seattle".charAt(i));
                }
                break;
            case"Chicago":
                System.out.println("Chicago is a beautiful city");
                ArrayList<String>chicagoSights=new ArrayList<>();
                chicagoSights.add("NavyPier");
                chicagoSights.add("Magnificent Mile");
                chicagoSights.add("Jibek Jolu");
                System.out.println(chicagoSights);
                break;
            default:
                System.out.println("No city,no loops, no arraylists");

        }

    }
}