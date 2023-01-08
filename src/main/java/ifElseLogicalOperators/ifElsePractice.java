package ifElseLogicalOperators;

public class ifElsePractice {
    public static void main(String[] args) {

        int x = 100;
        int y = 20;

        if (x == y){
            System.out.println("x is equal to y");
        }else if (y <= x){
            System.out.println("this is my 1 else if code");
        }else if(x >= y){
            System.out.println("x is more than y");
        }else if(x != y){

        }else{
            System.out.println("this is my else condition");
        }
        System.out.println(x + y);

//        ======================

        String weather = "gloomy";
        float tempInFahrenheit = 90.5f;

        if(weather.equals("sunny")){
            System.out.println("Let's go to the beach!");
        }else if(true){

        }
        System.out.println("other code");

        if (tempInFahrenheit > 104){
            System.out.println("Stay home! Too hot outside!");
        }

        System.out.println("other code");

        if (tempInFahrenheit > 90){
            System.out.println("Let's go walking");
        }


    }
}






