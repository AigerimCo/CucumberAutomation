package oop.abstraction;

public class Tesla implements ElectricCar{


    @Override
    public void drive() {
        System.out.println("Tesla is driving");
    }

    @Override
    public void stop() {
        System.out.println("Tesla is stopping");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Tesla is accelerating by " + speed);
    }

    @Override
    public void heat(double temp) {
        System.out.println("Tesla is heating up to " + temp);
    }

    @Override
    public void charge() {
        System.out.println("Tesla is charging");
    }


}
