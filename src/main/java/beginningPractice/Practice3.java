package beginningPractice;

public class Practice3 {
    public static void main(String[] args) {
        String name = "Kyrgyzstan";
        System.out.println(name.startsWith("lo"));//false
        char[] array = name.toCharArray();//gyz
        for (int i = 17; i <= 42; i++) {
            System.out.println(i);//from 17 to 42
        }

        for (int a = 80; a >= 20; a--) {
            System.out.println(a);//from 20 to 80
        }
        System.out.println(array[0]);//k
        System.out.println(array[1]);//y
        System.out.println(array[2]);//r
        System.out.println(array[3]);//g
        System.out.println("----------------------------------------");
        for (int b = array.length - 1; b >= 0; b--) {
            System.out.println(array[b]);//reverse==>   natszygryK
        }
        System.out.println("-----------------------------------");
        for (int c = 0; c < array.length; c++) {
            System.out.println(array[c]); //Kyrgyzstan
            System.out.println("________________");
        }
        for (int c = 0; c < array.length / 2; c++) {
            System.out.println(array[c]);//kyrgy
        }
        System.out.println("___________________________");

        for (int c = array.length / 2; c < array.length; c++) {
            System.out.println(array[c]);//zstan
        }
        System.out.println("=========================================");

        String word = "school";
        System.out.println(word.charAt(0));//s
        System.out.println(word.charAt(1));//c
        System.out.println(word.charAt(2));//h
        System.out.println("=======================");

        for (int word1 = 0; word1 < word.length(); word1++) {
            System.out.println(word.charAt(word1));//school
        }
        System.out.println("------------------------------");

        for (int bishkek = 0; bishkek < word.length() / 2; bishkek++) {
            System.out.println(word.charAt(bishkek));
        }
        System.out.println("----------------------------------");
        for (int i = word.length() / 2; i < word.length(); i++) {
            System.out.println(word.charAt(i));//sch
        }
        System.out.println("------------------------");

        //     for (int i = 5; i > 0; i--) {
        // school  012345  3210 length/2 = 3-1 2
        for (int i = word.length() / 2 - 1; i >= 0; i--) {
            System.out.println(word.charAt(i));//ool
        }
        System.out.println(("----------------------------------"));
//school 012345
        for (int a = word.length() / 2; a <= 0; a--) {
            System.out.println(word.charAt(a));//hcs
        }
        System.out.println("---------------------------------");

        //сделать реверс второй части слова
        //сделать реверсе первой и второй части эррей оф чарактер отдельно

       for (int b = word.length()-1; b >= word.length()/2; b--){
           System.out.println(word.charAt(b));//loo
        }
        System.out.println("___________________--");
        char[] message = {'s', 'c', 'h', 'o', 'o', 'l'};

        for (int a = message.length -1; a >= 0; a--) {
            System.out.println(message[a]);//loohcs
        }
        System.out.println("---------------------------------");

        for (int a = message.length / 2-1; a >= 0; a--) {
            System.out.println(message[a]);//hcs
        }
        System.out.println("=====================");

        for (int a = message.length -1; a >= message.length/2; a --){
            System.out.println(message[a]); //loo
        }
        System.out.println("===============================");

int[]array1 = {1,20,31,44,55,11,25,33,56,85,3,1,2};
for(int i = 0; i < array1.length; i++){
    System.out.println(array1[i]);
}
        System.out.println("=========================");

String[]array2 = new String[10];

        System.out.println();

//123,4,32,234
double[]array3=new double[]{1.2,3.3,5.5};
for(int a = array3.length-1; a >= 0; a--){
    System.out.println(array3[a]);
}
String sms = "My name is Nurbek";
for(int h = 0; h < 4; h++){
    System.out.println(sms);
}
    }
        }











