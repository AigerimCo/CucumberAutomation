package ifElseLogicalOperators;

public class OrOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 50;
        int c = 20;
        int d = 90;

        // true
        if (a > b || b == c){
            System.out.println("if condition");
        }else if (c == d || d > b || a < b){
            System.out.println("else if condition");
        }else{
            System.out.println("this is else");
        }
        /////////////////////////////


        boolean b1 = 10 > 5 || 5 < 3;
        System.out.println("10 > 5 || 5 < 3: " + b1);

        b1 = 5 > 0 || 5 < 10;
        System.out.println("5 > 0 || 5 < 10: " + b1);

        b1 = 5 == 5 && 5 > 4;
        System.out.println("5 == 5 && 5 > 4" + b1);

        //    true  &&   true  ||  false  &&  true
        b1 = 5 > 1 && 1 > 0 || 0 > 2 && 2 < 3;
        System.out.println(b1);


        b1 = true;
        boolean b2 = false;
        boolean b3 = true && false || true || true; //true
        b3 = false || true && true; //true
        b3 = true && true && false || true && true;
        System.out.println(b3);





    }
}
