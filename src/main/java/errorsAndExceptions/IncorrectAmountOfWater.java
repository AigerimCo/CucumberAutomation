package errorsAndExceptions;

public class IncorrectAmountOfWater extends Exception{

    public IncorrectAmountOfWater(String message){
        super(message);
    }

    public IncorrectAmountOfWater(){
        super();


    }
}
