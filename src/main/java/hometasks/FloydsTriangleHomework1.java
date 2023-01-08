package hometasks;

public class FloydsTriangleHomework1 {
    public static void main(String[] args) {
    /*
     write a program using nested for loop, that will print
        the following output. It's called Floyd's Triangle.
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15
     */
        int c = 1;
       for (int a = 1; a <= 5; a++){
           for(int b = 1; b <= a; b++){
               System.out.print(c + " ");
               c++;

           }
           System.out.println();
       }

     }
}
