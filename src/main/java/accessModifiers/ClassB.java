package accessModifiers;

public class ClassB {
    public static void main(String[] args) {
        ClassA obj = new ClassA();
        System.out.println(obj.name);
        System.out.println();

      obj.sayHi();//we can see it in class A but we can`t see sayBye cause is private
  //      obj.sayBye();

     obj.sayHello();
        System.out.println(obj.city);


    }
}

