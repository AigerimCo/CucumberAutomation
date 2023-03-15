package oop.inheritance;
import oop.Phone;
public class CodingBootcamp extends School{
    public void teachCoding(){
        System.out.println("Coding");
    }
    public IPhone getPhone(){
        return null;
    }
   @Override
   public void teach(){
       System.out.println("Teaching in Bootcamp style");
   }

   @Override
   public void studentEnroll(){
       System.out.println("Enrollment in Coding Bootcamp");
   }
}


