package oop.encapsulation;

public class Programmer {

    private String name;

    private int age;

    private String [] programmingLanguages;

    private boolean isEmployed;

    private int yearsOfExperience;

    //  ============== SETTER & GETTER =============
    public String getName(){
        return name;     // ====> getter method
    }

    public void setName(String name){

        String reverse = "";
        name = name.toLowerCase(); //daniel => leinad => Leinad

        for (int i = name.length()-1; i >= 0; i--){
            reverse += name.charAt(i);
        }

        reverse = reverse.substring(0, 1).toUpperCase() + reverse.substring(1);

        this.name = reverse;
    }


    public int getAge(){
        return age;
    }


    public void setAge(int age){

        if(age >= 21){
            this.age = age;
        }else{
            System.out.println("sorry, 21 years and older only in the club!");
        }

    }

    public String [] getProgrammingLanguages(){
        return programmingLanguages;
    }

    public void setProgrammingLanguages(String [] programmingLanguages){

        boolean hasJava = false;

        for (int i = 0; i < programmingLanguages.length; i++){
            if (programmingLanguages[i].equalsIgnoreCase("java")){
                this.programmingLanguages = programmingLanguages;
                hasJava = true;
                break;
            }else{
                hasJava = false;
            }
        }

        if(!hasJava) {
            System.out.println("Oh, no java = no club, sorry");
        }

    }

    public boolean getEmployed(){
        return isEmployed;
    }

    public void setEmployed(boolean isEmployed){
        this.isEmployed = isEmployed;
    }

    public int getYearsOfExperience(){
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience){
        this.yearsOfExperience = yearsOfExperience;
    }



}
