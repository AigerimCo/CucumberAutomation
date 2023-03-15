
package Hackaton;

import java.util.ArrayList;
public class Store {

    String name;
    static ArrayList<Product> inventory;
    ArrayList<Customer> listCustomer;

    public Store(String name) {
        this.name = name;
        this.inventory = new ArrayList<>();
        this.listCustomer = new ArrayList<>();

    }

    public void addProduct(Product product) {
        inventory.add(product);

    }

    public void removeProduct(Product product) {
        inventory.remove(product);
    }

    public ArrayList<Product> getInventory() {
        return inventory;
    }

    public void addCustomer(Customer customer) {
        listCustomer.add(customer);

    }

    public void removeCustomer(Customer customer) {
        listCustomer.remove(customer);
    }

    public ArrayList<Customer> getCustomer() {
        return listCustomer;
    }

    public void generateSalesReport() {
        double totalSales = 0.0;
        for (Customer customer : listCustomer) {
            ArrayList<Product> purchasedProducts = customer.getPurchasedProducts();
            for (Product product : purchasedProducts) {
                totalSales += product.getPrice();
            }
        }
        System.out.println("Total sales: " + totalSales);
    }

    public void updateStockLevel() {
        for (Customer customer : listCustomer) {
            ArrayList<Product> purchasedProducts = customer.getPurchasedProducts();
            for (Product product : purchasedProducts) {
                double stockLevel = product.getStockLevel();
                product.setStockLevel(stockLevel - 1);
            }
        }
    }

    public static void main(String[] args) {
        Store groceryStore = new Store("N");

        Product bread = new Product("Bread", 2.99, 10);
        Product milk = new Product("Milk", 3.99, 5);
        Product eggs = new Product("Eggs", 4.99, 20);
        groceryStore.addProduct(bread);
        groceryStore.addProduct(milk);
        groceryStore.addProduct(eggs);
        Customer john = new Customer("John Doe", "123 Main St", "555-555-1212");
        Customer jane = new Customer("Jane Doe", "456 Elm St", "555-555-1213");
        groceryStore.addCustomer(john);
        groceryStore.addCustomer(jane);


        john.addPurchase(bread);
        john.addPurchase(milk);


        jane.addPurchase(eggs);


        groceryStore.generateSalesReport();


        groceryStore.updateStockLevel();


        System.out.println("Updated Inventory: ");
        for (Product product : groceryStore.getInventory()) {
            System.out.println("Product: " + product.getName() + ", Stock Level: " + product.getStockLevel());
        }
    }
}
