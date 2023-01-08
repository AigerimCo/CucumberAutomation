package staticPackage;

public class Pilot {
    String name;
    static String flight;

    public void  communicate(){
        System.out.println(name + "is communicating with dispatcher");
    }
    public void check(){
        System.out.println(name + "is checking flight system");

    }
    public static void operateAircraft(String aircraftFly){
        System.out.println(aircraftFly + "ready to fly ");

    }
}
