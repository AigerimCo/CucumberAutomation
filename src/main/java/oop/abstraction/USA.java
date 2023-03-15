package oop.abstraction;

public abstract class USA extends Country{


    public abstract void conductIndependentElectionForGovernment();

    public abstract void supportOpposition();


    @Override //optional tag
    public void implementNewLaw(String lawName, int year) {
        System.out.println("In " + year + " USA implemented new law: " + lawName);
    }

    //concrete method
    public void exportProduct(String productName, String [] destinations){

        for (String destination : destinations){
            if (destination.equals("Mexico") || destination.equals("Canada")){
                System.out.println("USA is exporting the " + productName + " by railroad to " + destination);
            }else{
                System.out.println("USA is exporting the " + productName + " by ocean to " + destination);
            }
        }
    }

    public static void main(String[] args) {

        USA usa = new USA() {
            @Override
            public void conductIndependentElectionForGovernment() {

            }

            @Override
            public void supportOpposition() {

            }
        };
        usa.exportProduct("IT solutions", new String []{"Mexico", "Germany", "Kazakhstan"});



    }
}
