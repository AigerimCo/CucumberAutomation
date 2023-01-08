package recap;

public class RecapIfElse {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        boolean isTrue = a < b;//true

        System.out.println("This is before if condition");

        if (isTrue){
            System.out.println("we are inside if condition");
        }

        System.out.println("this is after if condition");
// =============================

        String word = "apple banana";

        if (word.contains("apple")){
            System.out.println("word contains apple");
        }

        System.out.println("after if condition");
// ===========================

        String weather = "clooody";

        if (weather.equals("nice")) {
            System.out.println("I go camping");
        }

        else if (weather.equals("cloudy")) {
            System.out.println("I go jogging");
        }

        else {
            System.out.println("unclear, staying home");
        }

// =============================================

/*
if (boolean)
else if (boolean)
else

if (boolean)
else if (boolean)
else if (boolean)
else if (boolean)
else if (boolean)
else

you cannot start your if statement with else or else if

if (boolean)
else
*/
        double budgetForShopping = 600;
        double priceForBag = 499.99;
        double priceForJacket = 285.99;
        double priceForCoat = 1000.00;

        if(budgetForShopping >= priceForBag){
            System.out.println("buying the bag");
            budgetForShopping = budgetForShopping - priceForBag;
        }

        System.out.println("Go to another store");
        System.out.println("Found a beautiful jacket!!! for: " + priceForJacket);

        if(budgetForShopping >= priceForJacket){
            System.out.println("buying the jacket!");
            budgetForShopping -= priceForJacket;
        }else {
            System.out.println("not enough money");
        }

        System.out.println("Go to Nordstrom, found THE coat for " + priceForCoat);

        if(budgetForShopping > priceForCoat){
            System.out.println("getting the coat");
            budgetForShopping -= priceForCoat;
        }else if (budgetForShopping == priceForCoat){
            System.out.println("not getting the coat, because i need money for gas and lunch");
        }else{
            System.out.println("no coat, because there is only " + budgetForShopping);
            System.out.println("We have savings. Let's check if we have enough");

            double savings = 500.00;

            if (priceForCoat - budgetForShopping <= savings){
                System.out.println("Horray, we have enough money! buying the coat");
                budgetForShopping = budgetForShopping + savings - priceForCoat;
                System.out.println(budgetForShopping + " is leftover money");
            } else {
                System.out.println("Sorry, too expensive. No coat this time");
                System.out.println("we only had: " + budgetForShopping + savings);
                System.out.println("But the coat is: " + priceForCoat);
            }
        }
    }
}




