package beginningPractice;

public class Monkey {
    private String name;
    private String breed;
    private String color;
    private String size;
    private double height;
    private int price;
    private int age;
    private int weight;
    private boolean isFunny;
    private boolean isPrimate;
    private boolean isFriendly;

    public Monkey() {
    }

    public Monkey(String name, String breed, int age, boolean isFunny) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.isFunny = isFunny;
    }

    public Monkey(String breed, double height, int weight) {
        this.breed = breed;
        this.height = height;
        this.weight = weight;
    }

    public Monkey(boolean isFriendly, String color, String breed) {
        this.isFriendly = isFriendly;
        this.color = color;
        this.breed = breed;
    }

    public Monkey(String breed, int price, boolean isPrimate) {
        this.breed = breed;
        this.price = price;
        this.isPrimate = isPrimate;
    }

    public Monkey(String color, String breed, String size) {
        this.color = color;
        this.breed = breed;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean getIsFunny() {
        return isFunny;
    }
    public void setIsFunny(boolean isFunny) {
        this.isFunny = isFunny;
    }
    public boolean getIsPrimate() {
        return isPrimate;
    }
    public void setIsPrimate(boolean isPrimate) {
        this.isPrimate = isPrimate;
    }

    public boolean getIsFriendly() {
        return isFriendly;
    }
    public void setIsFriendly(boolean isFriendly) {
        this.isFriendly = isFriendly;

    }

}



