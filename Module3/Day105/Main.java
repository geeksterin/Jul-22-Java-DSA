import java.util.*;

public class Main {

    public static class YoutubeVideo {

        String name;
        int noOfViews, noOfLikes;
        ArrayList<String> comments;
        boolean containsCaptions;
    
    }

    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);

        // int num = 5;
        // ArrayList<String> arr = new ArrayList<String>();
        YoutubeVideo songVideo = new YoutubeVideo();
     
        songVideo.name = "Kesariya";
        songVideo.noOfLikes = 5000000;
        // songVideo.containsCaptions = false;
        songVideo.comments = new ArrayList<>();
        songVideo.comments.add("Good");
        songVideo.comments.add("Nice");
        
        System.out.println("Name of Video : "+songVideo.name);
        System.out.println("Views : "+songVideo.noOfViews);
        System.out.println("Likes : "+songVideo.noOfLikes);
        System.out.println("Comments : "+songVideo.comments);
        System.out.println("Captions : "+songVideo.containsCaptions);

    }

}