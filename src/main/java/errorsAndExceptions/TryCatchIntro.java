package errorsAndExceptions;

import java.io.IOException;

public class TryCatchIntro {
    public static void main(String[] args) {


        String name = "Martinnbklnknl";

        try {
            System.out.println("Inside try block, before exception is thrown");

            if (name.length() < 10){
                throw new NullPointerException("the length of the name is less than 10");
            }

            System.out.println("Inside try block, after exception is thrown");

        }catch (Exception e){
            System.out.println("Inside catch block");
        }

        System.out.println("After try-catch block");

    }


    /*
    we are throwing checked exception
     */
    public static void sayBye(String name) throws IOException {
        if (name.startsWith("A")) {
            System.out.println("Bye " + name);
            ;
        } else {
            //input-output exception
            throw new IOException("name doesn't start with A");
        }
    }

    public static void sayBye2(String name) {
        if (name.startsWith("A")) {
            System.out.println("Bye " + name);
        } else {

            try {
                System.out.println("The name should always start with A, else we cant sy bye");
                throw new IOException("name doesn't start with A");
            } catch (IOException e) {
                System.out.println(e.getMessage());
                System.out.println("this is the catch block");
            }


        }
    }


    /*
    we are throwing run time exceptions
     */
    public static void sayHello(String name) {
        if (name == null) {
            throw new NullPointerException("null value was given instead of name");
        } else {
            System.out.println("Hello " + name);
        }
    }

    /*
    handle exception, means
    1. either put the exception inside try catch block
    2. or add exception in method declaration

    if exception is runtime exception, it doesn't need to be handled
    if exception is checked exception, it needs to be handled
     */


}
