package wrapperClass;

public class RecapAutoboxing {
    public static void main(String[] args) {

    /*
    autoboxing -converts primitives to objects
     */

        int a = 5; //
        Integer aa = a; // this is autoboxing

        Integer bb = 10;//// this is also autoboxing assigned right away
        Integer bb1 = 10;
        System.out.println(bb1);//10
//----------------------------------------
        bb1 = 15;
        System.out.println(bb); //10

        bb1 = Integer.valueOf("10");

        System.out.println(bb == bb1); //
        System.out.println(bb.equals(bb1)); //

        bb = 20;


//__________________________________________
        //byte, short, long, float, double, boolean, char

        byte b = 6;
        Byte b1 = b;

        Byte b2 = 15;
//----------------------------------------
        float c = 1.5f;
        Float c1 = c;

        Float c2 = 11.f;
//------------------------------
        double d = 5689.5;
        Double d1 = d;

        Double d2 = 5689.565;
//-----------------------------


    }

}
