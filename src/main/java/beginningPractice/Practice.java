package beginningPractice;

public class Practice {
    public static void main(String[] args) {

        String text = "HellopHello";

//length = Это возвращает длину //11
        System.out.println(text.length());

//startsWith= Проверяет начало слова с тем что передано в параметры //false
        System.out.println(text.startsWith("jk"));

// toUpperCase = Делает все буквы заглавными //HELLOPHELLO
        System.out.println(text.toUpperCase());

// toLowerCase= Делает все буквы нижними//hellophello
        System.out.println(text.toLowerCase());

// indexOf= выводит индес первой встречной буквы или же слова//3
        System.out.println(text.indexOf("lo"));

//replace =  Этот метод заменяет символы которые находятся внутри на новые символы или же слова//HelcodeWisepHelcodeWise
        System.out.println(text.replace("lo", "codeWise"));

// charAt = Выводит символ который находится под этим индексом// //H
        System.out.println(text.charAt(0));

// substring = Когда мы даем индеkс только один, он начиная с этого выводит остальное //ellopHello
//                          hellop -> ellop
        System.out.println(text.substring(1));

//substring =  Начиная с первого индекса выводит элементы до второго параметра
//                              HellopHello
//                              012345678910
        System.out.println("text.substring(3, 7) -> " + text.substring(3, 7));//text.substring(3, 7) -> lopH

       //  toCharArray = Этот метод позволяет превратить текст в ArrayOfCharacter
        /*
        H
e
l
l
o
p
H
e
l
l
o

         */
        char[] array = text.toCharArray();

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
