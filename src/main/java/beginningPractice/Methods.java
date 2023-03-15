package beginningPractice;

public class Methods {

    //Нужно создать три метода первый принимает в себя инт, второе принимает в себя стринг,
// третье должно принимать в себя эррей оф стринг
//каждое значение приходящее с параметра добавив смс 'This value from parameter -> '
    public static void main(String[] args) {
        String [] sms = new String [] {"Good morning","Good afternoon","Good night"};
        printString("Good evening");
        createInt(50);
        getArray(sms);
        getMix(5, "Hi", new int []{50,8,10,20});
        checkBoth("Your true is false", false);


    }

    public static void printString(String name) {
        System.out.println("This value from parameter => : " + name);

    }

    public static void createInt(int number) {
        System.out.println("This value from parameter => : " + number);
    }

    public static void getArray(String[] array) {
        for (int a = 0; a < array.length; a++) {
            System.out.println("This value from parameter=> " + array[a]);
        }

    }
    public static void getMix(int name,String text,int [] array){

        System.out.println(name + 20);
        System.out.println(text + " Hello");

        for(int i = array.length-1; i >= 0; i--){
            System.out.println(array[i] + 5);
        }
    }
    public static void checkBoth(String text, boolean isTrue){
        if (isTrue == true){
            System.out.println(text);
        }else{
            System.out.println("your isTrue is false");
        }
        //надо создать метод который будет принимать два эррей - один стрин,
        // второй инт и вывести все по очереди
        //создать метод фейс контроль который будет принимать возраст имя и фаимилия,
        // если возраст равен или больше 18 ти то должно выйти сообщение имя фаимилия
        // проходите дальше а если нет то пошел вон!
        //нам надо написать метод который будет принимать интрежер эррей
        // и внутри выводить только те значения которые odd ()if else

    }
}
