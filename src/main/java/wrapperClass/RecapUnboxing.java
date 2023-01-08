package wrapperClass;

public class RecapUnboxing {
    public static void main(String[] args) {
        /*
        unboxing-convert object to primitive
         */
        Integer a = 10;
        int b = a;//unboxing

        Integer c = Integer.valueOf("123");
        b = c;//unboxing

//-------------------------
      Byte d = 11;
      byte e = d;

      Byte f = Byte.valueOf("567");
      Byte f1 = Byte.valueOf((byte)12);
 //---------------------------------
        Float g = 12.5f;
        float h =g;

        Float i = Float.valueOf((float)56.5f);
        Float ii = Float.valueOf("55.23");
 //------------------------------------------
 Long j = 13l;
 Long k = j;

 Long l = Long.valueOf((long)1123);
 //---------------------------
 Double n = Double.valueOf(123.88);
 Double m = n;
 //-----------------
        Boolean bool1 = Boolean.valueOf(true);
        boolean bool2 = bool1;
//-----------------------------------
        Character ch1 = Character.valueOf('%');
        char ch2=ch1;
//-------------------------------------------------

    }
}
