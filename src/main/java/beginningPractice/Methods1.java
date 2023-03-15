package beginningPractice;

//Нужно создать три метода первый принимает в себя инт, второе принимает в себя стринг,
// третье должно принимать в себя эррей оф стринг
//каждое значение приходящее с параметра добавив смс 'This value from parameter -> '
public class Methods1 {
    public static void main(String[] args) {

        String[] names = new String[]{"Bob", "Aigerim eje", "Nurbek", "Samat"};
        String[] colors = new String[]{"Black", "White", "Green", "Yellow", "Grey"};

        printArray(names);
        printArray(colors);

        sayHello();

        sayHello(253253, "wertyuiklqfsdaf");
        getInt(1000);
        getInt(216);

        reverse("bishkek");
        reverse("hello");
        reverse("CodeWise");




    }

    public void printHello() {
        sayHello();
    }

    public void printArray() {

    }


    public static void sayHello() {
        System.out.println("Hello world!");
    }

    public static void sayHello(int val, String text) {

        System.out.println(val);

        System.out.println("Hello world!" + val);

        System.out.println(val + 1234235);

        System.out.println("This text from parameters -> " + text);
    }


    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("----------------------");
    }

    public static void getInt(int name) {

        int sum = name - 100;
        System.out.println(sum);
    }

    public static void reverse(String name) {

        for (int a = name.length() - 1; a >= 0; a--) {
            System.out.print(name.charAt(a));
        }
        System.out.print("\n");
        System.out.println();


    }
}
