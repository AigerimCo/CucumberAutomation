package Hackaton;

public class Product {

    String name;
    Double price;
    private Double stockLevel;

    public Product(String name, double price, double stockLevel){
        this.name = name;
        this.price = price;
        this.stockLevel = stockLevel;
    }
    public String getName(){
        return name;
    }
    public Double getPrice(){
        return price;
    }
    public Double getStockLevel(){
        return stockLevel;
    }
    public void setStockLevel(Double finalStockLevel){
        this.stockLevel = finalStockLevel;
    }
}
