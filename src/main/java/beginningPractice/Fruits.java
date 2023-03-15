package beginningPractice;

public enum Fruits {

    APPLE("green", 2.99),
    BANANA("yellow", 1.99),
    PEACH("nectarine", 4.99),
    DRAGONFRUIT("exotic", 7.50),
    KIWI("sour", 4.2),
    ORANGE("orange", 5.49);


    private final String info;
    private final double price;
    Fruits(String info,double price){
        this.info = info;
        this.price = price;
    }

    public String getInfo() {
        return info;
    }

    public double getPrice() {
        return price;
    }
}
