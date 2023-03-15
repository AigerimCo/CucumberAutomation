package Hackaton;
import java.util.ArrayList;
public class Customer {


    String name;
    String address;
    String phone;
    ArrayList<Product> purchasedProducts;

    public Customer(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.purchasedProducts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public void addPurchase(Product product) {
        purchasedProducts.add(product);
    }

    public ArrayList<Product> getPurchasedProducts() {
        return purchasedProducts;
    }
}