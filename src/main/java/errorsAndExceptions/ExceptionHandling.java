package errorsAndExceptions;


public class ExceptionHandling {


        public static void method1(){
            try{
                throw new Exception();
            }catch (Exception e){
                System.out.println("Exception was thrown");
            }

        }


        public static void method2() {

            try {
                int [] arr = new int[2];
                arr[10] = 3;
            }
            catch (Exception e){
                System.out.println("Some issue with login functionality");
                e.printStackTrace();
            }
            finally {

            }



        }


        public static void main(String[] args){
            try {
                System.out.println("before exception");

                int [] arr = new int[1];
                arr[0] = 2;

                try{
                    System.out.println("Inner try block");


                }catch (Exception e){

                }

            }
            catch (IndexOutOfBoundsException e){
                System.out.println("caught null pointer");
            }

        }

    }


