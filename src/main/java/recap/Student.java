package recap;

public class Student {

    /*
    attributes / members of the class; variables,methods
variables to store data
methods to do some actions
     */

    String name = "Smart student";
    String str;
    int a = 10;
    double d = 4;
    char c = 'h';


    public void study(){

    }
    public void eat(){

    }
    public static void main(String[] args){
        Student Nuriia  = new Student();
        Student Nurgul = new Student();
        Student Aibol = new Student();

        Nuriia.eat();
        Nurgul.study();
        Aibol.name = "Aibol Developer";

        System.out.println(Nurgul.name);
        System.out.println(Aibol);
        System.out.println(Nuriia.name);
        Nuriia.name = "Googler";
        System.out.println(Nuriia.name);

        System.out.println(new Student().name = "hello");//hello
        System.out.println((new Student().name ));//smart student

        System.out.println(Aibol.name);//Aibol Developer'

        Aibol = new Student();

        System.out.println(Aibol.name);
        Aibol.name = "Daniel`s husband";
        System.out.println(Aibol.name);//Daniel`s husband
        System.out.println(Aibol.name = "student");//student
        System.out.println(Aibol.name);//  student

    }

    }

