package hometasks;

public class User {

    String name;
    String lastName;
    String instagramProfile;
    String gender;
    String haveRestrictions;
    int age;
    int likes;
    int followers;
    int following;
    boolean isPrivate;
    boolean isBlogger;

    public User(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public User(String name, String lastName,String gender){
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
     }
    public User(String name, String instagramProfile,boolean isPrivate){
        this.name = name;
        this.instagramProfile = instagramProfile;
        this.isPrivate = isPrivate;
    }
    public User(String name, int followers, int following){
        this.name = name;
        this.followers = followers;
        this.following = following;
    }
    public User(String instagramProfile, String haveRestrictions){
        this.instagramProfile = instagramProfile;
        this.haveRestrictions = haveRestrictions;
    }
    public User(String instagramProfile, int following){
        this.instagramProfile = instagramProfile;
        this.following = following;
    }
    public User(boolean isPrivate, String name, int followers){
        this.isPrivate = isPrivate;
        this.name = name;
        this.followers =followers;
    }
    public User(String instagramProfile, int age,int followers, int likes){
        this.instagramProfile = instagramProfile;
        this.age = age;
        this.followers = followers;
        this.likes = likes;
    }
    public User(String instagramProfile,boolean isBlogger){
        this.instagramProfile = instagramProfile;
        this.isBlogger = isBlogger;
    }
    public User(String name, int likes, boolean isBlogger){
        this.name = name;
        this.likes = likes;
        this.isBlogger = isBlogger;

    }

}
class Instagram {
    public static void main(String[] args) {

        User user1 = new User("Alex", 20, "male");
        User user2 = new User("Amanda", "Shepfield","female");
        User user3 = new User("John", "@johnyk",true);
        User user4 = new User("Anthony", 855,1500);
        User user5 = new User("@tiffanyBeau", "hiding likes and reviews");
        User user6 = new User("@mr.handsome", 989);
        User user7 = new User(true,"@guselrose", 15);
        User user8 = new User("@spidergirl",19,9,26);
        User user9 = new User("@leomessi", false);
        User user10 = new User("Bella", 100000,true);


        System.out.println("My name is " + user1.name + ", I am " + user1.age + " years old " + ", and I am " + user1.gender);
        System.out.println(user2.name + " " + user2.lastName + " is a " + user2.gender);
        System.out.println("This is " + user3.name + ", his profile is " + user3.instagramProfile + ", and its " + user3.isPrivate + " that his account is private");
        System.out.println(user4.name + " has " + user4.followers + " followers and he is following " + user4.following + " people");
        System.out.println(user5.instagramProfile + " activated an option of " + user5.haveRestrictions);
        System.out.println(user6.instagramProfile + " is following " + user6.following + " people");
        System.out.println("It`s " + user7.isPrivate + " that " + user7.name + " has only " + user7.followers + " followers");
        System.out.println(user8.instagramProfile + " is " + user8.age + " years old, and she has only " + user8.followers + " followers and " + user8.likes + " likes so far");
        System.out.println(user9.instagramProfile + " is a world famous soccer player, and it is " + user9.isBlogger + " that he is a blogger");
        System.out.println(user10.name + " has over " + user10.likes + " likes, and it`s " + user10.isBlogger + " that she is a Blogger");


    }
}
