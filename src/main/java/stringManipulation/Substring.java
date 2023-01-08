package stringManipulation;

public class Substring {
    public static void main(String[] args) {

        String classes = "Java and soft skills classes";
        System.out.println(classes.substring(0, 4));// Java
        /*
        substring (), takes 2 integers, and returns a string from index 1, up to index 2
        beginning index = inclusive
        end index = exclusive
         */
        System.out.println(classes.substring(9, 20));
        String soft = "soft skills"; //11

        String result = (classes.substring(classes.indexOf(soft), classes.indexOf(soft) + soft.length()));

        int beginIndex = classes.indexOf(soft);
        int lastIndex = beginIndex + soft.length();
        result = classes.substring(11, 20);

        System.out.println(result);


        ///////////////

        String sentence = "Johny Depp is the best actor in the world!";
        String name = "Johny Depp";

        String newName = sentence.substring(sentence.indexOf(name), sentence.indexOf(name)) + name.length();

        System.out.println(newName);

//=============================

        String laptop = "Macbook Pro 2023. Please get it";
        laptop = laptop.substring(12); //2023
        System.out.println(laptop);

        String mobilePhone = "iPhone 14 pro max is the most expensive";
        mobilePhone = mobilePhone.substring(1); //Phone 14 pro max is the most expensive

        System.out.println(mobilePhone.substring(1));


    }
}
