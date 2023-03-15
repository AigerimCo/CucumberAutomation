package beginningPractice.oopp;

public class Lion extends Animal implements Swimable,Jumpable {
    private String color;
    private byte paws;
    private boolean isStrong;

    public Lion() {
    }

    public Lion(String location, int age, boolean isMammal, String color, byte paws, boolean isStrong) {

        super(location,age,isMammal);
        this.color = color;
        this.paws = paws;
        this.isStrong = isStrong;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public byte getPaws() {
        return paws;
    }

    public void setPaws(byte paws) {
        this.paws = paws;
    }

    public boolean getIsStrong() {
        return isStrong;
    }

    public void setIsStrong(boolean isStrong) {
        this.isStrong = isStrong;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Lion{" +
                " color='" + color + '\'' +
                ", paws=" + paws +
                ", isStrong=" + isStrong +
                '}';
    }

    @Override
    public void canJump(String text) {
        System.out.println("yes,it can");
    }

    @Override
    public String printText(int num, String text) {
        return text+num;
    }

    @Override
    public void canSwim(String name) {
        System.out.println("no.it cannot");

    }
}

