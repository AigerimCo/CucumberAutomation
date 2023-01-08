package recap;

public class RecapStringManipulation2 {
    public static void main(String[] args) {
        /*
        startsWith() checks wheathr String starts with given string
        it returns true or false
        endsWith() checks whether String ends with given string
        it returns true or false
         */

        String str = "hello everyone";
        System.out.println(str.startsWith ("he"));//true
        System.out.println(str.startsWith ("hello"));//true

        boolean b = str.endsWith("one");
        System.out.println(b);//true

        System.out.println("everyone ");//false because of space at the end
        System.out.println("every one ");//false
        System.out.println(" everyone ");//true
        System.out.println("Everyone ");//false


        //=======================
        /*   trim() is method that can be used only by String, it removes empty spaces
        from both ends of String
        from beginning and ending
         */
    }
}
