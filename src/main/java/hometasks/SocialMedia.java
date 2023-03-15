package hometasks;

public class SocialMedia {
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

