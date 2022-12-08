import java.util.* ;
import java.io.* ;

class YoutubeVideo {

    String song, artist;
    int noOfViews, noOfLikes, releasedYear, n;
    ArrayList<String> comments;
    private int impressions;

    YoutubeVideo(String song, String artist, int noOfViews, int noOfLikes, int releasedYear, int n, ArrayList<String> comments, int impressions) {
        this.song = song;
        this.artist = artist;
        this.noOfViews = noOfViews;
        this.noOfLikes = noOfLikes;
        this.releasedYear = releasedYear;
        this.n = n;
        this.comments = comments;
        this.impressions = impressions;
    }

    void getImpressions() {
        System.out.println(this.impressions);
    }

    private int calculateRank() {
        if ( this.noOfLikes + this.impressions > 10000 ) {
            return 1;
        }
        else if ( this.noOfLikes + this.impressions > 5000 ) {
            return 2;
        }
        else if ( this.noOfLikes + this.impressions > 1000 ) {
            return 3;
        } 
        else if ( this.noOfLikes == 0 ) {
            return 4;
        }
        return 0;
    }

    void printRank() {
        System.out.println(this.calculateRank());
    }

}

class C_HR_PublicPrivateProperty3_1 {

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

        int impressions = sc.nextInt();
        
        YoutubeVideo songVideo = new YoutubeVideo(
            song,
            artist,
            noOfViews,
            noOfLikes,
            releasedYear,
            n,
            comments,
            impressions
        );
        
        songVideo.getImpressions();
        songVideo.printRank();

    }

}
