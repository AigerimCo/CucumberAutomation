package wrapperClass;

public class RecapWrapperClass {
    public static void main(String[] args) {

/*
 create one int and one boolean object with data
 */

        Integer a = 5;
        Boolean b =true;

      Integer m = 1235;
      int p = m;

      boolean n = true;
      Boolean j = n;

      Integer k = Integer.valueOf(5);
      Integer k2 = Integer.valueOf("4");

      Float k3 = Float.valueOf(11.5f);
      Float k4 = Float.valueOf("11");
      Float k5 = 11.5f;

      Short k6 = Short.valueOf("11");
      Short k7 = Short.valueOf((short)11);
      Short k8 = 11;

      Byte k9 = Byte.valueOf((byte)1);
      Byte l1 = Byte.valueOf("11");
      Byte l2 = 1;

//=================================================
        /*
        create objects
        2 integer
        3 floats
        2 shorts
        2 byte
        4 boolean
        3 long
        2 double
         */
        Integer number = 5;
        Integer i =Integer.valueOf("3");
        Short s = Short.valueOf((short)6);

        Float aa = Float.valueOf(8.5f);
        Float ii = Float.valueOf("11");
        Float g = 11.5f;

        Short a1 = Short.valueOf("9");
        Short a2 = Short.valueOf((short)12);
        Short b1 = 10;

        Byte q = Byte.valueOf((byte)3);
        Byte q1 = 1;
        Byte  q3 = Byte.valueOf("5");

        Boolean w = Boolean.valueOf (true);
        Boolean w1 = Boolean.valueOf ("True");
        Boolean w2 = Boolean.valueOf("false");
        Boolean w4 = Boolean.valueOf ("SomeString");
        Boolean w5 = true;
        System.out.println(w4);

        Long v = Long.valueOf(7);
        Long v1 =4l;
        Long v3 = Long.valueOf((long)5);
        System.out.println(v1);

        Double P = Double.valueOf(5895.23);
        Double p1 = Double.valueOf("22233.85230");
        Double p2 = 5565.5d;
        System.out.println(p1);

    }


}
