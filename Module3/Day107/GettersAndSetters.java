import java.util.*;

public class GettersAndSetters {

    public static class YoutubeVideo {

        String name;
        int noOfViews, noOfLikes;
        ArrayList<String> comments;
        boolean containsCaptions;
    

        // Setters

        void setName(String newName) {
            name = newName;
        }
        void setNoOfViews(int views) {
            noOfViews = views;
        }
        void setNoOfLikes(int likes) {
            noOfLikes = likes;
        }
        void setComments(ArrayList<String> newComments) {
            comments = newComments;
        }


        // Getters 

        String getName() {
            return name;
        }
        int getNoOfViews() {
            return noOfViews;
        }
        int getNoOfLikes() {
            return noOfLikes;
        }
        ArrayList<String> getComments() {
            return comments;
        }

    }

    public static void main(String[] args) {

        YoutubeVideo songVideo = new YoutubeVideo();

        ArrayList<String> comms = new ArrayList<>();
        comms.add("Good");
        comms.add("Nice");

        // INSTEAD OF DOING THIS
        // songVideo.name = "Kesariya"; 

        // DO THIS
        songVideo.setName("Kesariya");
        songVideo.setNoOfLikes(5000000);
        songVideo.setNoOfViews(45000000);
        songVideo.setComments(comms);
        
        // ----------------------------------------------------------------

        // INSTEAD OF DOING THIS
        // System.out.println("Name of Video : "+songVideo.name);
        
        // DO THIS
        System.out.println("Name of Video : "+songVideo.getName());
        System.out.println("Views : "+songVideo.getNoOfViews());
        System.out.println("Likes : "+songVideo.getNoOfLikes());
        System.out.println("Comments : "+songVideo.getComments());

    }

}