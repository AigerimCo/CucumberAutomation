package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class Phonebook{

    public static void main(String []argh) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of queries: ");
        int n = in.nextInt(); //number of persons in our phone book
        in.nextLine();

        HashMap<String, Integer> phonebook = new HashMap<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter persons name: ");
            String name = in.nextLine();

            System.out.println("Enter persons phone number: ");
            int phone = in.nextInt();
            System.out.println("What person's number do you need? ");

            in.nextLine();

            phonebook.put(name, phone);
        }

        while (in.hasNext()) {
            String person = in.nextLine(); //name
            String result = "";

            for (String name : phonebook.keySet()) {
                if (name.equals(person)) {
                    result = name + "=" + phonebook.get(name);
                    break;
                } else {
                    result = "Not found";
                }
            }
            System.out.println(result);


        }
    }
    }



