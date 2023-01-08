package wrapperClass;

public class PracticeCasting {
    public static void main(String[] args) {
        /*
        convert String to primitive int = "19932";
         */
        String stringNumber = "19932";
        Integer intNumber2 = Integer.valueOf(stringNumber);
        int r = intNumber2;
//------------------------------

        //convert StringNumber to primitive double

        Double dd = Double.valueOf(stringNumber);
        double dd2 = dd;

        Short sh = Short.valueOf(stringNumber);
        short sh2 = sh;
        long ll = Long.valueOf(stringNumber);
 //--------------------------------
        /*
        valueOf() returns Object
        parseInt() returns primitives
         */
        Integer.parseInt("123"); //==> int primitive = 123 primitive integer
        short a = Integer.valueOf("123").shortValue(); //==> Object Integer = 123
        byte b = Integer.valueOf("123").byteValue();
        byte c = (byte) Integer.parseInt("123");

        /*
        Task 6.
         */
        String intWrap = "123";
        Integer intWrap2 = Integer.valueOf(intWrap);
        Double doubleWrap = Double.valueOf(intWrap);
        Short shortWrap = Short.valueOf(intWrap);
        Byte byteWrap = Byte.valueOf(intWrap);

        /*
        Task 7. Covert Wrapper Integer object to String
         */
        Integer intObj = Integer.valueOf("1233");
        String stringObj = String.valueOf(intObj);
        String stringObj1 = String.valueOf(doubleWrap);

        /*
        Task 8. Convert Wrapper Integer object to primitive
         */
        Integer intObj2 = Integer.valueOf("200");
        int int1 = intObj2;
        int int2 = Integer.valueOf(intObj2);

        Double myDouble = Double.valueOf(123.432);
        double double1 = myDouble;
        Double myDouble2 = Double.parseDouble("12345.211");//autoboxing- primitive to object
        double double2 = myDouble2;//unboxing object to primitive

        Boolean boo = Boolean.valueOf(true);
        boolean boolean1 = boo;
        Boolean boo2 = Boolean.valueOf("FALSE");
        boolean boolean2 = boo2;

        //convert wrapper class object to string
        String str = Double.toString(40.0);
        str = boo2.toString();
        str = myDouble.toString();
        str = intObj.toString();

    }
}
