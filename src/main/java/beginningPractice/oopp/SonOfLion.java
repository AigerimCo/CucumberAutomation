package beginningPractice.oopp;

public class SonOfLion extends Lion implements Swimable,Jumpable{
    private String country;

    public SonOfLion(String country,String location, int age, boolean isMammal, String color, byte paws, boolean isStrong){
        super(location,age,isMammal, color, paws,isStrong);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return super.toString() +
                "SonOfLion{" +
                "country='" + country + '\'' +
                '}';
    }
}
