package accessModifiers;

public class ClassA {

    /*
    private
    default
    protected
    public
     */

    //default
    String name = "John Doe";
    private int age = 32;

    private boolean isOld = false;


    void sayHi(){
        System.out.println("hi");
    }

   private void sayBye(){
        System.out.println(("bye"));
    }

    /*
create 2 private variables, 1 private method
create 2 default variables, 1 default method
create 2 protected variables, 1 protected method
in class #1, call variables/methods of class 2 and 3

create 2 private variables, 1 private method
create 2 default variables, 1 default method
create 2 protected variables, 1 protected method
in class #2, call variables/methods of class 1 and 3

create 2 private variables, 1 private method
create 2 default variables, 1 default method
create 2 protected variables, 1 protected method
in class #3, call variables/methods of class 1 and 2
 */


    protected String city = "Washington";

    protected void sayHello(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        ClassA obj = new ClassA();
        obj.sayBye();
        System.out.println(obj.age);

        Restaurant res = new Restaurant();
    }


}
