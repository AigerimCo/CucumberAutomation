package oop.encapsulation;

import java.util.Arrays;

public class ProgrammersClub {
    public static void main(String[] args) {
        Programmer p1 = new Programmer();
        p1.setName("Kylie");
        p1.setAge(21);
        p1.setProgrammingLanguages(new String []{"php", "go", "javascript"});
        p1.setEmployed(false);
        p1.setYearsOfExperience(0);

        System.out.println(p1.getName());
        System.out.println(Arrays.toString(p1.getProgrammingLanguages()));





    }
}
