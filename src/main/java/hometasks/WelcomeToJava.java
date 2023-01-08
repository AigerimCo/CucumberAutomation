package hometasks;

public class WelcomeToJava {
    public static void main(String[] args) {
        String str = "WelcomeToJava";
        String smallest = "";
        String largest = "";
        int k = 3;
        for(int i = k; i < str.length()-k + 1; i++){
            str=str.substring(1,k) + str.charAt(i);
            if(smallest.compareTo(str) < 0){
                smallest = str;
            }
            if (largest.compareTo(str) < 0) {

                largest=str;
            }
            System.out.println(smallest);
            System.out.println(largest);

        }
    }
}
