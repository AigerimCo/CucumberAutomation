package beginningPractice;

import org.w3c.dom.ls.LSOutput;

public class Loops {
    public static void main(String[] args) {

        int b = 20;
        int[] array = new int[]{1, 2, 3, 5, 8, 2, 10, 56};
        for (int a = 0; a < array.length; a++) {
            System.out.println(array[a]);
        }
        System.out.println("------------------------------------");
        String[] words = new String[]{"Hello", "Hi", "Bye", "GoodBye", "World", "Bishkek"};

        int x = 0;
        while (x < words.length) {
            //x = 5
            System.out.println(words[x]);
            x++;
        }
        System.out.println("++++++++++++++++++++++++++++++");

        int y = 0;
        do {
            System.out.println(words[y]);
            y++;
        } while (y < words.length);
        System.out.println("=====================");


        for (String bishkek : words) {
            System.out.println(bishkek);
        }
        System.out.println("*****************************************************");

//        String[] words = new String[]{"Hello", "Hi", "Bye", "GoodBye", "World", "Bishkek"};

//reverse String array using FOR LOOP
        for (int ccc = words.length - 1; ccc >= 0; ccc--) {
            System.out.println(words[ccc]);
        }
        System.out.println("###############################################");

//reverse String array using WHILE LOOP
        int aaa = words.length - 1;
        {
            while (aaa >= 0) {
                System.out.println(words[aaa]); // Bishkek, World, GoodBye,Bye,Hi,Hello
                aaa--;
            }
            System.out.println("********************************");
        }
//reverse String array using DO WHILE LOOP
        int bbb = words.length - 1;
        do {
            System.out.println(words[bbb]);
            bbb--;
        } while (bbb > 0);
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

//// FOR EACH LOOP
        for (String word : words) {
            System.out.println(word);
        }
    }
}







