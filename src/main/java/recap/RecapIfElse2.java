package recap;

import java.util.Arrays;
import java.util.Scanner;

public class RecapIfElse2 {
    public static void main(String[] args) {
        /*
        -if statement must always come first
        -you may have as many if statement as you like
        =you may create if statements inside other if statements
        -you cannot start if statement with else if or else!
        -inside one if statement, you can only have one if and one else, and many else ifs
        =============================================
        if (true)
        else if (boolean condition) ==> java will not even check, since if was true

        if (false)
        else if (false)
        else if (true) ==> it goes inside code, and ignores all the rest
        else if (true)
        else {}

4 different independent if statements below, all will be checked

if(true) => this will be checked and executed
if(true) => this will be checked and executed
if(true) => this will be checked and executed
if(true) => this will be checked and executed
*/

        /*
        job hunting program

        if you have 1 offer and you were in market for more than 1 ,month, accept it right away
        else if, you have 1 offer and you were in market for less than 1 month {
             you check the salary, if salary is more than 100k , accept
             else reject}
        else if you have more than 1 offer, check salary {
            pick the offer which has highest salary and check if that salary is more than 120K
            else, keep searching for job
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("How many days you were in the market?");
        int jobHuntingTime = sc.nextInt();

        System.out.println("How many offers do you have?");
        int offersNumber = sc.nextInt();

        double[] salaries = new double[offersNumber];

        for (int i = 0; i < salaries.length; i++) {
            System.out.println("Please enter salary of offer #" + i);
            salaries[i] = sc.nextDouble();
        }

        System.out.println(Arrays.toString(salaries));

        if(offersNumber == 1){

            if(jobHuntingTime >= 30){
                System.out.println("I was in the market for more than a month, and I have 1 offer of " + salaries[0]);
                System.out.println("Accepting that offer");
            } else {
                if (salaries[0] >= 100000){
                    System.out.println("Accepting the offer since it's " + salaries[0]);
                    System.out.println("And I was in the market for less than a month, and got one offer");
                }else{
                    System.out.println("Salary is less than 100k, rejecting it");
                }
            }


        }else if(offersNumber > 1){
            Arrays.sort(salaries); //1 to 10

            if (salaries[salaries.length -1] >= 120000){
                System.out.println("Good job, more than 120k, accepting the offer");
            }else{
                System.out.println("Keep searching, since none of the offers is more than 120k");
            }


            }else{
            System.out.println("Keep searching, no jobs yet");

            }
            }
            }
