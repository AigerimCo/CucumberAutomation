package oop.inheritance;
import oop.Phone;
public class School extends Object {

    String name;
    String address;

    public School(){
        super();
    }
    protected Phone getPhone(){
        Phone phone = new Phone();
        return phone;
    }
    public void teach(){
        System.out.println("Teaching");
    }
    public void studentEnroll(){
        System.out.println("Enrollment in process");
    }
}
