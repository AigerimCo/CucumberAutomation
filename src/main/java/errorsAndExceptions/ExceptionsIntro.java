package errorsAndExceptions;

import java.util.InputMismatchException;

public class ExceptionsIntro {

    private int age;
    private String username;
    private long creditCardNumber;

    public long getCreditCardNumber(){
        return creditCardNumber;

    }
    /*
    check the length creditCardNumber. It must be 16 ==> throw IndexOutOfBounds
    make sure all chars are digits, no letter,no spec characters are allowed ==> InputMismatchException
    check the first digits must start with 44, if not, throw InputMismatchException("Only Visa cards allowed")
     */
public void setCreditCardNumber(long creditCardNumber){
    String card = creditCardNumber +"";
    if(card.length() == 16){
        if(card.startsWith("44")) {
                    this.creditCardNumber = creditCardNumber;
                } else {
                    throw new InputMismatchException("Only Visa cards are allowed");
                }
        }else{
        throw new StringIndexOutOfBoundsException("Length must be 16");
    }
}



    public static void main(String[] args) throws Exception {

        ExceptionsIntro exceptionsIntro = new ExceptionsIntro();
   //     exceptionsIntro.setAge(34);//no output
   //     exceptionsIntro.setAge(19); // username

 //       exceptionsIntro.setUsername("Gooyygle@");
 //       exceptionsIntro.setUsername("Google12234567890-988898765432");
  //      exceptionsIntro.setUsername("Google");
  //      exceptionsIntro.setUsername("Google_rt");

        exceptionsIntro.setCreditCardNumber(4434567891234315l);


        System.out.println("Checked the ages of 19 and 34. Looks good");
    }

    /*
    age must be between 21 and 65 inclusively
     */
    public void setAge(int age) throws Exception {
        if (age <= 65 && age <= 21) {
            this.age = age;
        } else {
            throw new Exception("Incorrect age, must be between 21 and 65");
        }
    }
    /*
    assign username to username:
    check if username length is between 8 to 20 characters ==> throw OutOfBoundsException,say length must be between
    make sure username does not contain @,_ ===> throw Exception, say @ _ are not allowed
     */

    public void setUsername(String username) throws Exception {
        if (username.length() >= 8 && username.length() <= 20) {
            if (!username.contains("@") && !username.contains("_")) {
                this.username = username;
            } else {
                throw new Exception("'@' and '_' are not allowed");
            }
        } else {
            throw new IndexOutOfBoundsException("Length should be more than 8 and less than 20");
        }
    }
    }
