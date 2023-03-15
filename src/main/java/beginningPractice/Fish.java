package beginningPractice;

public class Fish {
    private String name;
    private String color;
    private double price;
    private int weight;
    private boolean isPredatory;

    public Fish(){

    }

    public Fish(String color, String name, double price) {
        this.color = color;
        this.name = name;
        this.price = price;
    }

    public Fish(boolean isPredatory, String name, int weight) {
        this.isPredatory = isPredatory;
        this.name = name;
        this.weight = weight;

    }

    public Fish(boolean isPredatory, String name) {
        this.isPredatory = isPredatory;
        this.name = name;
    }

    public Fish(String color, String name, int weight, double price) {
        this.color = color;
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public Fish(boolean isPredatory, String name, String color, int weight, double price) {
        this(isPredatory, name);
        this.color = color;
        this.weight = weight;
        this.price = price;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public boolean getIsPredatory(){
        return isPredatory;
    }
    public void setIsPredatory(boolean isPredatory){
        this.isPredatory = isPredatory;
    }

}
