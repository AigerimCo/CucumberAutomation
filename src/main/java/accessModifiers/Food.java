package accessModifiers;

public class Food {

    private Food(){
    }

    Food(String foodName, int calories){
    }

    protected Food(String foodName){

    }

    public Food(String foodName, double price, boolean isExpensive){

    }

    protected String foodName = "salad";

    public static void main(String[] args) {
        Restaurant res = new Restaurant();

        Food food = new Food();


    }

}




