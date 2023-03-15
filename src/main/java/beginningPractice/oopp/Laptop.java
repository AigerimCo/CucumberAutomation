package beginningPractice.oopp;

public class Laptop extends Technology implements TakingPictures {
    private String brand;
    private String color;
    private double price;

  public Laptop(){
  }

  public Laptop(int memory, boolean hasInternet, boolean hasCamera,String brand,String color, double price){
      super(memory, hasInternet, hasCamera);
      this.brand = brand;
      this.color = color;
      this.price = price;

  }

  public String getBrand(){
      return brand;
  }
  public void setBrand(String brand){
      this.brand = brand;
  }
    public String getColor(){
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Laptop{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
    public void MakePicture(String name){
        System.out.println(name + " can make a good pictures");
    }

    @Override
    public void makePhoto(String name) {

    }

    @Override
    public String textMessage(String message, int number) {
        return null;
    }
}
