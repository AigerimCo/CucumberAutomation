package methodOverloading;

public class InstagramUser {

    String name;
    String username;
    String password;
    String bio;
    String link;
    boolean isPrivate;
    public InstagramUser(String name, String username, String password){
        // We use 'this' keyword.
        // 'this' keyword is a reference to an object of the class.
        // Most common use of 'this' keyword is to set values of instance variables
        // when they have the same name with constructor parameter
        this.name = name; // user1.name = name;
        this.username = username;
        this.password = password;
        this.isPrivate = false;
        this.link = "www.instagram.com";
    }

    public InstagramUser(String name, String username, String password, String bio){
        this(name, username, password);
        this.bio = bio;
    }

    public InstagramUser(String name, String username, String password, String bio, String link){
        this(name, username, password, bio);
        this.link = link;
    }


    public void display(){
        System.out.println("User details");
        System.out.println("Name: " + this.name);
        System.out.println("Username: " + this.username);
        System.out.println("Password: " + this.password);
        System.out.println("Bio: " + this.bio);
        System.out.println("Link: " + this.link);
        System.out.println("Is private: " + this.isPrivate + "\n");
    }

    // create a method in InstagramUser called postStory
   // this method accepts a String for message and print out that message

    public void postStory(String message){
        System.out.println(this.name + " just posted a story " + message + "\n");
    }

    public void visitProfile(InstagramUser user){
        if(user.isPrivate == true) {
            System.out.println(("The user is private. Can't display profile details"));
        }
        else{
            System.out.println("Profile visit is success");
            System.out.println("Visited profile");
        }

    }
}