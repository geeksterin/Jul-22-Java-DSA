import java.util.* ;
import java.io.* ;

class YoutubeVideo {

    String song, artist;
    int noOfViews, noOfLikes, releasedYear;
    ArrayList<String> comments;

    YoutubeVideo(String song, String artist, int noOfViews, int noOfLikes, int releasedYear, ArrayList<String> comments) {
        this.song = song;
        this.artist = artist;
        this.noOfViews = noOfViews;
        this.noOfLikes = noOfLikes;
        this.releasedYear = releasedYear;
        this.comments = comments;
    }

    void printTempRank() {
        System.out.println("Method of youtubeVideo class. Also can not find the rank right now.");
    }

}

class ShortVideo extends YoutubeVideo {

    ShortVideo(String song, String artist, int noOfViews, int noOfLikes, int releasedYear, ArrayList<String> comments) {
        super(song, artist, noOfViews, noOfLikes, releasedYear, comments);
    }

}

class D_HR_MethodOverriding3_1 {

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

        ShortVideo video = new ShortVideo(song, artist, noOfViews, noOfLikes, releasedYear, comments);

        video.printTempRank();

    }

}
