package beginningPractice.oopp;

public class Elephant extends Animal implements Swimable{
    private int weight;
    private byte legs;
    private boolean isBig;

    public Elephant() {
    }

    public Elephant(String location, int age, boolean isMammal,int weight, byte legs, boolean isBig) {
        super(location, age, isMammal);
        this.weight = weight;
        this.legs = legs;
        this.isBig = isBig;

    }

    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public byte getLegs(){
        return legs;
    }
    public void setLegs(byte legs){
        this.legs = legs;
    }
    public boolean getIsBig(){
        return isBig;
    }
    public void setIsBig(boolean isBig){
        this.isBig = isBig;
    }

    @Override
    public String toString() {
        return super.toString()+
        "Elephant{" +
                "weight=" + weight +
                ", legs=" + legs +
                ", isBig=" + isBig +
                '}';
    }

    @Override
    public void canSwim(String name) {
        System.out.println("this animal can swim " + name);
    }
}

