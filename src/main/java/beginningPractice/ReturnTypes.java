package beginningPractice;

public class ReturnTypes {
    public static void main(String[] args) {

        System.out.println(returnName("world"));
        String a = returnName("Bye");
        System.out.println(a);
        String response = get(123);
        System.out.println(response);
        System.out.println(get(12345));
        System.out.println(get(10987));
        System.out.println(get(8989));

    }
    //Написать метод который принимает имя имя и фамилия и должен возвратить фуллнейм
    //написать метод который будет принимать в себя возраст возвратите минус 10 от этого возраста
    // напишите метод котрый ничего не будет принимать но возвращать эррей оф интежер)

    public static String returnName(String name) {
        return "Hello" + name;
    }

    public static String get(int age) {
        return "How are you!!!! " + age + " years old! ";
    }
}
