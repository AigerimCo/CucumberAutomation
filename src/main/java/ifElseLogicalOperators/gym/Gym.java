package ifElseLogicalOperators.gym;

public class Gym {
    public static void main(String[] args) {
        Person programmer = new Person();
        Person doctor = new Person();

        programmer.name = "Mark Zuckerberg";
        programmer.age = 40;
        programmer.weight = 75;
        programmer.hasStrongWill = true;

        doctor.name = "Komarovsky";
        doctor.age = 65;
        doctor.weight = 90;
        doctor.hasStrongWill = true;

        ///  DAY 1

        programmer.hasFreeTime = false;
        programmer.isInMood = true;
        programmer.goesToGym(programmer.hasFreeTime);
        programmer.worksOut(programmer.isInMood);

        doctor.hasFreeTime = true;
        doctor.isInMood = false;
        doctor.staysHome(doctor.hasFreeTime, doctor.isInMood);
        doctor.worksOut(doctor.isInMood);

        System.out.println("DAY 1. " + programmer.name + "s score: " + programmer.rating);
        System.out.println("DAY 1. " + doctor.name + "s score: " + doctor.rating);

        if (programmer.rating > doctor.rating){
            System.out.println(programmer.name + " is a winner!");
        } else if (doctor.rating > programmer.rating){
            System.out.println(doctor.name + " is a winner!");
        }else{
            System.out.println("Ratings are equal. Both are winners!");
        }

//        ===========================  DAY 2

        programmer.hasStrongWill = false;
        programmer.hasFreeTime = true;
        programmer.isInMood = false;

        doctor.hasStrongWill = false;
        doctor.hasFreeTime = false;
        doctor.isInMood = false;

        if(programmer.hasFreeTime && programmer.isInMood){
            programmer.goesToGym(programmer.hasFreeTime);
            programmer.worksOut(programmer.isInMood);
            programmer.losesWeight();
        }
        if(doctor.hasFreeTime && doctor.isInMood){
            doctor.goesToGym(doctor.hasFreeTime);
            doctor.worksOut(doctor.isInMood);
            doctor.losesWeight();
        }

        System.out.println("DAY 2. " + programmer.name + "s score: " + programmer.rating);
        System.out.println("DAY 2. " + doctor.name + "s score: " + doctor.rating);

        if (programmer.rating > doctor.rating){
            System.out.println(programmer.name + " is a winner!");
        } else if (doctor.rating > programmer.rating){
            System.out.println(doctor.name + " is a winner!");
        }else{
            System.out.println("Ratings are equal. Both are winners!");
        }

    }
}
