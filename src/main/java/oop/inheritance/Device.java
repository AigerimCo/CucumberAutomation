package oop.inheritance;

public class Device {

    String size;
    boolean isBatteryBased;
    boolean hasInternet;
    boolean hasMonitor;
    int memory;

    public Device(boolean isPortable){
    super();//Object

    }
    public void switchOn(){
        System.out.println("switching on the device");
    }
    public void switchOff(){
        System.out.println("switching off the device");
    }

}
