package hometasks;

public class ComparesHomework {
    public static void main(String[] args) {

        String hello1 = "Hello World!";
        String hello2 = "Hello world!";
        String hello3 = new String("HelloWorld!");

// 1. write a program that compares values of hello1 and hello2 ==> false - values are not same

        boolean isEqual = hello1.equals(hello2);
        System.out.println("Hello World!".equals("Hello world!"));


 // 2. write a program that compares values of hello1 and hello3  ==> false - values are not same

       isEqual = hello1 == hello3;
        System.out.println("Hello World!".equals(new String("HelloWorld!")));


  // 3.   write a program that compares of hello1 and hello2 are same objects
        // false-lowercase and uppercase are not same

        boolean isSameObject = hello1 == hello2;
        System.out.println("Hello World! is same as Hello world! " + isSameObject);


  //     4. write a program that compares hello1 and hello2 and make sure the result will be true ==> true
        isEqual = hello1.equals(hello2.toUpperCase());
        System.out.println(hello1.equalsIgnoreCase(hello2));

  //    5. convert hello1 and hello2 to all lower case and compare them ==> true
        boolean isSame = hello1.equals(hello2);
        hello1 = hello1.toLowerCase();
        isSame = hello1.equals(hello2);
        System.out.println();

    }
}
