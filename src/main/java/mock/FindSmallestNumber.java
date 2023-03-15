package mock;

public class FindSmallestNumber {
    public static void main(String[] args) {
        System.out.println(findSmallest(55,12,76));
        System.out.println(findSmallest(23,89,-11));
    }
    public static int findSmallest(int a, int b, int c){
        if(a < b && a < c){
            return a;
        }
        else if (b < a && b < c){
            return b;
        }
        return c;
    }
}
