package methodOverloading;

import arrays.ArrayIntro;

public class MethodsIntro {

    /*
    parameter ask argument
    it's the data that your method needs

     */

    //  return type   name           parameters
         void         sayHi(String name, int age, double height) {
        System.out.println("hi " + name);
    }


    String sayHello(){
        return "9 any name";
    }


    int tellAge(){
        return 10;
    }

    double [] tellPrices(){
        return new double[]{};
    }


    ArrayIntro sayBye(){
        return new ArrayIntro();
    }

}



