package methodOverloading;

public class InstagramApp {
    public static void main(String[] args){

        //newly created object and they need parameters //because of instagramUser==> line 12
        InstagramUser user1 = new InstagramUser("James Bond", "jb2022", "JB2022!");
        user1.display();

        InstagramUser user2 = new InstagramUser("John Wick", "jw20", "Wick22", "I am an actor");
        user2.display();

        InstagramUser user3 = new InstagramUser("Cristiano Ronalno", "ronaldo", "CR7", "Football is life", "cr.com");
        user3.display();

/*
        String name = "James";
        String title = "7 habits";

        title = name;
        System.out.println(name);
        System.out.println(title);

         i want to print "7 habits";
        we can NOT. We lost it when we were reassigning the value for title on line 19
        "7 habits" text has no reference any more
 */

        user3.display();

        user1.display();
        user2.display();
        user3.display();

        user2.postStory("I am coming back!");
        user1.postStory("Game is on today...");

        user3.visitProfile(user1);
        user3.visitProfile(user2);
        // James Bond want to make his profile private
        user1.isPrivate = true;
        System.out.println();

        user3.visitProfile(user1);
        user3.visitProfile(user2);

    }

}