package beginningPractice;

public class HomeTaskReturnMethod {
    //Написать метод который принимает имя имя и фамилия и должен возвратить фуллнейм
//написать метод который будет принимать в себя возраст возвратите минус 10 от этого возраста
// напишите метод котрый ничего не будет принимать но возвращать эррей оф интежер)
    public static void main(String[] args) {
        System.out.println(returnFullName("Daniel", "Smith"));
        System.out.println(getNum(55));

    }

    public static String returnFullName(String name, String lastName) {
        return name + " " + lastName;
    }

    public static int getNum(int age) {
        return age - 10;
    }

    public static int[] getNewArray(){
        return new int[10];
    }
}

