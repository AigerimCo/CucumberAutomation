package loops;

public class LoopPrintEachLetter {
    public static void main(String[] args) {

        String title = "OK Class. We done!";
        printEachLetter(title);

}
    /*
    create a method that accepts a String and print each letter separately on a new line.
          FLOW:
         >James
          result:
          J
          a
          m
          e
          s

          PSEUDO CODE
          1. Method signature
          2. Run a loop that runs the length amount of times of given string
          3. I need to somehow  get each letter of the given string
          4.  print it out on a new line

          add small check in the beginning
          print "Invalid word. String cannot be empty" if string is empty
     */
    public static void printEachLetter(String word){
        if(word.isEmpty()) {
            System.out.println("Invalid data. String cannot be empty");
        }else{
            for(int i = 0; i < word.length(); i++){ // word.length can be used by giving any name like Bob,Karen and etc.
                //get each character from string
                char c = word.charAt(i);
                System.out.println(c);
            }
        }

    }

}