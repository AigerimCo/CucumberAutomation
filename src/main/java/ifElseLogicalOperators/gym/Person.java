package ifElseLogicalOperators.gym;

public class Person {

    String name;
    int age;
    double weight;
    boolean hasFreeTime;
    boolean isInMood;
    boolean hasStrongWill;
    int rating = 0;
    boolean hasExercised;


    public void goesToGym(boolean hasFreeTime){
        if(hasFreeTime){
            System.out.println(name + " goes to gym");
            rating++;
        }else{
            System.out.println(name + " goes to gym even if no time");
            rating+=2;
        }
    }


    public void worksOut(boolean mood){
        if(mood){
            System.out.println(name + " works out properly");
            rating+=2;
            hasExercised = true;
            //rating = rating + 2
        }else{
            rating++;
            hasExercised = true;
            System.out.println(name + " just hangs around");
        }
    }


    public void staysHome(boolean hasFreeTime, boolean isInMood){
        if(hasFreeTime && isInMood){
            System.out.println(name + " stays home even no obstacles");
            rating-=3;
        }
        else if(hasFreeTime && !isInMood){
            System.out.println(name + " has time, but not in mood and stays home");
            rating-=2;
        }else if(!hasFreeTime & isInMood){
            System.out.println(name  + " has no time, but in mood and home");
            rating--;
        }else{
            System.out.println(name + " has no time, no mood");
        }
    }


    public boolean losesWeight(){
        boolean losesWeight;
        if (hasExercised){
            System.out.println(name + " is losing weight");
            losesWeight = true;
        }else{
            System.out.println(name + " doesn't lose weight");
            losesWeight = false;
        }
        return losesWeight;
    }


}
