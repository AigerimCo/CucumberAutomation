
package oop.abstraction;

public abstract class Country {

    int population;
    boolean hasAccessToOcean;

    String presidentName;
    String capital;
    String language;


    public Country(){

    }

    public Country(String countryName){

    }


    abstract public void implementNewLaw(String lawName, int year);

    public  void  implementNewLaw2(String lawName, int year){

    }


    // this is abstract method, doesn't have body. It gives only idea
    public abstract void exportProduct(String productName, String[] destinations);

}
