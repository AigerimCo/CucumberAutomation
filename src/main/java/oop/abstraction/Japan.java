package oop.abstraction;


public abstract class Japan extends Country {


    @Override
    public void implementNewLaw(String lawName, int year) {

    }

    public void exportProduct(String productName, String[] destinations) {

        for (int i = 0; i < destinations.length; i++){
            System.out.println("Japan is exporting the " + productName + " to " + destinations[i] + " by sea");

            if (destinations[i].equals("South Korea")){
                System.out.println("Japan is exporting the " + productName + " to South Korea by ferry");
            }

        }

    }


}
