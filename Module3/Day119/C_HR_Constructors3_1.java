import java.util.* ;
import java.io.* ;

class YoutubeVideo {

    String song, artist;
    int noOfViews, noOfLikes, releasedYear, n;
    ArrayList<String> comments;
    YoutubeVideo() {
        comments = new ArrayList<String>();
    }

    YoutubeVideo(String song, String artist, int noOfViews, int noOfLikes, int releasedYear, int n, ArrayList<String> comments) {
        this.song = song;
        this.artist = artist;
        this.noOfViews = noOfViews;
        this.noOfLikes = noOfLikes;
        this.releasedYear = releasedYear;
        this.n = n;
        this.comments = comments;
    }

}

class C_HR_Constructors3_1 {

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

        YoutubeVideo songVideo = new YoutubeVideo(
            song,
            artist,
            noOfViews,
            noOfLikes,
            releasedYear,
            n,
            comments
        );

        System.out.println(songVideo.song);
        System.out.println(songVideo.artist);
        System.out.println(songVideo.noOfViews);
        System.out.println(songVideo.noOfLikes);
        System.out.println(songVideo.releasedYear);
        System.out.println(songVideo.n);
        for ( String comment : songVideo.comments ) {
            System.out.println(comment);
        }

    }

}
