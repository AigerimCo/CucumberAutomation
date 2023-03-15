package oop.inheritance;

import oop.SmartPhone;

public class AndroidPhone extends SmartPhone {

    //AndroidPhone<=Smartphone<=Phone<=object
    public AndroidPhone(){
        super();
        //means it calls (creates) it`s super classes default constructor
        //super(); => calling Smartphone default constructor
        //why? because it needs to create an object from parent
        //so that java technology works. Then it inherits its properties
        System.out.println("Hey there. It`s AndroidPhone constructor");
    }
    public AndroidPhone(String color){
        this.color=color;
    }
    public AndroidPhone(String color, String brand){
        this.color = color;

    }



    }
