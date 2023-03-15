package accessModifiersNew;

import accessModifiers.Client;

public class ClientsFriend {
    public static void main(String[] args) {
        Client client = new Client();
        System.out.println(client.name);
  //      System.out.println(client.address);
   //     System.out.println(client.totalIncome);cannot see, cause its in dif.package and its default
    }
}
