package oop.abstraction;

public class Tokyo extends Japan{
    public static void main(String[] args) {

//        Country country = new Country();
        USA usa = new USA() {
            @Override
            public void conductIndependentElectionForGovernment() {

            }

            @Override
            public void supportOpposition() {

            }
        };


    }
}
