package oop.encapsulation;

 import java.util.ArrayList;
import java.util.HashMap;

public class BankAccount {

    private String username;
    private String password;
    private double balance;
    private boolean isLoggedIn;
    private ArrayList<Double> transactions = new ArrayList<>();

    private static HashMap<String, String> accounts = new HashMap<>();
    private static HashMap<String, Double> balances = new HashMap<>();

    private static void createAccounts(){
        accounts.put("benabai", "abc123");
        accounts.put("johndoe", "qwerty");
        accounts.put("mira", "miramax123");
    }

    private static void createBalances(){
        balances.put("benabai", 12000.50);
        balances.put("johndoe", 32000.10);
        balances.put("mira", 800.90);
    }

    static {
        createAccounts();
        createBalances();
    }

    /*
    check if username is in accounts as key, if password matches the value of the username
    */
    public void login(String username, String password){
        setUsername(username);

        if (accounts.containsKey(username)){
            if(accounts.get(username).equals(password)){
                System.out.println("Successfully logged in");
                isLoggedIn = true;
            }else{
                System.out.println("Incorrect password");
            }
        }else{
            System.out.println("Incorrect username");
        }
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        if(isLoggedIn){
            balance = balances.get(getUsername());
            System.out.println(balance);
            return balance;
        }
        return 0;
    }

    public ArrayList<Double> getTransactions() {
        if(isLoggedIn){
            System.out.println(transactions);
            return transactions;
        }
        return null;
    }

    public void makeTransaction(String purchaseName, double amount){
        if(isLoggedIn){
            transactions.add(amount);
            balance -= amount;
            balances.put(getUsername(), balance);
        }
    }


}

