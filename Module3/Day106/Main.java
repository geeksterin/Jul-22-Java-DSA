import java.util.*;

public class Main {

    public static class YoutubeVideo {

        String name;
        int noOfViews, noOfLikes;
        ArrayList<String> comments;
        boolean containsCaptions;
    
        void pressLikeButton() {
            noOfLikes++;
        }

        void addComment(String comment) {
            comments.add(comment);
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        YoutubeVideo songVideo = new YoutubeVideo();
     
        songVideo.name = "Kesariya";
        songVideo.noOfLikes = 5000000;
        // songVideo.containsCaptions = false;
        songVideo.comments = new ArrayList<>();
        songVideo.comments.add("Good");
        songVideo.comments.add("Nice");



        // 1. Like Check

        System.out.println("Likes before : "+songVideo.noOfLikes);

        songVideo.pressLikeButton();
        songVideo.pressLikeButton();

        System.out.println("Likes after  : "+songVideo.noOfLikes);



        // 2. Comment Chceck
        
        System.out.println("Comments before  : "+songVideo.comments);        

        System.out.print("WHat's your comment on the video:   ");
        String comment = sc.nextLine();
        songVideo.addComment(comment);

        System.out.println("Comments after  : "+songVideo.comments);        


    }

}