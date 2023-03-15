package oop.encapsulation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserAccount {



    public static void main(String[] args) {
        UserAccount ua = new UserAccount();
        ua.setUsername("@benokabai");
        ua.setPassword("abc12323433");
        ua.setPassword("aB1/aaaaaa");

        ua.setPassword2("abc12323433");
        ua.setPassword2("aB1/aaaaaa");

    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {

        if (zipcode.length() == 5){
            for (int i = 0; i < zipcode.length(); i++){
                if (!Character.isDigit(zipcode.charAt(i))){
                    System.out.println("ERROR, zip code must consist of digits only, no letters no spec chars");
                    break;
                }else{
                    System.out.println("Good zipcode: " + zipcode);
                    this.zipcode = zipcode;
                }
            }
        }else {
            System.out.println("ERROR, zipcode must consist of 5 digits");
        }
    }

    private String zipcode;


   /*
    username does not contain !,#,$,%,&,*,(,),=,+
    username.length is more than 40 characters
     */


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {

        String regex = "[!#$%^&*()+={}|:;,?><~]";
        Pattern pattern = Pattern.compile(regex);
        Matcher mather = pattern.matcher(username);

        if (username.length() <= 40 && !mather.find()) {
            System.out.println("Good username! " + username);
            this.username = username;
        } else {
            System.out.println("ERROR! Make sure username is less than 40 and does not contain any special character except for _ - . @");
        }
    }

    /*
            underscore
            dash
            @ at
            username does not contain !,#,$,%,&,*,(,),=,+
   */
    public String getPassword() {
        return password;
    }

     /*
    password length is at least 8 characters
    password contains one upper case letter,
    one lower case letter, one digit, one special char

    Character.isDigit(char)
    Character.isLetter(char)
    Character.isUpperCase(char)
    Character.isLowerCase(char)
     */

    public void setPassword(String password) {

        if(password.length() >= 8 && password.length() <= 20){

            boolean hasDigit = false;
            boolean hasUpperCase = false;
            boolean hasLowerCase = false;
            boolean hasSpecCharacter = false;

            for (int i = 0; i < password.length(); i++){
                if (Character.isDigit(password.charAt(i))){
                    hasDigit = true;
                }
                else if(Character.isUpperCase(password.charAt(i))){
                    hasUpperCase = true;
                }
                else if(Character.isLowerCase(password.charAt(i))){
                    hasLowerCase = true;
                }
                else {
                    hasSpecCharacter = true;
                }
            }

            if(hasDigit && hasUpperCase && hasLowerCase && hasSpecCharacter){
                System.out.println("Good password: " + password);
                this.password = password;
            }else{
                System.out.println("ERROR! Password must contain at least: 1 spec character, 1 digit, 1 uppercase letter, 1 lowercase letter");
            }
        }else{
            System.out.println("ERROR! Password's length should be from 8 to 20 characters");
        }


    }

    /*
    1 uppercase, 1 lowercase, 1 digit, 1 special character
    length from 5 to 15 inclusively
     */

    public boolean setPassword2(String password){
        String lowerCaseRegex = "[a-z]";
        String upperCaseRegex = "[A-Z]";
        String digitRegex = "[0-9]";
        String specialCharRegex = "[!@#$%^&*()_+{}/|<>,.:;']";

        String [] array = new String[]{lowerCaseRegex, upperCaseRegex, digitRegex, specialCharRegex};

        if(password.length() < 5 || password.length() > 15){
            System.out.println("ERROR: password length must be in range from 5 to 15. Returning false");
            return false;
        }

        for (String regex : array){
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(password);

            if(!matcher.find()){
                System.out.println("ERROR: please provide at least 1 spec char, 1 upper case, 1 lower case, 1 digit. Returning false");
                return false;
            }
        }

        this.password = password;
        System.out.println("Good password, returning true");
        return true;
    }

    public boolean isPrivateAccount() {
        return isPrivateAccount;
    }

    public void setPrivateAccount(boolean privateAccount) {
        isPrivateAccount = privateAccount;
    }

    private String username;
    private String password;
    private boolean isPrivateAccount;

    /*
    IDE - integrated development environment
    Intellij, Eclipse
     */
}
