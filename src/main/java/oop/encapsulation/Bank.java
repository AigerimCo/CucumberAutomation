package oop.encapsulation;

public class Bank {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.login("benabai", "abc123");
        bankAccount1.getBalance();
        bankAccount1.makeTransaction("lotion",40);
        bankAccount1.makeTransaction("pizza",240.90);
        bankAccount1.getBalance();
        bankAccount1.getTransactions();



    }
}
