package dataTypes;

public class ZelleApp {
    public static void main(String[] args) {
        ZelleAccount user1 = new ZelleAccount("James Bond", "3125005100", "Chase");
        user1.depositMoney(2000);
        user1.info();
        user1.transferMoney("312500500", 200);
        user1.info();

        ZelleAccount user2 = new ZelleAccount("Kate", "3120001000", "BoA");
        user2.depositMoney(5000);
        user2.info();
        user1.depositMoney(4500);
        ZelleAccount.customerService();
        ZelleAccount.zelleInfo();


    }
}
