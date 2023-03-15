package oop.abstraction;

public interface Car {
    /*
    interface is fully abstract,it can have abstract method not concrete
    that classes must implement
    interface can be implemented,not extended
     */

    public abstract void  drive();

    public abstract void stop();

    public abstract void accelerate(int speed);

    public abstract void heat(double temp);

// default method which can have body(implementation)

    default void putOnSeatBelt(){
        System.out.println("the car`s default method");
    }

    }


