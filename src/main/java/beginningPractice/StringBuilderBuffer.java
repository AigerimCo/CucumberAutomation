package beginningPractice;

public class StringBuilderBuffer {
    public static void main(String[] args) {
        String text = "Nurbek abdirasulov";

        for (int i = text.length() - 1; 0 <= i ; i--) {
            System.out.print(text.charAt(i));
        }

        for (int i = 0; i < 10; i++) {
            text += "a";
        }

        System.out.println();

        System.out.println(text);

        System.out.println("-------------------------------");

        StringBuilder stringBuilder = new StringBuilder("Nurbek abdirasulov");
        stringBuilder.reverse();
        System.out.println(stringBuilder);

        for (int i = 0; i < 10; i++) {
            stringBuilder.append("a");
        }

        System.out.println(stringBuilder);


        System.out.println("==================================");


        StringBuffer stingBuffer = new StringBuffer("Nurbek abdirasulov");
        stingBuffer.reverse();
        System.out.println(stingBuffer);

        for (int i = 0; i < 10; i++) {
            stingBuffer.append("a");
        }

        System.out.println(stingBuffer);
    }
}
