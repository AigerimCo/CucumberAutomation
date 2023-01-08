package recap;

public class YoutubeVideo {

    ///CREATE A CLASS YOUTUBE VIDEO. CREATE 5 instance variables related to the youtube video. Create method
    // //include boolean, int,String. Create method watch and increment view variable. Create a method comment.
    // Method concatenate the new comment to comments instance variable.

    //Pseudo code-steps;
    //a. method signature: void method, watch name, method parameters ->no parameters
    //b. add 1 to current views


    //1)  instance variables
    String title;
    String comments;
    int views;
    int likes;
    boolean isPrivate;

    //a. method signature: void method,
    //watch name, method parameters -> no parameters
    //   b. add 1 to current views
    public void watch() {
        if(isPrivate){
            System.out.println("Sorry the video is private");
        }else{
            System.out.println("Enjoy the video!");
            views++; // views = views + 1;
        }
    }




    public void like() {
        likes++;
    }

    //3. Method concatenate the new comment to comments instance variable.
    //pseudo code:method signature: void method,comment name, string comment
    //add given new comment to already existing comments
    public void comment(String newComment) {
        comments = comments + newComment;
        /*
        String name = "James";
        name + " hello" => "James hello";
        name + 45 => "James45"
         */
    }

    // PSEUDO CODE
    //a. method signature: void method, makePrivate, boolean
    //b. set isPrivate to true

    public void makePrivate() {
//        if (isPrivate) =true;
        {
            System.out.println("Sorry the video is private");
   //     }else{

        }

    }

}
