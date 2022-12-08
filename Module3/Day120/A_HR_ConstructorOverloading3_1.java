import java.util.* ;
import java.io.* ;

class YoutubeVideo {

    String song, artist;
    int noOfViews, noOfLikes, releasedYear, n;
    ArrayList<String> comments;
    
    YoutubeVideo() {
        this.noOfViews = 0;
        this.noOfLikes = 0;
    }

    YoutubeVideo(String song, String artist, int noOfViews, int noOfLikes) {
        this.song = song;
        this.artist = artist;
        this.noOfViews = noOfViews;
        this.noOfLikes = noOfLikes;
        System.out.println("The song has just released");
    }
    YoutubeVideo(String song, String artist, int noOfViews, int noOfLikes, int releasedYear) {
        this.song = song;
        this.artist = artist;
        this.noOfViews = noOfViews;
        this.noOfLikes = noOfLikes;
        this.releasedYear = releasedYear;
        System.out.println("The song was released in " + this.releasedYear);
    }

}

class A_HR_ConstructorOverloading3_1 {

    public static void main( String args[] ) {

        Scanner sc = new Scanner(System.in);

        String song = sc.nextLine();
        String artist = sc.nextLine();
        int noOfViews = sc.nextInt();
        int noOfLikes = sc.nextInt();
        int releasedYear = sc.nextInt();
        int n = sc.nextInt();
        ArrayList<String> comments = new ArrayList<String>();
        
        sc.nextLine();
        for ( int i = 0; i < n ; i++ ) {
            comments.add(sc.nextLine());
        }

        // INPUT TAKEN

        int k = sc.nextInt();

        YoutubeVideo songVideo;
        if ( k==1 ) {
            songVideo = new YoutubeVideo(song,artist,noOfViews,noOfLikes);
        } else {
            songVideo = new YoutubeVideo(song,artist,noOfViews,noOfLikes,releasedYear);
        }
        


        // int x;
        // x = 5;


        // int x = 5;



        
        // if ( k==1 ) {
        //     YoutubeVideo songVideo = new YoutubeVideo(song,artist,noOfViews,noOfLikes);
        // } else {
        //     YoutubeVideo songVideo = new YoutubeVideo(song,artist,noOfViews,noOfLikes,releasedYear);
        // }

    }

}
