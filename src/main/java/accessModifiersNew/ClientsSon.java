package accessModifiersNew;

import accessModifiers.Client;

public class ClientsSon extends Client{

    public static void main(String[] args) {
        Client client = new Client();
        System.out.println(client.name);


        ClientsSon sc = new ClientsSon();
        System.out.println(sc.isMarried);

        payMoney();
        giveGift();

        System.out.println(isHappy);

        System.out.println(new ClientsSon().name);
        System.out.println(new Client().name);

        System.out.println(name2);
        System.out.println(isHappy);
    }
}
