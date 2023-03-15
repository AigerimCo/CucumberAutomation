package accessModifiers;

public class Client {

    public String name = "John Doe";
    public static String name2 = "John Doe";
    public String dob = "12345689";
    String address = "123 abc street";

    private int ssn = 123456788;
    private double balance = 45000;

    protected boolean isMarried = true;
    double totalIncome = 150000.00;

    protected static boolean isHappy = true;

    public static void main(String[] args) {
        Client obj = new Client();
        System.out.println(obj.name);

        System.out.println(name2);
        System.out.println(Client.name2);
    }

    public static void payMoney(){
        System.out.println(isHappy);
        System.out.println(new Client().isMarried);
    }

    protected static void giveGift(){

    }
}
