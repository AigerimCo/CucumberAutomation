package enums;

public enum Planets {

    MERCURY(1),
    VENUS(2),
    EARTH(3),
    MARS(4),
    JUPITER(5),
    SATURN(6),
    URANUS(7),
    NEPTUNE(8);
    
    int positionFromSun;

    Planets(int positionFromSun){
        this.positionFromSun = positionFromSun;
    }

    public static void main(String[] args) {
        System.out.println(Planets.EARTH);
        System.out.println(Planets.EARTH.positionFromSun);
    }
}
