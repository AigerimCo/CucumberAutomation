package beginningPractice.oopp;

public class Samsung extends Phone implements MakingCalls, TakingPictures{
    private String birthPlace;
    private String software;

    public Samsung(String birthPlace, String software, int memory, boolean hasInternet, boolean hasCamera, String type, String purpose, boolean hasTouchScreen) {
        super(memory, hasInternet, hasCamera, type, purpose, hasTouchScreen);
        this.birthPlace = birthPlace;
        this.software = software;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getSoftware() {
        return software;
    }

    public void setSoftware(String software) {
        this.software = software;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Samsung{" +
                "birthPlace='" + birthPlace + '\'' +
                ", software='" + software + '\'' +
                '}';
    }
}