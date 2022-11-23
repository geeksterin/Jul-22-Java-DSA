import java.util.*;

public class This {

    public static class YoutubeVideo {

        String name;
        int noOfViews, noOfLikes;
        ArrayList<String> comments;
        boolean containsCaptions;

        // Setters

        // void setName( String newName ) {
        //     name = newName;
        // }
        void setName( String name ) {
            this.name = name;
        }
        void setNoOfViews(int noOfViews) {
            this.noOfViews = noOfViews;
        }
        void setNoOfLikes(int noOfLikes) {
            this.noOfLikes = noOfLikes;
        }
        void setComments(ArrayList<String> comments) {
            this.comments = comments;
        }


        // Getters 

        String getName() {
            return this.name;
        }
        int getNoOfViews() {
            return this.noOfViews;
        }
        int getNoOfLikes() {
            return this.noOfLikes;
        }
        ArrayList<String> getComments() {
            return this.comments;
        }

    }

    public static void main(String[] args) {

        YoutubeVideo songVideo = new YoutubeVideo();

        ArrayList<String> comms = new ArrayList<>();
        comms.add("Good");
        comms.add("Nice");

        songVideo.setName("Kesariya");
        songVideo.setNoOfLikes(5000000);
        songVideo.setNoOfViews(45000000);
        songVideo.setComments(comms);
        
        System.out.println("Name of Video : "+songVideo.getName());
        System.out.println("Views : "+songVideo.getNoOfViews());
        System.out.println("Likes : "+songVideo.getNoOfLikes());
        System.out.println("Comments : "+songVideo.getComments());

    }

}